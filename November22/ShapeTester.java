package com.company.November22;

public class ShapeTester {
    public static void main(String[] args) {
        Shape obj1=new Circle();
        Shape obj2=new Square();
        System.out.println(obj1.calculatearea());
        System.out.println(obj1.calculateperimeter());
        System.out.println(obj2.calculatearea());
        System.out.println(obj2.calculateperimeter());
    }
}
