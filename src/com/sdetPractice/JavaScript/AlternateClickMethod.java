package com.sdetPractice.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateClickMethod {



    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        final String gmailButton = "//a[@aria-label='Gmail (opens a new tab)']";

        WebElement gmailButtonElement = driver.findElement(By.xpath(gmailButton));

        //click by click() method

        /*gmailButtonElement.click();
        Thread.sleep(5000);
        driver.quit();*/

        //click by sendKeys(Keys.ENTER) method

        /*gmailButtonElement.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();*/

        //click by sendKeys(Keys.RETURN method

        /*gmailButtonElement.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        driver.quit();*/

        //click by javascript executor method

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", gmailButtonElement);
        driver.quit();

        //click by action class
        /*Actions actions = new Actions(driver);
        actions.click(gmailButtonElement).perform();
        Thread.sleep(5000);
        driver.quit();*/

    }
}
