package com.company.Studying;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a season 1-4");
        int season=input.nextInt();
        if(season==1)
        {
            spring();
        }
        else if(season==2){
            summer();
        }
        else if(season==3)
        {
            fall();
        }
        else if(season==4){
            winter();
        }
}
public static void spring()
{
    System.out.println("spring season");
}
    public static void summer()
    {
        System.out.println("summer season");
    }
    public static void winter()
    {
        System.out.println("winter season");
    }
    public static void fall()
    {
        System.out.println("fall season");
    }
}
