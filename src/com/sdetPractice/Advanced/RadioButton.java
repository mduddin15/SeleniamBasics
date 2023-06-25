package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        driver.quit();

        final String radioButton = "//label[@for='yesRadio']";

        WebElement radioButtonElement = driver.findElement(By.xpath(radioButton));

        boolean isSelected = radioButtonElement.isSelected();
        System.out.println("Radio button is selected: " + isSelected);

        // Click the radio button to select it
        radioButtonElement.click();

        Thread.sleep(3000);

        // Check if the radio button is selected after clicking, and print its status
        isSelected = radioButtonElement.isSelected();
        System.out.println("Radio button is selected: " + isSelected);

        // Close the browser
        //driver.quit();
    }

    }

