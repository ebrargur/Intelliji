package com.company.November7th;
/*
* Write a java program of Class Students that takes
*  students name and 3 subject grades. Inside your class
* also have a method to Calculate Average Grade.
* Test Student class for 5 different students with
*  different marks. Your program should print an average
* mark of each students name.
* */
public class HW2 {
    String studentname;
    int i;
    int i1;
    int i2;

    public HW2(String studentname, int ivalue, int i1value, int i2value) {
        this.studentname = studentname;
        this.i=ivalue;
        this.i1=i1value;
        this.i2=i2value;

    }
void printaverage()
{
    double average=(i+i1+i2)/3;
    System.out.print("Average for "+studentname +average);
}

    public static void main(String[] args)
    {
        HW2 students=new HW2("Ebrar",49,45,90);
        students.printaverage();
        HW2 students2=new HW2("Ali",40,45,90);
        students2.printaverage();
    }
}
