package cn.cheungchingyin.pattern.nullobject;

/**
 * @Author 张正贤
 * @Date 2023/7/14 23:35
 * @Version 1.0
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    /**
     * 【重点】注意这里是对比 names 数组里面的名字，如果对不上就返回空
     * 对的上就返回真是客户对象
     * @param name 用户名称
     * @return
     */
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

