package cn.cheungchingyin.pattern.visitor;

/**
 * 【重点】计算机访问具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:56
 * @Version 1.0
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }


    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
