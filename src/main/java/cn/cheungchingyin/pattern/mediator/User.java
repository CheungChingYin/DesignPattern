package cn.cheungchingyin.pattern.mediator;

/**
 * @Author 张正贤
 * @Date 2023/5/23 1:41
 * @Version 1.0
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        // 【重点】聊天室发送消息
        ChatRoom.showMessage(this,message);
    }
}
