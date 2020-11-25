package com.company.Studying;

public class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;


    StoreProduct(String labelvalue,double pricevalue,String categoryvalue,boolean hasExpirationvalue,int stock)
    {
        this.label=labelvalue;
        this.price=pricevalue;
        this.category=categoryvalue;
        this.hasExpiration=hasExpirationvalue;
        this.stock=stock;
    }

    StoreProduct(String labelvalue,double pricevalue,int stock)
    {
        this.label=labelvalue;
        this.price=pricevalue;
        category="misc";
        hasExpiration=false;
        this.stock=stock;
    }

    StoreProduct(String labelvalue,double pricevalue)
    {
        this.label=labelvalue;
        this.price=pricevalue;

        stock=0;
    }

    void display()
    {
        System.out.println(label+" "+price+" "+" "+category+" "+hasExpiration+" "+stock);

    }
}


class Main2 {

    public static void main(String[] args) {
        StoreProduct car1 = new StoreProduct("Eggs",3.0,"Produc",true,10);
        car1.display();
        StoreProduct car2 = new StoreProduct("Paper Towels",2.0,24);
        car2.display();
        StoreProduct car3 = new StoreProduct("Paper Towels",2.0);
        car3.display();

    }


}