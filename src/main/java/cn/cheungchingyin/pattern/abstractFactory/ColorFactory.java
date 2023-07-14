package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 颜色工厂
 *
 * 继承自抽象工厂
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:29
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
