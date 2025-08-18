package cn.byack.prototype;

import cn.byack.prototype.shape.Circle;
import cn.byack.prototype.shape.PrototypeManager;
import cn.byack.prototype.shape.Rectangle;

public class PrototypeTest {
    public static void main(String[] args) {
        // 加载原型对象到缓存中
        PrototypeManager.loadCache();

        // 克隆并使用原型对象1
        Circle circle = (Circle) PrototypeManager.getShape("1");
        circle.setId("5");
        circle.draw();

        // 克隆并使用原型对象2
        Rectangle rectangle = (Rectangle) PrototypeManager.getShape("2");
        rectangle.setId("6");
        rectangle.draw();
    }
}
