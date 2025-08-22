package cn.byack.templatemethod.pack;

public class Tea extends Beverage {
    /**
     * 冲泡茶
     */

    // 冲泡
    @Override
    public void brew() {
        System.out.println("洗茶，泡茶");
    }

    // 加入调料
    @Override
    public void addCondiments() {
        System.out.println("加入柠檬(通义要加的，和我无关)");
    }
}
