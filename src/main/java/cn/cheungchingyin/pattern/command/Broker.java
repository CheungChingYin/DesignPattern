package cn.cheungchingyin.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用类
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:37
 * @Version 1.0
 */
public class Broker {

    /**
     * 订单列表
     */
    private List<Order> orderList = new ArrayList<Order>();

    /**
     * 下订单
     * @param order 订单
     */
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 执行订单
     */
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
