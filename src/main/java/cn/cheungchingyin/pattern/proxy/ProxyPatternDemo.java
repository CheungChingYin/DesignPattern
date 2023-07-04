package cn.cheungchingyin.pattern.proxy;

/**
 * @Author 张正贤
 * @Date 2023/5/22 22:47
 * @Version 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 【重点】用户就不必知道还要调用调用RealImage的loadFromDisk方法，只要知道display即可
        image.display();
    }
}
