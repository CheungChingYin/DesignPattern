package cn.cheungchingyin.pattern.builder;

/**
 * @Author 张正贤
 * @Date 2023/7/7 16:04
 * @Version 1.0
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
