package com.sdetPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/java-tutorial.html");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("https://www.guru99.com/images/guru99-logo.png")).click();
    }
}
