package com.company.November14th;

public class Daniloparents {
    public static void main(String[] args) {
        Daniloparents dan=new mysister();
        dan.eat();
        dan=new mybrother();
        dan.eat();
    }

    void eat()
    {
        System.out.println("My parents like to eat Turkish food");
    }
}
class mysister extends Daniloparents{

    void eat()
    {
        System.out.println("My sister like to eat Turkish food");

    }
}
class mybrother extends Daniloparents{

    void eat()
    {
        System.out.println("My brother like to eat Turkish food, as well");

    }
}