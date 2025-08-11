package cn.byack.decoratorpattern;

public class BaseCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "基础咖啡";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
