package com.company.StudyingTwo;

import java.util.ArrayList;

public class ForEachwithArrays {
    public static void main(String[] args) {
        int array2[][]={{10,20,39},{45,46,2}};
        ArrayList<String> groups=new ArrayList<String>();
        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Gun's Roses");
        groups.add("Black Sabbath");

for(String s:groups)
{
    System.out.println(s);
}
for (int[] b:array2)
{
    System.out.println(b);
}
    }
}
