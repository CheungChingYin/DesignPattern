package cn.cheungchingyin.pattern.interpreter;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:06
 * @Version 1.0
 */
public class InterpreterPatternDemo {
    /**
     * 【重点】设置规则：Robert 和 John 是男性
     * @return
     */
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        //【重点】 OrExpression的interpret方法和TerminalExpression的interpret方法实现是不一样的
        return new OrExpression(robert, john);
    }

    /**
     * 【重点】设规则：Julie 是一个已婚的女性
     * @return
     */
    public static Expression getMarriedWomanExpression(){
        // 【重点】注入表达式条件
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        //【重点】 AndExpression的interpret方法和TerminalExpression的interpret方法实现是不一样的
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        // 获得表达式
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        // 【注意】这里的"Married Julie" 如果少了一个单词都会为false
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));

    }

}
