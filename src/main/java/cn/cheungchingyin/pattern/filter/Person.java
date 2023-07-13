package cn.cheungchingyin.pattern.filter;

/**
 * 用户
 *
 * @Author 张正贤
 * @Date 2023/7/13 17:33
 * @Version 1.0
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
