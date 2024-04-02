package com.sdetPractice.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {


        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();

            Thread.sleep(3000);

            //String someElements = "//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[4]/a";

            // String someElements = "//*[@class='nav_first']/ancestor::ul//descendant::li"; this is hasan's xpath.
            // but it is giving 42 elements instead of 7.
            //*[@id="navFooter"]/div[1]/div/div[1]

            ////*[@class='nav_first']/ancestor::ul[1]


            List<WebElement> elements = driver.findElements(By.xpath( "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul"));

            for(WebElement element : elements) {

                System.out.println(element.getText());


            }

            Thread.sleep(3000);

            driver.close();

        }
    }
