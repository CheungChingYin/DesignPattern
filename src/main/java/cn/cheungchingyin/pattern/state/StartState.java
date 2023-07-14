package cn.cheungchingyin.pattern.state;

/**
 * 开始状态
 *
 * @Author 张正贤
 * @Date 2023/7/14 18:09
 * @Version 1.0
 */
public class StartState implements State {

    /**
     * 【重点】 开始行为
     * @param context 上下文
     */
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        // 【重点】除了做其他操作外，还需要更新上下文的状态
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
