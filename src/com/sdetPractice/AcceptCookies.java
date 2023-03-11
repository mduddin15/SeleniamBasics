package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptCookies {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.poptin.com/?bing-popup-generator&keyword=popup%20website");
        driver.manage().window().maximize();

        Thread.sleep(5000); // static wait for cookies to be appear.

        final String cookies = " //input[@id='poptinFormSubmitButton']";

        WebElement cookiesElement = driver.findElement(By.xpath(cookies));

        cookiesElement.click();

    }

    }

