package cn.cheungchingyin.pattern.interpreter;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:05
 * @Version 1.0
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        // 【重点】或表达式
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
