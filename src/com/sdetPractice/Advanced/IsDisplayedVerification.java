package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsDisplayedVerification {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Open the website
        driver.get("https://duckduckgo.com/");

        String expectedTitle = "DuckDuckGo — Privacy, simplified.";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Verification Pass- The correct title is displayed on the web page.");
        } else {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }


        // Verify that the “Search" Box is displayed
        WebElement searchBox = driver.findElement(By.className("searchbox_input__bEGm3"));
        if (searchBox.isDisplayed()) {
            System.out.println("Search Box is visible. Return: " + searchBox.isDisplayed());
        } else {
            System.out.println("Search Box is not visible. Return: " + searchBox.isDisplayed());
        }


        // Verify that the “Search” Box is enabled
        if (searchBox.isEnabled()) {
            System.out.println("Search Box is enabled. Return: " + searchBox.isEnabled());
            searchBox.sendKeys("Selenium");
        } else {
            System.out.println("Search Box is not enabled. Return: " + searchBox.isEnabled());
        }

        System.out.println("Successful Execution of Test.");

        // Close the browser
        driver.quit();
    }
}


