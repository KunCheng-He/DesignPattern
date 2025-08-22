package cn.byack.templatemethod.pack;

public abstract class Beverage {
    /**
     * 制作饮品的抽象类（烧水，冲泡，添加调味品，装杯）
     */

    // 模板方法
    public final void makeBeverage(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
        System.out.println("制作完成");
    }

    // 1. 烧水
    private void boilWater(){
        System.out.println("1. 烧水");
    }

    // 2. 冲泡（抽象）
    abstract void brew();

    // 3. 添加调味品（抽象）
    abstract void addCondiments();

    // 4. 装杯
    private void pourInCup(){
        System.out.println("4. 装杯");
    }
}
