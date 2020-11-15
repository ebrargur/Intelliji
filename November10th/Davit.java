package com.company.November10th;

public class Davit extends Parent{
    Davit(){
        System.out.println("From Davit Constructor");
    }
Davit(int money)
{
    super(money);
    System.out.println("Money pass to Davit");

}
    public static void main(String[] args) {
       Davit davit=new Davit(10000);
davit.print();
    }
}
