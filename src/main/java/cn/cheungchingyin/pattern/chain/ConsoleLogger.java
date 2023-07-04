package cn.cheungchingyin.pattern.chain;

/**
 * @Author 张正贤
 * @Date 2023/5/23 0:46
 * @Version 1.0
 */
public class ConsoleLogger extends AbstractLogger {

    /**
     * 【重点】这里就设置父类的level
     * @param level 日志等级
     */
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
