package com.company.StudyingTwo;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> groups=new ArrayList<String>();
        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Gun's Roses");
        groups.add("Black Sabbath");

        groups.remove(0);
        System.out.println(groups.indexOf("Metallica"));

        System.out.println(groups.size());
        for(int i=0;i< groups.size();i++)
        {
            System.out.println(groups.get(i));
        }
    }
}
