package com.sdetPractice.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextBox {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);


        // clear() command works for both text box and text area field.
        driver.findElement(By.id("textbox1")).clear();
        Thread.sleep(5000);
        driver.close();

    }

}