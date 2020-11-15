package com.company.Studying;

import java.util.Scanner;

public class Passingparameterstomethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Please enter the first number");
        num1=scan.nextInt();
        System.out.println("Please enter the second number");
        num2=scan.nextInt();
        int answer=compare(num1,num2);
        System.out.println("The larger number is "+ answer);
    }

    public static int compare(int x,int y)
    {
        if(x>y)

            return x;
            else
                return y;


    }
}
