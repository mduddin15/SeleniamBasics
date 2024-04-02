package com.sdetPractice.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeleteAllCookies1 {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://ico.org.uk/for-the-public/online/cookies/");
            driver.manage().window().maximize();


            final String cookies = "//button[@id='ccc-recommended-settings']";

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            WebElement cookiesElement = driver.findElement(By.xpath(cookies));

            cookiesElement.click();



            driver.manage().deleteAllCookies();


            driver.close();

        }
    }
