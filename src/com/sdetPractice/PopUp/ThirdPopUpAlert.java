package com.sdetPractice.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdPopUpAlert {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();


        final String thirdAlert= "confirmButton";
        Thread.sleep(3000);
        driver.findElement(By.id(thirdAlert)).click();

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        driver.close();

    }

}