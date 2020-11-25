package com.company.November22;

public class Square implements Shape {
    private static final double PI = 3.14;

    @Override
    public double calculatearea() {
      int area;
      area=side*side;
return area;
    }

    @Override
    public double calculateperimeter() {
int perimeter;
perimeter=side*side*side*side;
return perimeter;
    }
}
