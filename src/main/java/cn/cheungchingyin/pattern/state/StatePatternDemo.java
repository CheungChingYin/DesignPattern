package cn.cheungchingyin.pattern.state;

/**
 * 状态模式 DEMO
 *
 * @Author 张正贤
 * @Date 2023/7/14 18:10
 * @Version 1.0
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        // 初始化上下文
        Context context = new Context();
        // 设置上下文
        StartState startState = new StartState();
        startState.doAction(context);
        // 【重点】 注意上方设置为了启动状态，然后这里获得上下问的时候也是启动状态
        System.out.println(context.getState().toString());

        // 设置上下文
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
