package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 【重点】抽象工厂
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:27
 * @Version 1.0
 */
public abstract class AbstractFactory {

    /**
     * 【重点】获得颜色
     *
     * @param color 颜色
     * @return 颜色对象
     */
    public abstract Color getColor(String color);

    /**
     * 【重点】获得形状
     *
     * @param shape 形状
     * @return 形状对象
     */
    public abstract Shape getShape(String shape);
}
