package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();


        File srcScreenshot = driver.findElement(By.id("hbutton")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcScreenshot, new File("/Users/mdrakibuddin/IdeaProjects/SeleniamBasics"+ "\\screenshots\\screenshot.png"));

        driver.quit();

    }
}