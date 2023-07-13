package cn.cheungchingyin.pattern.bridge;

/**
 * 图形抽象类
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:03
 * @Version 1.0
 */
public abstract class Shape {

    /**
     * 【重点】 此处抽离了 draw ，符合单一工作原则
     */
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
