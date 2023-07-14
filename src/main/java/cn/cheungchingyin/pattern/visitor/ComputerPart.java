package cn.cheungchingyin.pattern.visitor;

/**
 * 【重点】计算机部件接口
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:55
 * @Version 1.0
 */
public interface ComputerPart {

    /**
     * 部件插入（访问）
     * @param computerPartVisitor 访问部件
     */
    public void accept(ComputerPartVisitor computerPartVisitor);
}
