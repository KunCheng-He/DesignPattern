package cn.byack.simplefactory.operation;

public class OperationAdd extends BaseOperation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
