package cn.byack.simplefactory.operation;

public class OperationSub extends BaseOperation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
