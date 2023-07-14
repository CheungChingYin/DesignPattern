package cn.cheungchingyin.pattern.strategy;

/**
 * 相乘运算策略实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:59
 * @Version 1.0
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
