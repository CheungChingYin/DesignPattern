package cn.cheungchingyin.pattern.abstractFactory;

/**
 * 蓝色填充具体实现
 *
 * @Author 张正贤
 * @Date 2023/7/15 0:27
 * @Version 1.0
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
