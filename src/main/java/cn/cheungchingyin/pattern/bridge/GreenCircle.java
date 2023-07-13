package cn.cheungchingyin.pattern.bridge;

/**
 * 画绿色圆圈
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:02
 * @Version 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
