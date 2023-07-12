package cn.cheungchingyin.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 【重点】
 * 可以看作是订单类
 * 用于记录订单情况
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:05
 * @Version 1.0
 */
public class Meal {

    /**
     * 用于存储食品信息的列表
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * 添加食品
     *
     * @param item 食品信息
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 总计金额
     *
     * @return 总计金额
     */
    public float getCost() {
        float cost = 0.0f;
        // 遍历食品信息列表并金额进行累加
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示已添加的食物
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
