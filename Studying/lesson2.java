package com.company.Studying;

public class lesson2 {
    public static void main(String[] args) {
        int num1=11;
        int num2=11;
     int answer=multNum(num1);
     System.out.println(answer);
     int answer2=add(num1,num2);
     System.out.println(answer2);
     boolean answer3=Equal(num1,num2);
        System.out.println(answer3);
    }
    public static int multNum(int a)
    {
     return (a*7);


  }
  public static int add(int x, int y)
  {
      int ans2=x+y;
      return ans2;
  }
  public static boolean Equal(int a, int b)
  {
      if(a==b)
          return true;
      return false;
  }
}
