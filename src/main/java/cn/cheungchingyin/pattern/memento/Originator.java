package cn.cheungchingyin.pattern.memento;

/**
 * 鼻祖类
 * 可以看作是用于统一备忘操作的类
 *
 * @Author 张正贤
 * @Date 2023/11/1 21:48
 * @Version 1.0
 */
public class Originator {

    /**
     * 备忘状态
     */
    private String state;

    /**
     * 设置备忘状态
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获得当前备忘状态
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * 通过备忘录保存当前备忘状态
     * 可以看作为拍一个快照（但是没有保存快照）的操作
     *
     * @return
     */
    public Memento saveStateToMemento() {
        // 【重点】这里每次保存状态的时候都是new一个Memento对象，是因为每次快照的状态不一样，都需要以一个新对象进行保存
        return new Memento(state);
    }

    /**
     * 获得备忘录当前状态
     *
     * @param Memento 备忘录对象
     */
    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
