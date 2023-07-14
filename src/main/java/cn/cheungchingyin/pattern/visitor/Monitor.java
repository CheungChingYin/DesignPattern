package cn.cheungchingyin.pattern.visitor;

/**
 * 屏幕具体实现
 * 计算机部件接口具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:55
 * @Version 1.0
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
