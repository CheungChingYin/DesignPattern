package cn.cheungchingyin.pattern.interpreter;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:06
 * @Version 1.0
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    /**
     * 【重点】设置两个表达式
     * @param expr1 表达式1
     * @param expr2 表达式2
     */
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * 【重点】解释器，一般来说有固定的搭配
     * @param context 上下文
     * @return 是否为true
     */
    @Override
    public boolean interpret(String context) {
        // 【重点】且表达式
        return expr1.interpret(context) && expr2.interpret(context);
    }
}