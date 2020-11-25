package com.company.November18th;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Iphone();//We choose use phone because it is abstract class

        iphone.makeCalls();
        iphone.sendText();
        iphone.unlock();
        iphone.viewPicture();

        Phone samsung = new Samsung();//pollymorphisim
        samsung.viewPicture();
        samsung.unlock();
        samsung.sendText();
        samsung.makeCalls();

    }
}

