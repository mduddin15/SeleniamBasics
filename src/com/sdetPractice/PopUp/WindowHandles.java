package com.sdetPractice.PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("http://omayo.blogspot.com/");


        String firstWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Open a popup window")).click();

        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while(itr.hasNext()) {

            String window = itr.next();

            driver.switchTo().window(window);

            if(driver.getTitle().equals("Basic Web Page Title")) {
                driver.close();
            }

        }


        Thread.sleep(3000);

        driver.switchTo().window(firstWindow);

        driver.findElement(By.name("q")).sendKeys("Arun");

    }

}




