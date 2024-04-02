package com.sdetPractice.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SecondAlertPopUpByFluentWait {

    public static void main(String[] args) throws InterruptedException {


        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Launch the application
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();

        // Set up FluentWait with a timeout of 30 seconds and a polling interval of 5 seconds
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        // Perform some actions to trigger an alert
        driver.findElement(By.id("timerAlertButton")).click();

        Thread.sleep(3000);

        // Use FluentWait to wait for the alert to be present
        //Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Perform actions on the alert

       // System.out.println("Alert text: " + alert.getText());
      // alert.accept();

        // Close the browser
        driver.quit();

    }

}
