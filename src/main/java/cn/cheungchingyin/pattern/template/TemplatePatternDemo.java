package cn.cheungchingyin.pattern.template;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:24
 * @Version 1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        // 【重点】 注意这里是new Cricket对象，故在play的时候也是调用Cricket的具体实现
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
