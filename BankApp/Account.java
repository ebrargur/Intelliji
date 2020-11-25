package com.company.BankApp;

import java.util.Scanner;

public class Account {

    int balance;
    int previoustransaction;
    String username;
    String password;
    Account(String username,String password)
    {
        this.username=username;
        this.password=password;

    }
    public void showinfo()
    {
        //char option='\0';
        System.out.println("Welcome to your Account "+username+" "+password);
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("A:Check your balance");
        System.out.println("B: Make a deposit");
        System.out.println("C: Make a withdrawal");
        System.out.println("D:View previous transaction");
        System.out.println("E:Calculate interest");
        System.out.println("F:Exit");
        System.out.println("");

        Scanner scan=new Scanner(System.in);
  //do {
            System.out.println("Enter an option please");
            char option=scan.next().charAt(0);
        switch (option)
        {
            case 'A':
                System.out.println("========================");
                System.out.println("Current balance of your account $ "+balance);
                break;

            case 'B':
                    System.out.println("Enter an amount to deposit");
                    int amount=scan.nextInt();

                    break;
            case 'C':
                System.out.println("Enter the withdrawn money");
                break;
            case 'D':
                System.out.println("Here is your previous transaction");
                break;
            case 'E':
                System.out.println("Here is your interest");
                break;
            case 'F':
                System.out.println("Thank you");
                break;
            default:
                System.out.println("This option is not available");

        }



  //    }while(scan!='A')
    }



}
