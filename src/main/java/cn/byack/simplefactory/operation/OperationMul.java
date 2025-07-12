package cn.byack.simplefactory.operation;

public class OperationMul extends BaseOperation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
