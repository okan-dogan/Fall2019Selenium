package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        Thread.sleep(200);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("Nintendo Switch", Keys.ENTER);
        //Thread.sleep(3000);


        // driver.quit();


    }
}
