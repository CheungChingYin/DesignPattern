package cn.cheungchingyin.pattern.decorator;

/**
 * 【重点】实现了 Shape 接口的抽象装饰类
 *
 * @Author 张正贤
 * @Date 2023/7/14 10:51
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    /**
     * 构造方法
     * @param decoratedShape 形状
     */
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
