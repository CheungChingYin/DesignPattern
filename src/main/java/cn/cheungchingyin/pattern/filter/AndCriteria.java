package cn.cheungchingyin.pattern.filter;

import java.util.List;

/**
 * AND 条件
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:47
 * @Version 1.0
 */

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 【重点】 AND 条件的后续处理
     *
     * @param persons 用户列表
     * @return 符合 AND 条件的用户列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        // 先根据第一个条件进行过滤
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        // 【重点】根据第二个条件进行过滤
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
