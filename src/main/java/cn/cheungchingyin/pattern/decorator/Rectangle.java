package cn.cheungchingyin.pattern.decorator;

/**
 * 长方形具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 10:50
 * @Version 1.0
 */
public class Rectangle implements Shape {

    /**
     * 画长方形
     */
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
