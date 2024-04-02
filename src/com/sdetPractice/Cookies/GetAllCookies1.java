package com.sdetPractice.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies1 {


    // Code done by Mukul

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/blog/handling-cookies-in-selenium-webdriver/");
        driver.manage().window().maximize();

        Thread.sleep(5000); // static wait for cookies to be appear.

       Set<Cookie> allCookies = driver.manage().getCookies();

        System.out.println(allCookies.size());

        for (Cookie loadedCookie : allCookies) {
            System.out.println(loadedCookie.getName() + "..... " + loadedCookie.getValue() + ".....");
        }

        driver.close();


        /*Selenium Query Commands	Output
driver.manage().getCookies();	Return The List of all Cookies
driver.manage().getCookieNamed(arg0);	Return specific cookie according to name
driver.manage().addCookie(arg0);	Create and add the cookie
driver.manage().deleteCookie(arg0);	Delete specific cookie
driver.manage().deleteCookieNamed(arg0);	Delete specific cookie according Name
driver.manage().deleteAllCookies();	Delete all cookies*/


    }
}