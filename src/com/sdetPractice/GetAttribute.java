package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        final String accountAndList = "//*[@id='nav-link-accountList']/span";
        final String orders = "//*[@id='nav_prefetch_yourorders']/span";

        WebElement ele = driver.findElement(By.xpath(accountAndList));

        String classAttribute = ele.getAttribute("class");
        System.out.println(classAttribute);

    }

}