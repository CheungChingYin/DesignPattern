package cn.cheungchingyin.pattern.memento;

/**
 * 备忘录对象
 *
 * @Author 张正贤
 * @Date 2023/11/1 21:48
 * @Version 1.0
 */
public class Memento {

    /**
     * 备忘录当前状态
     */
    private String state;

    /**
     * 初始化备忘录，这时候需要设置备忘录的状态
     *
     * @param state 备忘录当前状态
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * 获得备忘录状态
     *
     * @return 备忘录状态
     */
    public String getState() {
        return state;
    }
}
