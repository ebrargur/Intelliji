package com.company.November7th;

public class RecapTask3 {
  /*
  * Create a method that will accept a String as a parameter
  * and return a new String that consist only of vowels.
  * Method should be available inside the class
  * only where it was declared and executed by calling it is name.
  *
  * */
    private static String vovelsOnly(String name)
    {
      return name.replaceAll("[^AEIOUaeiou]","");
   //replace everything other than these letters
    }
    public static void main(String[] args)
    {
       System.out.println(vovelsOnly("all the vovels will be removed"));

    }
}
