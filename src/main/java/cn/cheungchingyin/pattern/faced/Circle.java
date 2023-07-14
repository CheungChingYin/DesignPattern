package cn.cheungchingyin.pattern.faced;

/**
 * 圆形具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/14 15:54
 * @Version 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
