package cn.cheungchingyin.pattern.prototype;

/**
 * 图形抽象类
 *
 * @Author 张正贤
 * @Date 2023/7/13 15:37
 * @Version 1.0
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
