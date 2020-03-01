package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // RemoteWebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com"); // to open a web site inserted as parameter
    }
}
