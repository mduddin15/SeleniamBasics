package com.sdetPractice.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAlertPopUp {


    public static void main(String[] args) throws InterruptedException {



    System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

    driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();


        final String firstAlert= "alertButton";
        final String firstAlertXpath= "//*[@id='alertButton']";


        // first alert: Ok

        driver.findElement(By.id(firstAlert)).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        // by using xpath for the first Alert: Ok

       driver.findElement(By.xpath(firstAlertXpath)).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.close();

        }
}