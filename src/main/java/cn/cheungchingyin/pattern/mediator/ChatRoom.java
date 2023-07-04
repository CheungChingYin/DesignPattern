package cn.cheungchingyin.pattern.mediator;

import java.util.Date;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:40
 * @Version 1.0
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
