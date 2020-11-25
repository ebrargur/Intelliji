package com.company.November21;

public interface WebDriver {
     void openBrowser();
     void closeBrowser();
     void maximizeWindow();
     void findElement();

}
class first implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open web broswer with chrome");


    }

    @Override
    public void closeBrowser() {
        System.out.println("close web broswer with chrome");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("max chrome chrome");

    }

    @Override
    public void findElement() {
        System.out.println("findelement with chrome");

    }
}
class second implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open web broswer with firefox");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close web broswer with firefox");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("max web broswer with firefox");

    }

    @Override
    public void findElement() {
        System.out.println("fin elemnt web broswer with firefox");

    }
}
class main{
    public static void main(String[] args) {
        WebDriver one=new first();
        one.closeBrowser();
        one.findElement();
        one.maximizeWindow();
        one.openBrowser();

        WebDriver second=new second();
        second.openBrowser();
        second.maximizeWindow();
        second.findElement();
        second.closeBrowser();
    }
}