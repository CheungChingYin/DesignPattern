package cn.cheungchingyin.pattern.singleton;

/**
 * @Author 张正贤
 * @Date 2023/5/22 21:48
 * @Version 1.0
 */
public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject() {
    }

    /**
     * 获取唯一可用的对象
     *
     * @return 返回实例
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * 输出信息
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
