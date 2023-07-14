package cn.cheungchingyin.pattern.decorator;

/**
 * @Author 张正贤
 * @Date 2023/7/14 10:52
 * @Version 1.0
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        // 【重点】 实际上使用下方两条注释的代码来做调用也可以，这样就能够达到不改变引用类型的情况下使用新的装饰器
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
