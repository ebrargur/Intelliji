package com.company.November7th;

public class HW4 {
String studentname;
String address;

HW4(String studentnamevalue, String adressvalue)
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
    HW4 student1=new HW4("Ali","Adress info");
    student1.displayinfo();
}
}
