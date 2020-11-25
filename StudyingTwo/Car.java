package com.company.StudyingTwo;

public class Car {
    public String model;
   public String color;
   public int doors;
    Car(String model,String color,int doors)
    {
        this.model = model;
        this.color = color;
        this.doors = doors;
    }
    public void printInfo()
    {
        System.out.println("Arabanin ozellikleri "+model+color+doors);
    }
}
