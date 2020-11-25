package com.company.November21;

public class WebderiverTester {
    public static void main(String[] args) {
        RemoteWebDriver2 obj=new ChromeDriver();
        obj.close();
        obj.open();
        obj.getTitle();
        obj.getScreenshot();
       obj.navigate();
        RemoteWebDriver2 obj2=new SafariDriver();
        obj2.getScreenshot();
        obj2.navigate();
        obj2.open();
        obj2.getTitle();
        obj2.close();

        RemoteWebDriver2 obj3=new Firefox();
        obj3.close();
        obj3.open();
        obj3.navigate();
        obj3.getTitle();
        obj3.navigate();


    }
}
