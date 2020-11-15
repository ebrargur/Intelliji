package com.company.November14th;
//Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
public class Programming {
    public static void main(String[] args) {
        Programming obj=new Programming();
        obj.message();
        obj.message("Java");
        obj.message("I love rabbits");
    }
    void message()
    {
        System.out.println("I love programming languages");
    }
    void message(String x)
    {
        System.out.println("I love"+x);
    }
}
