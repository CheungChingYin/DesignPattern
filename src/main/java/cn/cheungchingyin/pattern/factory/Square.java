package cn.cheungchingyin.pattern.factory;

/**
 * @Author 张正贤
 * @Date 2023/5/22 22:06
 * @Version 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}