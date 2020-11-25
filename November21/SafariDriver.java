package com.company.November21;

public class SafariDriver implements RemoteWebDriver2 {
    @Override
    public void navigate() {
        System.out.println("Safari can navigate the files");
    }

    @Override
    public void getScreenshot() {
        System.out.println("safari take screenshots");
    }

    @Override
    public void open() {
        System.out.println("safari can open the files");
    }

    @Override
    public void close() {
        System.out.println("safari can close the files");
    }

    @Override
    public String getTitle() {
        return name;
    }
}
