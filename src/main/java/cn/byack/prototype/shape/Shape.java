package cn.byack.prototype.shape;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型模式：抽象形状类
 * 实现Cloneable接口，以提供基本的克隆方法
 */
abstract class Shape implements Cloneable {
    @Getter
    @Setter
    private String id;  // 形状的唯一标识
    protected String type;  // 形状

    // 抽象方法，由具体形状实现绘制功能
    abstract void draw();

    /**
     * 原型模式的核心，创建并返回当前对象的副本
     * 重写clone方法，返回一个对象
     * @return 浅拷贝对象
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
        return clone;
    }
}
