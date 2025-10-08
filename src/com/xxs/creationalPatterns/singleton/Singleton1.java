package com.xxs.creationalPatterns.singleton;

public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){
        if (INSTANCE!=null){
            throw new RuntimeException("实例已存在");
        }
    }

    public Singleton1 getInstance(){
        return INSTANCE;
    }
}
