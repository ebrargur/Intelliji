package com.company.Studying;

import com.company.November8th.Person;

//1. Create four classes (Person, Employee, Student, Retiree)
//
//* Have properties
//For Person: name(String)
//For Person: lastName(String)
//For Person: age(int)
//For Employee: salary(int)
//For Student: grade(int)
//For Retiree: seniorActivity(String)
//
//At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
//
//Create multilevel inheritance: Person --> Employee --> Student --> Retiree
//
//From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
public class Person1 {
    String name;
    String lastName;
    int age;
    Person1(String name, String lastName, int age) {
       this.name=name;
       this.lastName=lastName;
       this.age=age;
    }
}
class Employee1 extends Person1{
    int salary;

   public Employee1(String name, String lastName, int age,int salaryvalue) {
        super(name, lastName, age);
        this.salary=salaryvalue;
    }




    void print()
{
    System.out.println(super.name+" "+super.lastName+" "+super.age+" "+salary);}

}
class Student1 extends Person1{

    int grade;

    Student1(String name, String lastName, int age,int grade) {
        super(name,lastName,age);
        this.grade=grade;
    }

    void print()
    {

        System.out.println(super.name+" "+super.lastName+" "+super.age+" "+grade);    }

}
class Retiree1 extends Person1{
    String seniorActivity;

    Retiree1(String name, String lastName, int age,String SeniorActivityvalue) {
        super(name, lastName, age);
        this.seniorActivity=SeniorActivityvalue;
    }
  void print()
  {
      System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
  }



}
class Main9
{
    public static void main(String[] args) {
Employee1 first=new Employee1("Joe","Smith",35,35000);
first.print();
Student1 second=new Student1("Adam","Smith",15,10);
second.print();
Retiree1 third=new Retiree1("Frank","Smith",15,"tour");
third.print();
    }


}