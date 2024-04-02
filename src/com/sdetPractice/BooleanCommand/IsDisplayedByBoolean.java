package com.sdetPractice.BooleanCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedByBoolean {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000); // static wait for cookies to be appear.

        boolean a = driver.findElement(By.id("but2")).isDisplayed();
        boolean b = driver.findElement(By.id("hbutton")).isDisplayed();
        System.out.println(a);
        System.out.println(b);

        driver.quit();


    }
}