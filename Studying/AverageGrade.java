package com.company.Studying;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int grade1;
        int grade2;
        int grade3;
        double average=0;
        System.out.println("Please enter the first grade");
        grade1=scan.nextInt();
        System.out.println("Please enter the second grade");
    grade2=scan.nextInt();
        System.out.println("please enter the third grade");
    grade3=scan.nextInt();

    average=averageprint(grade1,grade2,grade3);
        System.out.println(average);

    }

    public static double averageprint(int x, int y, int z)
    {
        double avg=(x+y+z)/3;
        return avg;
    }

}
