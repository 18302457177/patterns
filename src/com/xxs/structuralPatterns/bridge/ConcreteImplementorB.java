package com.xxs.structuralPatterns.bridge;

public class ConcreteImplementorB implements Implementor{
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB operation");
    }
}
