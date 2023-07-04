package cn.cheungchingyin.pattern.template;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:24
 * @Version 1.0
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
