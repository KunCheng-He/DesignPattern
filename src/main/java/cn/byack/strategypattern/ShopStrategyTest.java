package cn.byack.strategypattern;

public class ShopStrategyTest {
    public static void main(String[] args) {
        ShopContext shopContext = new ShopContext("满减");
        double money = shopContext.getDiscountAmount(630, 300, 15);
        System.out.printf("折扣金额为：%.2f", money);
    }
}
