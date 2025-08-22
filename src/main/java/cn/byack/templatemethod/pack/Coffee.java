package cn.byack.templatemethod.pack;

public class Coffee extends Beverage {
    /**
     * 咖啡冲泡
     */

    // 冲泡
    @Override
    public void brew() {
        System.out.println("垫过滤纸，装入咖啡粉，加水滤出咖啡液");
    }

    // 加料
    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
