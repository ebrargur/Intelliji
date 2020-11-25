package com.company.Studying;

public class Clssandobject {
    public static void main(String[] args) {
  double h;
  double s;
        GroceryStore houstonstore=new GroceryStore(123,3.3,145,2.3);
        GroceryStore seattlestore=new GroceryStore(345,23,456,6);

        System.out.println("Houston Store /n");
        h=houstonstore.revenueGross();
        System.out.println("Need to sell "+houstonstore.appleRevenueTarget(1050)+" apples");
        System.out.println("Need to sell "+houstonstore.orangeRevenueTarget(620)+" oranges");
        System.out.println(h);

        System.out.println("Seattle Store /n");
        s=seattlestore.revenueGross();
        System.out.println(s);
        System.out.println("Seaatle Store NEed to sale "+seattlestore.appleRevenueTarget(744)+" apples");
        System.out.println("Seaatle store need to sale "+seattlestore.orangeRevenueTarget(600)+" oranges");
    }
}
class GroceryStore{
int applessoldyear;
double applesprice;
int orangessoldyear;
double orangesprice;

GroceryStore(int appsold,double applep,int orangesold,double orangep)//Constructor
{//variable type needs to match same order
    applessoldyear=appsold;
    applesprice=applep;
    orangessoldyear=orangesold;
    orangesprice=orangep;

}



    double revenueGross()
{
    double revenue;

    revenue=(applessoldyear* applesprice+orangesprice* orangessoldyear);

 return revenue;
}
 double appleRevenueTarget(double revenue)
 {
return revenue/applesprice;
 }
 double orangeRevenueTarget(double revenue)
 {
     return revenue/orangesprice;
 }
}