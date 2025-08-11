package cn.byack.decoratorpattern;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 牛奶";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
