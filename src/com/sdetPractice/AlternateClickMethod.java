package com.sdetPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlternateClickMethod {



    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        final String gmailButton = "//a[@aria-label='Gmail (opens a new tab)']";

        WebElement gmailButtonElement = driver.findElement(By.xpath(gmailButton));

        /* gmailButtonElement.click();
        Thread.sleep(5000);
        driver.quit();*/

        /*gmailButtonElement.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();*/

        /*gmailButtonElement.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        driver.quit();*/

        /*javascriptExecutor js = (javascriptExecutor)driver;
        js.executeScript("arguments[0].click();", gmailButtonElement);
        Thread.sleep(5000);*/

        Actions action = new Actions(driver);
        action.click(gmailButtonElement);
        Thread.sleep(5000);


    }

}
