package com.sdetPractice.BooleanCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleCommand {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement dropdownField = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdownField);

        System.out.println(select.isMultiple());

        Thread.sleep(3000);
        driver.close();
    }
}