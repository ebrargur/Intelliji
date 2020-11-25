package com.company.Studying;

public class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

Employee()
{

}

    Employee(String namevalue,String lastNameValue,int employeeIdvalue,String startDatevalue,int salaryvalue)
    {
       this.name=namevalue;
       this.lastName=lastNameValue;
       this.employeeId=employeeIdvalue;
       this.startDate=startDatevalue;
       this.salary=salaryvalue;
    }



    void display()
    {
        System.out.println(name+" "+lastName+" "+" "+employeeId+" "+startDate+" "+salary);

    }
}


class Main4 {

    public static void main(String[] args) {
        Employee car1 = new Employee();
        car1.display();
        Employee car2 = new Employee("Joe","Smith",12345,"01/01/1970",35000);
        car2.display();


    }
}
