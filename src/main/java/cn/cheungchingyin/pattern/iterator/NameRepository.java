package cn.cheungchingyin.pattern.iterator;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:46
 * @Version 1.0
 */
public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    /**
     * 获得迭代器
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 【重点】内部类是名字迭代器的具体实现
     * 为什么使用内部类来实现？
     * 答：实际上是为了能够直接访问到names这个数组，且我们getIterator方法需要返回一个Iterator对象，所以需要使用内部类进行实现
     */
    private class NameIterator implements Iterator {

        /**
         * 游标
         */
        int index;

        @Override
        public boolean hasNext() {
            // 游标小于数组长度，证明有下一位，故返回true
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            // 检查是否有下一位
            if (this.hasNext()) {
                // 获得数组的对象后游标下移
                return names[index++];
            }
            return null;
        }
    }
}
