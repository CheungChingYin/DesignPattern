package cn.cheungchingyin.pattern.decorator;

/**
 * 圆形具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 10:50
 * @Version 1.0
 */
public class Circle implements Shape {

    /**
     * 画圆形
     */
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
