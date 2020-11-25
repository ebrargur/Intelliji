package com.company.November18th;

public abstract class Vehicle {
    String color;
    static int totalVehicle;
  Vehicle(){
      totalVehicle++;
      System.out.println(" 1 I will be called when ever an object of my child");
     //class will be created using no argument constructor

    }
   Vehicle(String color){
        totalVehicle++;
       this.color=color;
       System.out.println(" ");
   }

public void drive()
{
    System.out.println("2 Vehicle drives");//complete
}
public void stop()
{
    System.out.println("3 Vehicle stops");//complete
}
   public abstract void start();//uncomplete
   public abstract void brake();//uncomplete
}

abstract class Car extends Vehicle{
//can have only one public class in a file
String carType;
Car(String color,String carType)
{
    super(color);
this.carType=carType;

}

    @Override
    public void brake() {
        System.out.println(carType+"have brakes");
    }

}

class Tesla extends Car{
    String make;
    Tesla(String color, String carType,String make) {
        super(color, carType);
        this.make=make;
    }



    @Override
    public void start() {
        System.out.println(make+"Can start remotely");
    }

    @Override
    public void drive() {
        System.out.println("can drive on autopilot");
    }
    public void display()
    {
        System.out.println("Color of car"+color+" color type "+carType+" make "+make);
    }
}
class toyota  extends Car{
String make;
toyota(String color,String carType,String make) {
    super(color, carType);
    this.make = make;
}
    @Override
    public void start() {
        System.out.println(make+"car start without make");
    }
}