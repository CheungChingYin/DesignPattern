package cn.cheungchingyin.pattern.nullobject;

/**
 * 客户抽象类
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:34
 * @Version 1.0
 */
public abstract class AbstractCustomer {

    /**
     * 客户名称
     */
    protected String name;

    /**
     * 是否为空
     * @return 为空返回 true，不为空返回 false
     */
    public abstract boolean isNil();

    /**
     * 获得客户名称
     * @return 客户名称
     */
    public abstract String getName();
}
