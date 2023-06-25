package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();


        WebElement browse = driver.findElement(By.id("uploadFile"));

        browse.sendKeys("/Users/mdrakibuddin/Desktop/dhanshirinodi.jpeg");

        Thread.sleep(3000);

    }
}