package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String appUrl = "https://www.w3schools.com/";

        driver.get(appUrl);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();

        Thread.sleep(3000);
        // Go back to Home Page
        driver.navigate().back();

        Thread.sleep(3000);

        // Go forward to Registration page
        driver.navigate().forward();

        Thread.sleep(3000);

        // Go back to Home page
        driver.navigate().to(appUrl);
        Thread.sleep(3000);

        // Refresh browser
       driver.navigate().refresh();
        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
}

