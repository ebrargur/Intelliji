package com.company.November8th;

public class Students {

  String name;

   String address;
Students(String namevalue,String addressvalue)
{
    this.name=namevalue;
    this.address=addressvalue;

}

void displayvalue()
{
    System.out.println(name+address);
}
public static void main(String[] args)
{
    Students student=new Students("Ebrar","address information");
    student.displayvalue();
}
}
