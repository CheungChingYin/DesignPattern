package cn.cheungchingyin.pattern.state;

/**
 * 状态接口
 *
 * @Author 张正贤
 * @Date 2023/7/14 18:09
 * @Version 1.0
 */
public interface State {

    /**
     * 【重点】行为
     * @param context
     */
    public void doAction(Context context);
}
