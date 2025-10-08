package com.xxs.creationalPatterns.builder;

public interface Builder {
    void buildPartA();
    void buildPartB();

    Product getResult();
}
