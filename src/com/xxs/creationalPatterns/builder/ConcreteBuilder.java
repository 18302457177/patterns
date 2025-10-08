package com.xxs.creationalPatterns.builder;

public class ConcreteBuilder implements Builder{

    private String partA;
    private String partB;

    @Override
    public void buildPartA() {
        partA = "part A";
    }

    @Override
    public void buildPartB() {
        partB = "part B";
    }

    @Override
    public Product getResult() {
        return new Product(partA,partB);
    }
}
