package com.company.November14th;
//Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
public class HW4withprivateOverload {
    private void add(int a,int b)
    {
        System.out.println(a+b);
    }
    private void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
   private void add(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        HW4withprivateOverload obj=new HW4withprivateOverload();
        obj.add(3,4);
        obj.add(4,6,2);
        obj.add(5,8,7);
    }
}
