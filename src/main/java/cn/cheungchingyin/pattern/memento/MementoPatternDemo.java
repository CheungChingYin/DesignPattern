package cn.cheungchingyin.pattern.memento;

/**
 * 备忘录设计模式
 *
 * @Author 张正贤
 * @Date 2023/11/1 21:49
 * @Version 1.0
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        // 初始化一个可以用于操作备忘的对象
        Originator originator = new Originator();
        // 初始化一个用于保存快照（备忘）的容器
        CareTaker careTaker = new CareTaker();
        // 设置备忘状态
        originator.setState("State #1");
        originator.setState("State #2");
        // 加入到容器中
        careTaker.add(originator.saveStateToMemento());
        // 设置备忘状态
        originator.setState("State #3");
        // 加入到容器中
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        // 显示当前备忘的状态
        System.out.println("Current State: " + originator.getState());
        // 取出第一次保存的备忘对象，并且设置进originator中（以便读取）
        originator.getStateFromMemento(careTaker.get(0));
        // 输出第一次保存的备忘对象内容
        System.out.println("First saved State: " + originator.getState());
        // 取出第二次保存的备忘对象，并且设置进originator中（以便读取）
        originator.getStateFromMemento(careTaker.get(1));
        // 输出第二次保存的备忘对象内容
        System.out.println("Second saved State: " + originator.getState());
    }
}
