package cn.byack.prototype.shape;

import java.util.Hashtable;

/**
 * 原型模式：原型管理器
 * 负责创建和管理原型对象，提供获取克隆对象的方法
 */
public class PrototypeManager {
    // 使用Hashtable存储原型对象，key为ID，value为具体的形状对象
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * 根据ID获取原型对象的克隆
     * @param shapeId 形状ID
     * @return 克隆后的形状对象
     */
    public static Shape getShape(String shapeId) {
        return (Shape) shapeMap.get(shapeId).clone();
    }

    /**
     * 初始化缓存，加载原型对象
     * 在实际应用中，这些对象可能来自数据库或其他数据源
     */
    public static void loadCache() {
        // 创建圆形原型对象并加入缓存
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        // 创建矩形原型对象并加入缓存
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
