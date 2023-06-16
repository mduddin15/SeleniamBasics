package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        final String doubleClickButton = "doubleClickBtn";


        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id(doubleClickButton));
        actions.doubleClick(element).build().perform();


        // verify searched product

        final String verifyDoubleClickButton = "doubleClickMessage";

        String actualText =  driver.findElement(By.id(verifyDoubleClickButton)).getText();
        System.out.println("Actual Text: " + actualText);

        String expectedText = "You have done a double click";
        System.out.println("Expected Text: " + expectedText);

        if (actualText.equals(expectedText)){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        driver.close();
        
    }
}
