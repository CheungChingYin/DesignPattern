package cn.cheungchingyin.pattern.chain;

/**
 * @Author 张正贤
 * @Date 2023/5/23 0:47
 * @Version 1.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
