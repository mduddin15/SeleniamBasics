package com.sdetPractice.GetMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURl {



    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.poptin.com/?bing-popup-generator&keyword=popup%20website");
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        System.out.println("Current Url of the website is: " + url);

        Thread.sleep(3000);
        driver.close();
        // only close current browser window.
        // driver.quit() close all parent and child window.

    }
}
