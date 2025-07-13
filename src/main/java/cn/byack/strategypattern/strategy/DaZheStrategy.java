package cn.byack.strategypattern.strategy;

public class DaZheStrategy implements DiscountStrategy {
    /**
     * 打折策略
     * @param amount 订单金额
     * @param otherParams 打几折
     * @return 折后金额
     */
    @Override
    public double getDiscountAmount(double amount, double... otherParams) {
        // 验证输入参数
        if (otherParams.length != 1) {
            throw new RuntimeException("输入参数错误");
        }

        // 获取参数
        double discount = otherParams[0];
        // 返回折后金额
        return amount * discount;
    }
}
