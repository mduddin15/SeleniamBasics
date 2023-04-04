package com.sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByFullXPath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.epassport.gov.bd/landing");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/vbeop-root[1]/div[2]/div[2]/vbeop-landing-master[1]/vbeop-landing[1]/div[1]/div[1]/vbeop-instruction-panels[1]/div[1]/div[1]/div[1]/div[2]/vbeop-instruction-panel[1]/div[1]/div[1]/div[2]/div[2]/a[1]/img[1]")).click();
    }
}
