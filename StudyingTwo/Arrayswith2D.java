package com.company.StudyingTwo;

public class Arrayswith2D {
    public static void main(String[] args) {
        int [][] arr={{10,20,30},{40,30,60}};

     //   int[][] arr2=new int[2][3];
int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            count++;
            }
        }
        System.out.println(count);
    }
}
