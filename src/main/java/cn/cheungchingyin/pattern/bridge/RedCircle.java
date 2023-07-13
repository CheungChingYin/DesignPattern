package cn.cheungchingyin.pattern.bridge;

/**
 * 画红色圆圈
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:01
 * @Version 1.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
