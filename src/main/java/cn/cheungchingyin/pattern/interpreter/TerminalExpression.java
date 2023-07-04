package cn.cheungchingyin.pattern.interpreter;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:05
 * @Version 1.0
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        // 用于判断的表达式
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
