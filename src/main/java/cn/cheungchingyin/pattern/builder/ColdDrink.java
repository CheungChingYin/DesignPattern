package cn.cheungchingyin.pattern.builder;

/**
 * 冷饮类
 * <p>
 * 实现食物条目接口
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:04
 * @Version 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
