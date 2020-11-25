package com.company.November22;

public class Circle implements Shape{
    private static final double PI = 2.14;

    @Override
    public double calculatearea() {
        double area;
        area=PI*radius;
        return area;
    }

    @Override
    public double calculateperimeter() {
double perimeter;
perimeter=PI*radius;
return perimeter;
    }
}
