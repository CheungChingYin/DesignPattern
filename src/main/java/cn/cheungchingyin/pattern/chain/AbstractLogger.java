package cn.cheungchingyin.pattern.chain;

/**
 * @Author 张正贤
 * @Date 2023/5/23 0:45
 * @Version 1.0
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    /**
     * 【重点】 设置链子中的下一个元素，从而串成链
     *
     * @param nextLogger v下一元素
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 写日志
     *
     * @param level   日志等级
     * @param message 日志信息
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        // 【重点】此处继续往下一段链子找了，直到链子尾部
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 【重点】此方法在继承后需要重写
     *
     * @param message
     */
    abstract protected void write(String message);

}