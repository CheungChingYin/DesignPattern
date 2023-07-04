package cn.cheungchingyin.pattern.template;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:23
 * @Version 1.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 模板
     * 【重点】这里就是像模板一样，我并不关注你的具体实现，我只要知道需要调用该方法即可，具体实现由对应的new的实例变量来决定
     */
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
