package cn.cheungchingyin.pattern.proxy;

/**
 * @Author 张正贤
 * @Date 2023/5/22 22:46
 * @Version 1.0
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    /**
     * 构造方法，只是有一个记录传入的fileName作用
     * @param fileName
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // 【重点】 通过代理来调用实际的代码，这样用户在调用的时候并不需要知道还要调用RealImage的loadFromDisk方法
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
