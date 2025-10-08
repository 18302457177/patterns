package com.xxs.creationalPatterns.prototype;

// 具体原型类
public class ConcretePrototype implements Prototype{

    private String data;

    public ConcretePrototype (String data){
        this.data = data;
    }

    // 使用浅拷贝
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
