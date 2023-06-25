package com.sdetPractice.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelectorCommand {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement logInButton = driver.findElement(By.cssSelector("button[value='LogIn']"));
        Thread.sleep(3000);

        logInButton.click();

        Thread.sleep(5000);

        driver.close();


    }
}