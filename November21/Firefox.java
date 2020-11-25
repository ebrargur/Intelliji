package com.company.November21;

public class Firefox implements RemoteWebDriver2{
    @Override
    public void navigate() {
        System.out.println("Firefox can navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox can take screen shot");
    }

    @Override
    public void open() {
        System.out.println("Firefox can open the files");
    }

    @Override
    public void close() {
        System.out.println("firefox close the files");
    }

    @Override
    public String getTitle() {
        return name;
    }
}
