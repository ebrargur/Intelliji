package com.company.StudyingTwo;

import java.util.Scanner;

public class ArrayExamples {
    public static void mean(int[] arr)
    {
        int total=0;
        for(int i=0; i<arr.length;i++)
        {
            total+=arr[i];
        }
        System.out.println("Ortalama "+total/arr.length);
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[] arr2 = new int[5];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scan.nextInt();
            //System.out.println("Yeni degerler "+arr2[i]);
        }
        mean(arr2);

    }
}
