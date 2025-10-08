package com.xxs.structuralPatterns.adapter;
// 适配器类
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();//适配方法
    }
}
