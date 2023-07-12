package cn.cheungchingyin.pattern.builder;

/**
 * 鸡肉汉堡
 * <p>
 * 根据 Burger 进行扩展
 *
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
