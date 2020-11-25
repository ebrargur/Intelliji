package com.company.November22;

public class Main {
    public static void main(String[] args) {
        Student printInfo=new Student();//student implemebt by printinfo interface
        printInfo.printName();
        printInfo.printPhoneNumber();
        printInfo.printAddress();
        printInfo.payfee();
        Printinfo printInfo1=new Employee();
        printInfo1.printName();
        printInfo1.printPhoneNumber();
        printInfo1.printAddress();


    }
}
