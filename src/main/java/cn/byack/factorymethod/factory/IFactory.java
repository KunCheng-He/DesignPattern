package cn.byack.factorymethod.factory;

import cn.byack.factorymethod.product.Operation;

public interface IFactory {
    Operation createOperation();
}
