package com.xxs.structuralPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();// 通过适配器调用
    }
}
