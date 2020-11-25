package com.company.November18th;


abstract public class Phone {
    public void makeCalls() {
        System.out.println("Phone makes call");
    }
    public void sendText(){
        System.out.println("phone send txt");

    }

    public abstract  void viewPicture();
    public abstract void unlock();

}
class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("we can checkout the photos using the photos app");
    }

    public void unlock()
    {

    }

}

class IphoneChild extends Iphone{

    @Override
    public void unlock() {
        System.out.println("Can unlock using face");
    }
    public void facetime()
    {
        System.out.println("i have face time for video calls");
    }
}
class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("to view pictures use the Gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock using the password");
    }
    public void Duo()
    {
        System.out.println("I can make duo calls ");
    }
}