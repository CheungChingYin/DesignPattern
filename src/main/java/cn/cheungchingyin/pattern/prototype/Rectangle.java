package cn.cheungchingyin.pattern.prototype;

/**
 * 长方形
 *
 * @Author 张正贤
 * @Date 2023/7/13 15:37
 * @Version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
