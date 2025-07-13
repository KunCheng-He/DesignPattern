package cn.byack.strategypattern;

import cn.byack.strategypattern.strategy.DaZheStrategy;
import cn.byack.strategypattern.strategy.DiscountStrategy;
import cn.byack.strategypattern.strategy.ManJianStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopContext {
    private DiscountStrategy discountStrategy;

    public ShopContext(String strategyName) {
        discountStrategy = switch (strategyName) {
            case "满减" -> new ManJianStrategy();
            case "打折" -> new DaZheStrategy();
            default -> throw new IllegalStateException("Unexpected value: " + strategyName);
        };
    }

    /**
     * 获取优惠金额
     * @param amount 商品金额
     * @param otherParams 优惠策略有关的参数
     * @return 优惠金额
     */
    public double getDiscountAmount(double amount, double... otherParams) {
        return discountStrategy.getDiscountAmount(amount, otherParams);
    }
}
