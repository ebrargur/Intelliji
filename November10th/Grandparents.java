package com.company.November10th;

public class Grandparents {
    int money;
    Grandparents()
    {
        System.out.println("Constructor from Grandparents");
    }
    Grandparents(int money)
    {
        this.money=money;
        System.out.println("Constructor from Grandparents to Initilize money");
    }
    void print()
    {
        System.out.println("I have this money"+money);
    }
}
