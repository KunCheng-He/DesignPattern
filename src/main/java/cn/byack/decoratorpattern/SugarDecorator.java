package cn.byack.decoratorpattern;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 糖";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
