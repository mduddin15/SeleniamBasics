package com.sdetPractice.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com");
        driver.manage().window().maximize();


        WebElement searchBoxField = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);

        actions.contextClick(searchBoxField).build().perform();

        //Thread.sleep(3000);

        //driver.close is not working here. Try to resolve it.

        //driver.close();

    }

}
