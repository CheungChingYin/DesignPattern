package cn.cheungchingyin.pattern.builder;

/**
 * 包装纸类
 * 打包接口的实现
 *
 * @Author 张正贤
 * @Date 2023/7/7 16:03
 * @Version 1.0
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
