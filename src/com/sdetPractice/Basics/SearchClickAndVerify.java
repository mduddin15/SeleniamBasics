package com.sdetPractice.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClickAndVerify {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        final String searchBox = "twotabsearchtextbox";
        final String searchButton =  "nav-search-submit-button";
        final String actualTextXpath =  "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]";


        driver.findElement(By.id(searchBox)).sendKeys("TShirts");
        driver.findElement(By.id(searchButton)).click();
        Thread.sleep(3000);


        // verify searched product

        String actualText =  driver.findElement(By.xpath(actualTextXpath)).getText();
        System.out.println("Actual Text: " + actualText);

        String expectedText = "\"t-shirts\"";
        System.out.println("Expected Text: " + expectedText);

        if (actualText.equals(expectedText)){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        driver.close();

    }

}


