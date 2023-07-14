package cn.cheungchingyin.pattern.command;

/**
 * 仓库
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:36
 * @Version 1.0
 */
public class Stock {

    /**
     * 名称
     */
    private String name = "ABC";
    /**
     * 数量
     */
    private int quantity = 10;

    /**
     * 购买
     */
    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    /**
     * 售卖
     */
    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}
