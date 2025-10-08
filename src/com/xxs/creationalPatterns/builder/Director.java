package com.xxs.creationalPatterns.builder;
// 指导者类
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPartA();
        builder.buildPartB();
    }
}
