package cn.byack.simplefactory.operation;

public class OperationAdd implements  Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
