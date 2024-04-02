package com.sdetPractice.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitCommand {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");

        driver.findElement(By.id("input-password")).sendKeys("Second@123");

        Thread.sleep(3000);

        driver.findElement(By.id("input-password")).submit();

        Thread.sleep(3000);

        driver.close();

    }
}