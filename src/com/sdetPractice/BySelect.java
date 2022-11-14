package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BySelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eticket.railway.gov.bd/");
        driver.manage().window().maximize();

        Select s = new Select(driver.findElement(By.id("choose_class")));
        s.selectByValue("SNIGDHA");
    }
}
