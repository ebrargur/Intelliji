package com.company.November7th;
/*
*Write a program  that will have 4 different access
* levels of constructors and create 3 objects of
* this class: 1 - inside same class; 2 -
* from outside the class; 3 - from different
*  class inside different package  and observe result.
*
* */
public class HW3
{
    public String name;

    public int age;
    public double salary;

   public HW3 (String name)
    {
        this.name=name;
    }
    public HW3 (int age)
    {
        this.age=age;
    }
  public HW3(double salary)
   {
       this.salary=salary;
   }



    public static void main(String args[])
    {
        HW3 obj = new HW3("Ebrar");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);
        HW3 obj1 = new HW3(5);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.salary);
        HW3 obj2 = new HW3(100.4);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.salary);
    }
}

