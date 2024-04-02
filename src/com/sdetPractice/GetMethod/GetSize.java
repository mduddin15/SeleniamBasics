package com.sdetPractice.GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        Dimension d = driver.findElement(By.name("search")).getSize();

        System.out.println("Height of search box field is: "+d .height);
        System.out.println("Width of search box field is: "+d .width);
        Thread.sleep(3000);

        driver.close();

    }

}