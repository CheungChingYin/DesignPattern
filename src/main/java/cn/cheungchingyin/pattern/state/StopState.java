package cn.cheungchingyin.pattern.state;

/**
 * 暂停状态
 *
 * @Author 张正贤
 * @Date 2023/7/14 18:10
 * @Version 1.0
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
