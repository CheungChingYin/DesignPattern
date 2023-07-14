package cn.cheungchingyin.pattern.command;

/**
 * 命令模式 DEMO
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:38
 * @Version 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        // 购买
        BuyStock buyStockOrder = new BuyStock(abcStock);
        // 出售
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        // 添加命令
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        // 【重点】执行
        broker.placeOrders();
    }
}
