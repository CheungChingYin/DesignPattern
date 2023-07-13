package cn.cheungchingyin.pattern.adapter;

/**
 * VLC 播放
 *
 * @Author 张正贤
 * @Date 2023/7/13 16:02
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
