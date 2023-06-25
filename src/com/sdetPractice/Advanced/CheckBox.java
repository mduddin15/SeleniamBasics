package com.sdetPractice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String checkBox = "//*[@id=\"tree-node\"]/ol/li/span/label/span[2]";

        WebElement checkBoxElement = driver.findElement(By.xpath(checkBox));

        boolean isSelected = checkBoxElement.isSelected();
        System.out.println("Checkbox is selected: " + isSelected);

        // Click the checkbox to toggle its selection
        checkBoxElement.click();

        // Check if the checkbox is selected after clicking, and print its status
        isSelected = checkBoxElement.isSelected();
        System.out.println("Checkbox is selected: " + isSelected);

        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }

    }
