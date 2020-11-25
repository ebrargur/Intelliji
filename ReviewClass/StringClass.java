package com.company.ReviewClass;

public class StringClass {
    public static void main(String[] args) {
        String str="Danilo";
        String str2=new String("Mohammad");//creating string object8
        System.out.println(str2);
        System.out.println(str.length());

        System.out.println(str2.length());
        String name="Mina";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    String newString=str.concat(name);
        System.out.println(newString);
        System.out.println(str+name);
        String var1=null;
        String var2="burju";
        System.out.println(var1+var2);
        System.out.println(var1.concat(var2));
        String name2="lol";
        String name1="lol";
        System.out.println(name2==name1);
        System.out.println(name);
    }
}
