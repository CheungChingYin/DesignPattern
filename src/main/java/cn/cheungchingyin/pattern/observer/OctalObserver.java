package cn.cheungchingyin.pattern.observer;

/**
 * 八进制观察者
 *
 * @Author 张正贤
 * @Date 2023/7/14 17:37
 * @Version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新为八进制
     * 可以认为这个方法就是当触发变更后会进行的操作
     */
    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
