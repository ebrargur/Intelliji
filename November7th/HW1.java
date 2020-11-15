package com.company.November7th;
/*Write a program that will have a constructor:
 one with parameters and second without any parameters.
 Create a separate Test class where you will execute both
  of the constructors 1 by 1.*/

public class HW1 {
    int num;
    String name;
    HW1()
    {
        System.out.println("First Constructor ");
    }
   HW1(int numValue,String nameValue)
   { num=numValue;
   name=nameValue;
   }
}
class HW1R
{
    public static void main(String[] args)
    {
        HW1 obj=new HW1();
        System.out.println(obj.num);
        System.out.println(obj.name);

        HW1 obj2=new HW1(5,"Ebrar");
        System.out.println("Number "+obj2.num+"Name "+obj2.name);
    }

}
