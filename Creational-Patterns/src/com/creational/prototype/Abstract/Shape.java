package com.creational.prototype.Abstract;

/**
 * @author lgy
 * @version 1
 * @description 形状抽象父类
 * @date 2019/8/15 19:32
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    public String getType() {
        return type;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    //实现克隆，浅拷贝
    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
