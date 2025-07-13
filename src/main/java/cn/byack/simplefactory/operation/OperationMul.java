package cn.byack.simplefactory.operation;

public class OperationMul implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
