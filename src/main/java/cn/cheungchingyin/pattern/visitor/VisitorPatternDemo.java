package cn.cheungchingyin.pattern.visitor;

/**
 * 访问者模式 DEMO
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:56
 * @Version 1.0
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        // 【重点】 这里在外部调用的时候只要指导计算机装载访问者即可，不对外暴露细节
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
