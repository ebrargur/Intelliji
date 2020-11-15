package com.company.November11th;

public class MethodOverriding {
   public void print()
    {
        System.out.println("print with no arguments");
    }
    public void print(String name,int number)
    {
        System.out.println("Print these methods"+name+number);
    }
   public void print(int number,String name)
    {
        System.out.println("Print with different place"+number+name);
    }
public void print(int number,String name,String lastname)
{
    System.out.println("adding another parame"+number+name+lastname);
//return "name";return type is not part of the method signature
}
    public static void main(String[] args) {
        MethodOverriding obj=new MethodOverriding();
           obj.print();
           obj.print("name",3848);
           obj.print(83838,"name");
           obj.print(34,"fvfv0","fvfv");
   }

}
