package cn.cheungchingyin.pattern.builder;

/**
 * 汉堡类
 * <p>
 * 实现食物条目接口
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:04
 * @Version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
