package cn.cheungchingyin.pattern.prototype;

/**
 * @Author 张正贤
 * @Date 2023/7/13 15:38
 * @Version 1.0
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
