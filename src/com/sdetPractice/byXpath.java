package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byXpath {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/default.asp");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("html");
        }
    }

