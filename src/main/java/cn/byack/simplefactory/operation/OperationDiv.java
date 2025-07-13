package cn.byack.simplefactory.operation;

public class OperationDiv implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return numberA / numberB;
    }
}
