package cn.cheungchingyin.pattern.faced;

/**
 * 外观模式 DEMO
 * @Author 张正贤
 * @Date 2023/7/14 15:55
 * @Version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
