package cn.z2huo.knowledge.basic.reflect.entity;

public abstract class Shape<T> {

    T desc;

    public abstract void draw();

    public T getDesc() {
        return desc;
    }

    public void setDesc(T desc) {
        this.desc = desc;
    }
}
