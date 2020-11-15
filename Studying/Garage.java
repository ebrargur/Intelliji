package com.company.Studying;

public class Garage {
    public static void main(String[] args) {
       Car car1=new Car();//how to create an object int class
       car1.numberofdoors=4;
       car1.color="Blue";
       car1.size=5;
       car1.make="BMW";

       Car car2=new Car();
       car2.numberofdoors=6;
       car2.color="Pink";
       car2.size=7;
       car2.make="Mercedez";

        System.out.println("first car "+car1.make);
        System.out.println("second car "+car2.make);
    }
}
