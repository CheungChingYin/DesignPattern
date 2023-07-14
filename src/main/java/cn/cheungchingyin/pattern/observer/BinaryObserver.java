package cn.cheungchingyin.pattern.observer;

/**
 * 二进制观察者
 *
 * @Author 张正贤
 * @Date 2023/7/14 17:37
 * @Version 1.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新为二进制
     * 可以认为这个方法就是当触发变更后会进行的操作
     */
    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
