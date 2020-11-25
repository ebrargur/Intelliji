package com.company.Studying;

public class Dog {
    String dogName;
    double dogWeight;
    public static String getDogBreed="Mutt";



    Dog(String dogNameValue,double dogWeightValue)
    {
      this.dogName=dogNameValue;
      this.dogWeight=dogWeightValue;
    }



    void display()
    {
        System.out.println(dogName+" "+dogWeight+" "+" "+getDogBreed);

    }
}


class Main3 {

    public static void main(String[] args) {
        Dog car1 = new Dog("Tarzan",50.0);
        car1.display();
        Dog car2 = new Dog("Lucy",10.0);
        car2.display();


    }

}
