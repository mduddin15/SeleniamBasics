package com.sdetPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.naukri.com/");
        driver.manage().window().maximize();


        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        String child_window = null;
        while (I1.hasNext()) {
            child_window = I1.next();
        }


        if (!parent.equals(child_window)) {
            driver.switchTo().window(child_window);

            System.out.println(driver.switchTo().window(child_window).getTitle());

            driver.close();
        }
//switch to the parent window
        driver.switchTo().window(parent);

    }
}