package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 正方形具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:26
 * @Version 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
