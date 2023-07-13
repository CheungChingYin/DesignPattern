package cn.cheungchingyin.pattern.filter;

import java.util.List;

/**
 * 标准接口
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:33
 * @Version 1.0
 */

public interface Criteria {

    /**
     * 满足条件后的操作
     *
     * @param persons 用户列表
     * @return 过滤条件
     */
    public List<Person> meetCriteria(List<Person> persons);
}
