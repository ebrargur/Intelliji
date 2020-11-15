package com.company.November8th;


public class Task1 {
    String studentname;
    String address;

    Task1(String studentnamevalue, String adressvalue)
    {
        this.studentname=studentnamevalue;
        this.address=adressvalue;
    }
    void displayinfo()
    {
        System.out.print("Student Name "+studentname +address);

    }
    public static void main(String args)
    {
        Task1 student1 = new Task1("Ali", "Adress info");
        student1.displayinfo();
        Task1 student2=new Task1("Ebrar","Adress info");
        student2.displayinfo();
    }
}
