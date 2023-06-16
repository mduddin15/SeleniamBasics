package com.sdetPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Wait for some time to observe the scroll action
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}