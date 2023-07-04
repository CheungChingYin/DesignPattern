package cn.cheungchingyin.pattern.template;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:23
 * @Version 1.0
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
