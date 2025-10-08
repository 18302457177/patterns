package com.xxs.creationalPatterns.builder;
// 产品类
public class Product {
    private String partA;
    private String partB;

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                '}';
    }

    public Product(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
    }
}
