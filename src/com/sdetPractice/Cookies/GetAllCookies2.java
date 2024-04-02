package com.sdetPractice.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        Thread.sleep(5000); // static wait for cookies to be appeared.


        Set<Cookie> cookies = driver.manage().getCookies();

        for(Cookie cookie : cookies ) {

            System.out.println("Cookie Name: " +cookie.getName());
            System.out.println("Cookie Value: " +cookie.getValue());
            System.out.println("Cookie Domain: " +cookie.getDomain());
            System.out.println("Cookie Path: " +cookie.getPath());
            System.out.println("Cookie Expiry Date: " +cookie.getExpiry());
            System.out.println("------------------" );

            }
        driver.close();
    }
}
