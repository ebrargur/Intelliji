package com.company.November11th;

public class Addition {
    int sum(int num1,int num2){
        return num1+num2;
    }
    int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    int sum(int[] numArray)

    {
        int sum=0;
for(int num1:numArray)
{

    sum=sum+num1;

}
        return sum;


    }


}
