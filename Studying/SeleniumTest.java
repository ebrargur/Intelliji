package com.company.Studying;

//import com.company.November21.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aypolat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.w3schools.com/java/java_interface.asp");
    }
}
