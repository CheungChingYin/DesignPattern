package cn.cheungchingyin.pattern.composite;

/**
 * @Author 张正贤
 * @Date 2023/7/13 23:29
 * @Version 1.0
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        // CEO
        Employee CEO = new Employee("John","CEO", 30000);
        // 首席销售
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        // 首席市场
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        // 办事员1
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        // 办事员2
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        // 销售执行人1
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        // 销售执行人2
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        // CEO 添加下属
        CEO.add(headSales);
        CEO.add(headMarketing);
        // 首席销售添加下属
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        // 首席市场添加下属
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
