package cn.byack.templatemethod;

import cn.byack.templatemethod.pack.Beverage;
import cn.byack.templatemethod.pack.Coffee;
import cn.byack.templatemethod.pack.Tea;

public class TemplateMethodTest {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.makeBeverage();
        Beverage tea = new Tea();
        tea.makeBeverage();
    }
}
