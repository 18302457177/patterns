package com.xxs.structuralPatterns.bridge;

public class ConcreteImplementorA implements Implementor{
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorA operation");
    }
}
