package cn.cheungchingyin.pattern.observer;

/**
 * 十六进制观察者
 *
 * @Author 张正贤
 * @Date 2023/7/14 17:37
 * @Version 1.0
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        // 【重点】这里将观察者注册进主题的观察者列表中
        this.subject.attach(this);
    }

    /**
     * 更新为十六进制
     * 可以认为这个方法就是当触发变更后会进行的操作
     */
    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
