package cn.cheungchingyin.pattern.filter;

import java.util.List;

/**
 * OR 条件
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:48
 * @Version 1.0
 */

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 【重点】符合 OR 条件的后续处理
     *
     * @param persons 用户列表
     * @return 符合 OR 条件的用户列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        // 根据各自条件进行过滤
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        //【重点】 取两个过滤结果的，将 otherCriteriaItems 不含有的对象放入到 firstCriteriaItems
        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
