package cn.cheungchingyin.pattern.visitor;

/**
 * 访问者接口
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:56
 * @Version 1.0
 */
public interface ComputerPartVisitor {

    /**
     * 机箱访问
     *
     * @param computer 计算机（机箱）
     */
    public void visit(Computer computer);

    /**
     * 鼠标访问
     *
     * @param mouse 鼠标
     */
    public void visit(Mouse mouse);

    /**
     * 键盘访问
     *
     * @param keyboard 键盘
     */
    public void visit(Keyboard keyboard);

    /**
     * 显示器访问
     *
     * @param monitor 显示器
     */
    public void visit(Monitor monitor);
}
