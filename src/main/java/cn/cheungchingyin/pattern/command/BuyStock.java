package cn.cheungchingyin.pattern.command;

/**
 * 购买仓储类
 * 订单接口具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:37
 * @Version 1.0
 */
public class BuyStock implements Order {
    private Stock abcStock;

    /**
     * 购买
     * @param abcStock 仓库
     */
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
