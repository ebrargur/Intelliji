package com.company.Studying;
//How to use constructors with methods
    public class Car{
        String model;
        double price;
        int quantity;

        Car(String modelvalue,int quantityvalue,double pricevalue){
            this.model=modelvalue;
            this.price=pricevalue;
            this.quantity=quantityvalue;
        }


        void carStockValue()
        {
            double total;

            System.out.println(model+" Stock Value "+quantity*price);

        }
    }

class Main {

    public static void main(String[] args)
    {
        Car car1=new Car("Toyota 2019 ",25000,100);
        car1.carStockValue();
        Car car2=new Car("BMW 2019 ",65298,10.0);
        car2.carStockValue();

    }

}