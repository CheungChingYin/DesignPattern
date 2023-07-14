package cn.cheungchingyin.pattern.command;

/**
 * 销售仓储类
 * 订单接口具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:37
 * @Version 1.0
 */
public class SellStock implements Order {
    private Stock abcStock;

    /**
     * 售卖
     * @param abcStock 仓库
     */
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
