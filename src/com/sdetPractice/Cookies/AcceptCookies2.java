package com.sdetPractice.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptCookies2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opera.com/download");
        driver.manage().window().maximize();

        Thread.sleep(5000); // static wait for cookies to be appear.

        final String cookies = "//span[@class='btn width-100 btn--primary cookie-consent__btn cookie-basic-consent__btn']";

        WebElement cookiesElement = driver.findElement(By.xpath(cookies));

        cookiesElement.click();

        Thread.sleep(5000);
        driver.close();
    }
}