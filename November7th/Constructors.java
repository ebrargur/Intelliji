package com.company.November7th;

public class Constructors {

 int number;
 String name;
 char character;
 Constructors(){
     System.out.println("I will be called");
 }


 void print()
{
    System.out.println("Number"+number+"name"+name+"character"+character);

}
public static void main(String[] args)
{
Constructors constructors=new Constructors();
//constructors.print();
//constructors.character='A';

}

}
