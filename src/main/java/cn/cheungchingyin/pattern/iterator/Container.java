package cn.cheungchingyin.pattern.iterator;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:46
 * @Version 1.0
 */
public interface Container {
    /**
     * 【重点】获得迭代器，需要详细的实现
     * @return 迭代器
     */
    public Iterator getIterator();
}