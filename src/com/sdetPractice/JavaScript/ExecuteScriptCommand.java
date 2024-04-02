package com.sdetPractice.JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScriptCommand {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("alert('Hello EveryOne');");

    }
}
