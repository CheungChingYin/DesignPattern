package cn.cheungchingyin.pattern.visitor;

/**
 * 计算机具体实现（可以视为机箱）
 * 计算机部件接口具体实现
 * @Author 张正贤
 * @Date 2023/7/15 0:56
 * @Version 1.0
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
