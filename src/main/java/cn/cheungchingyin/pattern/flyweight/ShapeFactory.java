package cn.cheungchingyin.pattern.flyweight;

import java.util.HashMap;

/**
 * 图形工厂
 *
 * @Author 张正贤
 * @Date 2023/7/14 16:17
 * @Version 1.0
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        // 【重点】 当 Map 没有相关对象的时候创建并返回一个对象
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
