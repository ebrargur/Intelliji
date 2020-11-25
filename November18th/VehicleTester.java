package com.company.November18th;

public class VehicleTester {
    public static void main(String[] args) {

        //  Vehicle vehicle=new Vehicle(); abstract class cant make objects
        // Car
        Vehicle tesla=new Tesla("red","x","90D");
        tesla.start();
        tesla.drive();
        tesla.brake();
        tesla.stop();
        System.out.println("number of vehicles "+Vehicle.totalVehicle);


        new toyota("blue","Toyota","56m");
        System.out.println("Number of vehicles "+Vehicle.totalVehicle);
    }

}
