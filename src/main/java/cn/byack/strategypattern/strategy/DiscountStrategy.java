package cn.byack.strategypattern.strategy;

public interface DiscountStrategy {
    /**
     * 获取折扣金额
     * @param amount 订单金额
     * @param otherParams 其他参数
     * @return 折扣金额
     */
    double getDiscountAmount(double amount, double... otherParams);
}
