package com.sdetPractice.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEbay {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        final String allCategories = "//select[@id='gh-cat']";
        final String searchButton= "//input[@id='gh-btn']";

        WebElement allCategoriesElement = driver.findElement(By.xpath(allCategories));
        WebElement searchButtonElement = driver.findElement(By.xpath(searchButton));

        Select select = new Select(allCategoriesElement);

        select.selectByValue("20081");

        Thread.sleep(2000); // static wait

        // thread.sleep is static wait.
        // dynamic wait: implicit wait, explicit wait, fluent wait.

        select.selectByVisibleText("Baby");

        Thread.sleep(2000);

        select.selectByIndex(4);

        searchButtonElement.click();

        Thread.sleep(5000);

        //driver.close();

        driver.quit();


    }

}
