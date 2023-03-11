package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.poptin.com/?bing-popup-generator&keyword=popup%20website");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title of the website is: " + title);

        Thread.sleep(3000);
        driver.close();

    }
}
