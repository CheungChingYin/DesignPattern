package cn.cheungchingyin.pattern.interpreter;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:05
 * @Version 1.0
 */
public interface Expression {
    public boolean interpret(String context);
}
