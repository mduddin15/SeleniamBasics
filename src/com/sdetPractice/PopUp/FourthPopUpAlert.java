package com.sdetPractice.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthPopUpAlert {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        final String fourthAlert= "promtButton";


        Thread.sleep(5000);
        driver.findElement(By.id(fourthAlert)).click();

        Thread.sleep(5000);

        driver.switchTo().alert().sendKeys("Rakib");

        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        Thread.sleep(5000);
        driver.close();

    }

}
