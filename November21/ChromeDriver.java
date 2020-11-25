package com.company.November21;

public class ChromeDriver implements RemoteWebDriver2 {
    @Override
    public void navigate() {
        System.out.println("Chrome can navitage");
    }

    @Override
    public void open() {
        System.out.println("Chrome can open");
    }

    @Override
    public void close() {
        System.out.println("Chrome can close");
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public void getScreenshot() {
        System.out.println("chrome can get screenshots");
    }
}
