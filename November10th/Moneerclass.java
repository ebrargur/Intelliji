package com.company.November10th;

public class Moneerclass extends SuperKeyword{
    int money;
    Moneerclass(int money)
    {
        super(money);
        System.out.println("From Child ");
    }


    void marry()
    {
        super.marry();
        System.out.println("I will marry katrina "+money);

    }

    public static void main(String[] args) {
        Moneerclass obj=new Moneerclass(1000);
        obj.marry();
//super and this are similar.super refers to parent class
// this keyword for instance variables/
//this is to call your constractors
//super is for parents constructors

    }
}
