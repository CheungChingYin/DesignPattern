package cn.cheungchingyin.pattern.mediator;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:41
 * @Version 1.0
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
