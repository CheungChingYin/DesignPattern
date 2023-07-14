package cn.cheungchingyin.pattern.strategy;

/**
 * 策略接口
 *【重点】 需要统一的策略接口
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:58
 * @Version 1.0
 */
public interface Strategy {

    /**
     * 计算操作
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return 计算结果
     */
    public int doOperation(int num1, int num2);
}
