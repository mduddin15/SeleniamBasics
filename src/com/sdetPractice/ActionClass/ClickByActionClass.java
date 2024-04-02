package com.sdetPractice.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickByActionClass {

// how to download latest chrome driver after 115,
    // https://youtu.be/KqWUC-xWYpA?si=wGaLRGmlMG2u2ALR

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        final String gmailButton = "//a[@aria-label='Gmail (opens a new tab)']";

        WebElement gmailButtonElement = driver.findElement(By.xpath(gmailButton));


        Actions actions = new Actions(driver);
        actions.click(gmailButtonElement).perform();
        Thread.sleep(5000);
        driver.quit();
    }

}