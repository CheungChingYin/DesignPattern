package cn.cheungchingyin.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性标准
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:35
 * @Version 1.0
 */

public class CriteriaFemale implements Criteria {


    /**
     * 过滤符合为女性的用户列表
     *
     * @param persons 用户列表
     * @return 过滤符合为女性的用户列表
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
