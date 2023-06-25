package com.sdetPractice.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkTest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement partialLink = driver.findElement(By.partialLinkText("Tutorial"));

        Thread.sleep(3000);

        System.out.println(partialLink.getText());

        driver.close();
    }
}
