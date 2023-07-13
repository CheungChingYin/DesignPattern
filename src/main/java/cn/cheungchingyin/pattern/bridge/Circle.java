package cn.cheungchingyin.pattern.bridge;

/**
 * 圆圈---图形抽象类的具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:03
 * @Version 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
