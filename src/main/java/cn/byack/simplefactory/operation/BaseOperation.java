package cn.byack.simplefactory.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseOperation {
    private double numberA;
    private double numberB;

    public double getResult() {
        return 0;
    }
}
