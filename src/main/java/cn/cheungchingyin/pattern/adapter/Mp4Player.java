package cn.cheungchingyin.pattern.adapter;

/**
 * MP4 播放
 *
 * @Author 张正贤
 * @Date 2023/7/13 16:02
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
