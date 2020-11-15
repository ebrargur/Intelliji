package com.company.November8th;


import java.awt.print.Book;

public class BookClass {
    /*Write program as a Book class
     that will have instance variables and 2 Constructors.
      While creating an object make sure:*/
String title;
double price;

BookClass(String title)
{
    this.title=title;

}
BookClass(double price)
{
    this.price=price;
}

    public static void main(String args[])
    {
        BookClass first=new BookClass("Harry Potter");
        System.out.println(first.title);
        BookClass second=new BookClass(100.3);
        System.out.println(second.price);

    }
}

