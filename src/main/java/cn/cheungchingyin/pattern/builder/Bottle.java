package cn.cheungchingyin.pattern.builder;

/**
 * 瓶子类
 * 打包类的实现
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:04
 * @Version 1.0
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
