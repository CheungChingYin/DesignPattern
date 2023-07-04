package cn.cheungchingyin.pattern.iterator;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:46
 * @Version 1.0
 */
public interface Iterator {

    /**
     * 是否存在下一个元素
     *
     * @return 是返回true, 否则返回false
     */
    public boolean hasNext();

    /**
     * 游标指向下一位
     *
     * @return 下一位的对象
     */
    public Object next();
}
