package com.company.November14th;
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
public class HW3_overload {
   public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void add(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        add(3,4);
        add(4,6,2);
        add(5,8,7);
    }
}
