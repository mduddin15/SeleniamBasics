package com.sdetPractice.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        final String HelloSignInButton = "nav-link-accountList";
        final String email = "ap_email";
        final String continueButton =  "continue";
        final String passwordButton =  "ap_password";
        final String SignButton =  "signInSubmit";


        driver.findElement(By.id(HelloSignInButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(email)).sendKeys("rakibuddin.md@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id(continueButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(passwordButton)).sendKeys("Fahima#3");
        Thread.sleep(2000);
        driver.findElement(By.id(SignButton)).click();
        Thread.sleep(2000);
        //driver.close();


    }
}
