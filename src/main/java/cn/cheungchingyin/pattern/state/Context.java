package cn.cheungchingyin.pattern.state;

/**
 * 【重点】上下文
 *
 * @Author 张正贤
 * @Date 2023/7/14 18:10
 * @Version 1.0
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    /**
     * 【重点】 设置状态
     * @param state 状态
     */
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
