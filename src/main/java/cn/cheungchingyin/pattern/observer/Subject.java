package cn.cheungchingyin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 *
 * @Author 张正贤
 * @Date 2023/7/14 17:35
 * @Version 1.0
 */
public class Subject {

    /**
     * 观察者列表
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 状态
     */
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 【重点】 设置状态
     * 注意设置状态后还会调用通知所有观察者的方法
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 【重点】添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 【重点】通知所有观察者
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
