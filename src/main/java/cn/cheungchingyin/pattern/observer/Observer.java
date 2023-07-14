package cn.cheungchingyin.pattern.observer;

/**
 * 观察者
 *
 * @Author 张正贤
 * @Date 2023/7/14 17:36
 * @Version 1.0
 */
public abstract class Observer {

    /**
     * 主题
     */
    protected Subject subject;

    /**
     * 更新观察者
     */
    public abstract void update();
}
