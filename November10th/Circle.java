package com.company.November10th;

public class Circle extends SecondHW{
    double area;
    Circle(int radius)//constructor
    {
        super(radius);

    }
    void AreaofCircle()//method
    {
        area= 3.14*(radius*radius);
        System.out.println("The radius of circle "+area);

    }

    public static void main(String[] args) {
        Circle obj=new Circle(2);
        obj.AreaofCircle();
    }}
