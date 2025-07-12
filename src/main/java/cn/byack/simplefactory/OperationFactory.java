package cn.byack.simplefactory;

import cn.byack.simplefactory.operation.*;

public class OperationFactory {
    public static BaseOperation createOperation(String operation) {
        BaseOperation baseOperation = null;
        switch (operation) {
            case "+":
                baseOperation = new OperationAdd();
                break;
            case "-":
                baseOperation = new OperationSub();
                break;
            case "*":
                baseOperation = new OperationMul();
                break;
            case "/":
                baseOperation = new OperationDiv();
                break;
        }
        return baseOperation;
    }
}
