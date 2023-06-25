package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        Thread.sleep(3000); // static wait for cookies to be appear.



       WebElement iframeElement = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));

        driver.switchTo().frame(iframeElement);


        WebElement getText = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));

        System.out.println(getText.getText());

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.close();


    }
}