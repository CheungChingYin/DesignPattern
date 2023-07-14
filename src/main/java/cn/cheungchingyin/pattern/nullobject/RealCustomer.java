package cn.cheungchingyin.pattern.nullobject;

/**
 *  真实客户
 *
 * @Author 张正贤
 * @Date 2023/7/14 23:34
 * @Version 1.0
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
