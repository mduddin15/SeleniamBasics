package com.sdetPractice.GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);


        String textOnButton = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("value");

        System.out.println(textOnButton );

        Thread.sleep(3000);

        driver.quit();

    }

}
