package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class MouseHover {


    public static void main(String[] args) {

           // System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();

       final String accountAndList = "//*[@id='nav-link-accountList']/span";
        final String orders = "//*[@id='nav_prefetch_yourorders']/span";

        WebElement ele = driver.findElement(By.xpath(accountAndList));

//Creating object of an Actions class
        Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();

        driver.findElement(By.xpath(orders)).click();

        driver.manage().deleteAllCookies();

        // cookies code worked. how to check: go to settings, search cookies,
        // go to "See all site data and permissions" then see cookies.


    }
    }


