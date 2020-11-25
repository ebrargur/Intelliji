package com.company.Studying;

public class CarnewMain {
    public static void main(String[] args) {
        Carnew carobj=new Carnew("blue","Lexus",6);
        Carnew carobj2=new Carnew();
        Carnew carobj3=new Carnew("Siyah","MAzda");
carobj.printinfo();
carobj2.printinfo();
carobj3.printinfo();
carobj.start();
carobj.stop();
    }
}
