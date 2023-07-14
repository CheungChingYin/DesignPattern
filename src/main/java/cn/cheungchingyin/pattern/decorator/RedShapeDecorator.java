package cn.cheungchingyin.pattern.decorator;

/**
 * 【重点】拓展形状装饰器接口
 *
 * @Author 张正贤
 * @Date 2023/7/14 10:51
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        //【重点】 这里重写了画图形方法，拓展了一个画红色边框的功能
        setRedBorder(decoratedShape);
    }

    /**
     * 设置红色边框
     * @param decoratedShape 形状
     */
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
