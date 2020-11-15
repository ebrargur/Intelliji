package com.company.November14th;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance=balance;
        this.interest=interest;
    }
    double print()
    {
        System.out.println("Transfer"+balance*interest);
        return 0;
    }

    public static void main(String[] args) {
        Visa visa=new Visa(1000,6);
        System.out.println(visa.print());
     AX ax=new AX(3000,9);
        System.out.println(ax.print());
    }
}

class Visa extends CreditCard {
    public Visa(double balance,double interest) {
        super(balance,interest);
    }

    public double print() {
      return balance*interest;

    }
}
class AX extends CreditCard {
    public AX(double balance,double interest) {
        super(balance,interest);
    }

    public double print() {
     return balance*interest*2;


    }
}

