package com.company.November14th;
class Bank {
    double bankbalance;

    public Bank(double bankbalance) {
        this.bankbalance = bankbalance;
    }

    void printTransferFee() {
        System.out.println("Transfer Fee" + bankbalance * 0.1);
    }
}
  class BOA extends Bank{
        public BOA(double bankBalance)
        {
            super(bankBalance);
        }
      void printTransferFee() {
          System.out.println("Transfer Fee" + bankbalance * 0.01);
      }
    }
class Chase extends Bank{

    public Chase(double bankbalance) {
        super(bankbalance);
    }
    void printTransferFee() {
        System.out.println("Transfer Fee" + bankbalance * 0.01);
    }
}

public class Overridingandoverloading {
    public static void main(String[] args) {
        Chase chase = new Chase(1000);
        chase.printTransferFee();
        BOA boa=new BOA(1000);
        boa.printTransferFee();
    }
}
