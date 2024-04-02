package com.sdetPractice.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetCookieNamed {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/blog/handling-cookies-in-selenium-webdriver/");
        driver.manage().window().maximize();
        Thread.sleep(5000); // static wait for cookies to be appear.


        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Number of cookies: " + allCookies.size());


        for (Cookie loadedCookie : allCookies) {
            System.out.println(loadedCookie.getName() + "..... " + loadedCookie.getValue() + ".....");
        }


        System.out.println("Print info: " + driver.manage().getCookieNamed("amp_4bc4dc"));

        driver.close();
    }
}
