package cn.cheungchingyin.pattern.builder;

/**
 * 百事类
 * <p>
 * 继承自冷饮类
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:05
 * @Version 1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
