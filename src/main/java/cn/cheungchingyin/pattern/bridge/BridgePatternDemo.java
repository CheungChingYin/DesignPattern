package cn.cheungchingyin.pattern.bridge;

/**
 * @Author 张正贤
 * @Date 2023/7/13 17:03
 * @Version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        // 【重点】注意此处的 new RedCircle()，是为了能够画出不同颜色的圆形
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
