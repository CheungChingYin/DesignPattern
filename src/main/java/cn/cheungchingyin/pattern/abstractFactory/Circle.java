package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 圆形具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:27
 * @Version 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
