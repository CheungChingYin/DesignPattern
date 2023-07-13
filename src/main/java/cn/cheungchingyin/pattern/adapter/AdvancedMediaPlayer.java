package cn.cheungchingyin.pattern.adapter;

/**
 * 高级媒体播放器
 *
 * @Author 张正贤
 * @Date 2023/7/13 16:00
 * @Version 1.0
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放 VLC 媒体文件
     * @param fileName 文件名称
     */
    public void playVlc(String fileName);

    /**
     * 播放 MP4 媒体文件
     * @param fileName 文件名称
     */
    public void playMp4(String fileName);
}
