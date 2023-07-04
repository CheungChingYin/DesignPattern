package cn.cheungchingyin.pattern.iterator;

/**
 * @Author 张正贤
 * @Date 2023/5/22 23:47
 * @Version 1.0
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        /*
         【重点】使用迭代器一般是搭配while循环来实现的，此处使用for循环来实现
         以for(int i = 0;i < 10;i++)为例
         Iterator iter = namesRepository.getIterator() 和int i = 0相类似，获得相应对象
         iter.hasNext() 和i < 10类似，为循环的条件限制
         此处没有和i++一样从操作自增，故为空
         */
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
        /*
        下方为while循环的写法，迭代器使用的时候用其中一种进行循环即可
         */
        Iterator iter = namesRepository.getIterator();
        while (iter.hasNext()) {
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
