package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 【重点】生产工厂
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:29
 * @Version 1.0
 */
public class FactoryProducer {

    /**
     * 获得工厂
     * @param choice 工厂选择
     * @return 工厂对象
     */
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
