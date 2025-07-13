package cn.byack.simplefactory;

import cn.byack.simplefactory.operation.*;

public class OperationFactory {
    public static BaseOperation createOperation(String operation) {
        return switch (operation) {
            case "+" -> new OperationAdd();
            case "-" -> new OperationSub();
            case "*" -> new OperationMul();
            case "/" -> new OperationDiv();
            default -> null;
        };
    }
}
