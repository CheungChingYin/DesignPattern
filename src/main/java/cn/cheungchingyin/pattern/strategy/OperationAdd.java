package cn.cheungchingyin.pattern.strategy;

/**
 * 相加运算策略实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:58
 * @Version 1.0
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
