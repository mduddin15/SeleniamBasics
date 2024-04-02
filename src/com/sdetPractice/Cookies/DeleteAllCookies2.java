package com.sdetPractice.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteAllCookies2 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        Thread.sleep(3000); // static wait for cookies to be appear.

        Set<Cookie> cookies = driver.manage().getCookies();

        System.out.println("Cookie size before: " +cookies.size());

        driver.manage().deleteAllCookies();

        Set<Cookie> cookiesAfterDelete = driver.manage().getCookies();

        System.out.println("Cookie size after: " +cookiesAfterDelete.size());

        driver.close();

    }
}