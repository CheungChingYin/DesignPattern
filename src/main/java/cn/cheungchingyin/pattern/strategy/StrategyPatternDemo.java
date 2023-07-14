package cn.cheungchingyin.pattern.strategy;

/**
 * 策略模式 DEMO
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:59
 * @Version 1.0
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // 【重点】使用相加策略
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        // 使用相减策略
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        // 使用相乘策略
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
