package com.xxs.creationalPatterns.singleton;

/**
 * 静态内部类
 */
public class Singleton6 {
    private Singleton6(){

    }
    private static class SingletonHolder{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
