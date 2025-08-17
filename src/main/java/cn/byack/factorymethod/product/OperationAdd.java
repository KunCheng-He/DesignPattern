package cn.byack.factorymethod.product;

public class OperationAdd implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
