package com.sdetPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eticket.railway.gov.bd/");
        driver.manage().window().maximize();
        driver.findElement(By.id("dest_from")).sendKeys("Dhaka");
        driver.findElement(By.id("dest_to")).sendKeys("Chittagong");
    }
}
