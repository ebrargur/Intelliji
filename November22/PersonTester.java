package com.company.November22;

public class PersonTester {
    public static void main(String[] args) {


        person Davit = new person("Davit", "2344", 25, 3000);
        person mikeobj=new person("Mike","4566",30,1000);
       // System.out.println(Davit.taxPaid);
Davit.setTaxPaid("56543",-1);
Davit.setTaxPaid("2344",-1);
        System.out.println(Davit.getTaxPaid("4567"));
        System.out.println(Davit.getTaxPaid("2344"));

        mikeobj.getTaxPaid("4959595");


    }
}
