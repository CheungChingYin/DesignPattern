package cn.cheungchingyin.pattern.adapter;

/**
 * 音频播放器
 *
 * @Author 张正贤
 * @Date 2023/7/13 16:03
 * @Version 1.0
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    /**
     * 【重点】 播放文件，既能支持视频播放，也能支持音频播放
     *
     * @param audioType 媒体文件类型
     * @param fileName  文件名
     */
    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
