package com.sdetPractice.PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/basic_auth");

        //Set the username
        String username = "admin";

        //Set the password
        String password = "admin";


        String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
        Thread.sleep(5000);

        driver.get(URL);



        String title = driver.getTitle();

        System.out.println("The page title is " + title);

        driver.quit();
    }
}