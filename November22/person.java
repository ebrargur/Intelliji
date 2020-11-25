package com.company.November22;

public class person {
    String name;
    String ssn;
    int age;
   private double taxPaid;

    public person(String name, String ssn, int age, double taxPaid) {

        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.taxPaid = taxPaid;
    }

    public void setTaxPaid(String ssn,double taxPaid)//setter can write only
    {//administrator method can access private taxpaid
        if(this.ssn.equals(ssn))
        {  if(taxPaid>0)
        {this.taxPaid=taxPaid;}
        else{
            System.out.println("can not be nagative");}
        }
        else
        {
            System.out.println("not equal");
        }
    }

    double getTaxPaid(String ssn)
    {
        if(this.ssn.equals(ssn)){
            return taxPaid;
        }
        else{return -1;}
    }
}
