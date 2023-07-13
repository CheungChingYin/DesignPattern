package cn.cheungchingyin.pattern.adapter;

/**
 * 媒体播放器接口
 *
 * @Author 张正贤
 * @Date 2023/7/13 15:59
 * @Version 1.0
 */
public interface MediaPlayer {
    /**
     * 播放功能
     * @param audioType 媒体文件类型
     * @param fileName 文件名
     */
    public void play(String audioType, String fileName);
}
