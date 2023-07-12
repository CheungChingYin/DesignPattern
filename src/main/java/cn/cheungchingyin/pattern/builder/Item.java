package cn.cheungchingyin.pattern.builder;

/**
 * 食品条目接口
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:02
 * @Version 1.0
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
