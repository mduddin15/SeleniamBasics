package com.sdetPractice.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByRelativeXpath {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/default.asp");
            driver.manage().window().maximize();
            // how to make half or not full window.
            driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("html");
        }
    }

