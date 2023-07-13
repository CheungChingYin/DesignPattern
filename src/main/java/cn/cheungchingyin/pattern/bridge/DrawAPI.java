package cn.cheungchingyin.pattern.bridge;

/**
 * 画画接口
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:01
 * @Version 1.0
 */
public interface DrawAPI {

    /**
     * 画圆圈
     * @param radius 半径
     * @param x 横坐标
     * @param y 纵坐标
     */
    void drawCircle(int radius, int x, int y);
}
