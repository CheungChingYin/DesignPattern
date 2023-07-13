package cn.cheungchingyin.pattern.prototype;

/**
 * 圆形类
 *
 * @Author 张正贤
 * @Date 2023/7/13 15:38
 * @Version 1.0
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
