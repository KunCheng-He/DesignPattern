package cn.byack.strategypattern.strategy;

public class ManJianStrategy implements DiscountStrategy {
    /**
     * 满减
     * @param amount 订单金额
     * @param otherParams 第一个参数为需要满的金额，第二个参数为需要减的金额（如：满300减100）
     * @return 优惠金额
     */
    @Override
    public double getDiscountAmount(double amount, double... otherParams) {
        // 验证输入参数
        if (otherParams.length != 2) {
            throw new RuntimeException("输入参数错误");
        }

        // 获取参数
        double fullAmount = otherParams[0];
        double reduceAmount = otherParams[1];

        // 返回优惠金额
        return amount >= fullAmount ? (int)(amount / fullAmount) * reduceAmount : 0;
    }
}
