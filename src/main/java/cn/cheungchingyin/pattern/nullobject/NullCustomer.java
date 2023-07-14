package cn.cheungchingyin.pattern.nullobject;

/**
 * 【重点】空客户
 * 这里只是为空数据来做做一层包装而已
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:34
 * @Version 1.0
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
