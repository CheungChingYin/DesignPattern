package cn.cheungchingyin.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性标准
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:34
 * @Version 1.0
 */

public class CriteriaMale implements Criteria {

    /**
     * 过滤符合为男性的用户列表
     *
     * @param persons 用户列表
     * @return 过滤符合为男性的用户列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
