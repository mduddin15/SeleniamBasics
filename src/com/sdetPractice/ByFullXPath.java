package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByFullXPath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.epassport.gov.bd/authorization/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/vbeop-root/div[2]/div[2]/vbeop-authentication/div/vbeop-login/div/div[2]/form/vbeop-button/button")).click();
    }
}
