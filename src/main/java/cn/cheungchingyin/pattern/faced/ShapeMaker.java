package cn.cheungchingyin.pattern.faced;

/**
 * 【重点】外观类
 *
 * @Author 张正贤
 * @Date 2023/7/14 15:54
 * @Version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
