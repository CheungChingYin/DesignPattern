package cn.cheungchingyin.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工类
 *
 * @Author 张正贤
 * @Date 2023/7/13 23:28
 * @Version 1.0
 */

public class Employee {

    /**
     * 姓名
     */
    private String name;

    /**
     * 部门
     */
    private String dept;

    /**
     * 工资
     */
    private int salary;

    /**
     * 下属
     */
    private List<Employee> subordinates;

    //构造函数
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
