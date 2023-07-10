package cn.cheungchingyin.pattern.builder;

/**
 * @Author 张正贤
 * @Date 2023/7/7 16:05
 * @Version 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
