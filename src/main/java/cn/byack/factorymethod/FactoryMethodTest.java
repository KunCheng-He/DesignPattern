package cn.byack.factorymethod;

import cn.byack.factorymethod.factory.FactoryAdd;
import cn.byack.factorymethod.factory.IFactory;
import cn.byack.factorymethod.product.Operation;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new FactoryAdd();
        Operation operation = factory.createOperation();
        System.out.println(operation.getResult(1, 2));
    }
}
