package cn.cheungchingyin.pattern.chain;

/**
 * @Author 张正贤
 * @Date 2023/5/23 0:46
 * @Version 1.0
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
