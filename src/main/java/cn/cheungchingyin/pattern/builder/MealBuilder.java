package cn.cheungchingyin.pattern.builder;

/**
 * @Author 张正贤
 * @Date 2023/7/7 16:06
 * @Version 1.0
 */
public class MealBuilder {

    /**
     * 【重点】添加蔬菜汉堡套餐
     *
     * @return 订单
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 【重点】添加非蔬菜汉堡套餐
     *
     * @return 订单
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
