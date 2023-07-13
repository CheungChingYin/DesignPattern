package cn.cheungchingyin.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 张正贤
 * @Date 2023/7/13 17:49
 * @Version 1.0
 */

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        // 初始化用户列表
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        // 检查是否为男性
        Criteria male = new CriteriaMale();
        // 检查是否为女性
        Criteria female = new CriteriaFemale();
        // 检查是否为单身
        Criteria single = new CriteriaSingle();
        // 检查是否为男性且为单身
        Criteria singleMale = new AndCriteria(single, male);
        // 检查是否为女性且或单身
        Criteria singleOrFemale = new OrCriteria(single, female);
        // 【重点】感受其中的 AND 和 OR 条件的匹配
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
