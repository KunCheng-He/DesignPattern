package cn.byack.decoratorpattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " --- ￥" + coffee.getCost());
        // 先加糖
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " --- ￥" + coffee.getCost());
        // 再加奶
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " --- ￥" + coffee.getCost());
    }
}
