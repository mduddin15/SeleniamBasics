package com.sdetPractice.GetMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        Thread.sleep(3000);

        driver.quit();

    }

}
