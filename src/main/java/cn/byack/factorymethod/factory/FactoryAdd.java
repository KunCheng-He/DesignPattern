package cn.byack.factorymethod.factory;

import cn.byack.factorymethod.product.Operation;
import cn.byack.factorymethod.product.OperationAdd;

public class FactoryAdd implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
