package cn.byack.simplefactory.operation;

public class OperationDiv extends BaseOperation {
    public double getResult() {
        return getNumberB() == 0 ? -1 : getNumberA() / getNumberB();
    }
}
