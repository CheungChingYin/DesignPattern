package cn.cheungchingyin.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录储存容器
 *
 * @Author 张正贤
 * @Date 2023/11/1 21:48
 * @Version 1.0
 */
public class CareTaker {
    /**
     * 用于存储备忘录状态的容器（可以看作为虚拟机的快照）
     * 【重点】这里其实也用到的原型模式
     */
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * 新增快照（备忘录）
     * @param state
     */
    public void add(Memento state) {
        mementoList.add(state);
    }

    /**
     * 获得快照（备忘录
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
