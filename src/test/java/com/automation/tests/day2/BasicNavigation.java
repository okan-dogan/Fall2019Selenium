package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object

        WebDriverManager.chromedriver().setup();
        // RemoteWebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();


        //In selenium, everything starts from WebDriver interface'
        //ChromeDriver extends RemoteWebDriver --> implements WebDriver

        driver.get("http://google.com"); // to open a web site inserted as parameter

        Thread.sleep(5000); // for demo wait 5 sec (5000 milisecond)

        String title = driver.getTitle(); // returns <title> Some title </title> text
                                          //you can also see it as tab name, in the browser
        String expectedTitle = "Google";
        System.out.println("Title is = "+title);

        if(title.equals(expectedTitle)){
            System.out.println("Test PASSED !");
        }else
            System.out.println("Test FAILED !!!");

        driver.manage().window().maximize();

        driver.navigate().to("http://amazon.com");

        Thread.sleep(5000); // for demo wait 5 sec (5000 milisecond)

        if(driver.getTitle().toLowerCase().equals("amazon")){ // its title varies according to your location etc
                                                                // it is not amazon but contains."amazon"
            System.out.println("Test PASSED !");
        }else
            System.out.println("Test FAILED !!!");

        driver.navigate().back();
        Thread.sleep(3000); // for demo wait 5 sec (5000 milisecond)

        verifyEquals(driver.getTitle(),"Google"); // we create a static method below to do so

        driver.navigate().refresh(); // to reload the page


        // must be at the ent
        driver.close();//to close browser
        //browser cannot close itself



    }

    public static void verifyEquals(String arg1, String arg2){
        if(arg1.equals(arg2)){
            System.out.println("Test PASSED !");
        }else
            System.out.println("Test FAILED !!!");

    }

}
