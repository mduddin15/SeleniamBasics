package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        final String scoreText = "//a[normalize-space()='Score these trending kicks']";


        WebElement scoreTextElement = driver.findElement(By.xpath(scoreText));

        String getText = scoreTextElement.getText();
        System.out.println(getText);

        Thread.sleep(5000);

        driver.close();

    }
}