package cn.cheungchingyin.pattern.builder;

/**
 * 可乐类
 * <p>
 * 继承冷饮类
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:05
 * @Version 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
