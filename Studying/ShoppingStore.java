package com.company.Studying;

public class ShoppingStore {
    String item;
    double price;
    int quantity;


    ShoppingStore(String itemvalue,double pricevalue,int quantityvalue)
    {
        this.item=itemvalue;
        this.price=pricevalue;
        this.quantity=quantityvalue;
    }

    public void itemTotalPrice() {
        System.out.println(item+" Total Value "+quantity*price);

    }
}
class Main10 {

    public static void main(String[] args) {
        ShoppingStore car1 = new ShoppingStore("Blanket",99.98,1);
        car1.itemTotalPrice();
        ShoppingStore car2 = new ShoppingStore("Mattress",439.18,1);
        car2.itemTotalPrice();
         double temp=sum(car1.price*car1.quantity,car2.price*car2.quantity);
        System.out.println("Your purchased "+ temp+" Today");





    }

    private static double sum(double v, double v1) {


        return (double) (v+v1);
    }


}
