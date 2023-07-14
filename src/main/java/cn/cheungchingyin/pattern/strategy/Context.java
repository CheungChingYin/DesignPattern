package cn.cheungchingyin.pattern.strategy;

/**
 * 【重点】上下文
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:59
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;

    /**
     * 构造方法，初始化的时候设置策略
     * @param strategy 策略
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 【重点】执行策略
     * @param num1 数字1
     * @param num2 数字2
     * @return 运算结果
     */
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
