package com.sdetPractice.PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ExplicitWaitPopUp {
    public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
                driver.manage().window().maximize();


        String secondPopUp = "alert";

        WebElement secondPopUpElement = driver.findElement(By.id(secondPopUp));

        secondPopUpElement.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();

        Thread.sleep(3000);

        driver.quit();

    }
}


