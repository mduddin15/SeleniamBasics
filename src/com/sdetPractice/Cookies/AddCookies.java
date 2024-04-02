package com.sdetPractice.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AddCookies {


    // Not working

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ico.org.uk/for-the-public/online/cookies/");
        driver.manage().window().maximize();


        // Accept the cookies

        final String cookies = "//button[@id='ccc-recommended-settings']";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement cookiesElement = driver.findElement(By.xpath(cookies));
        cookiesElement.click();

        Set<Cookie> Cookies = driver.manage().getCookies();

        System.out.println("Number of Cookies Before Add: " + Cookies.size());

        for (Cookie loadedCookie : Cookies) {
            System.out.println(loadedCookie.getName() + "..... " + loadedCookie.getValue() + ".....");
        }


        // Add cookie in to the browser
        Cookie ck = new Cookie("Rakib", "123456");
        driver.manage().addCookie(ck);


        Set<Cookie> allCookies = driver.manage().getCookies();

        System.out.println("Number of Cookies After Add: " + allCookies.size());

        for (Cookie loadedCookie : allCookies) {
            System.out.println(loadedCookie.getName() + "..... " + loadedCookie.getValue() + ".....");
        }


        Thread.sleep(3000);


        driver.close();

    }
}