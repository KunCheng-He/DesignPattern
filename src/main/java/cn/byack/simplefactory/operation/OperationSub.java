package cn.byack.simplefactory.operation;

public class OperationSub implements Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
