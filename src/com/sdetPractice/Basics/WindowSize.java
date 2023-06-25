package com.sdetPractice.Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.poptin.com/?bing-popup-generator&keyword=popup%20website");
        Dimension d = new Dimension(400,600);
        driver.manage().window().setSize(d);


        String title = driver.getTitle();
        System.out.println("Title of the website is: " + title);

        Thread.sleep(3000);
        driver.close();

    }
}

