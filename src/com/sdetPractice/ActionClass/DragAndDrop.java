package com.sdetPractice.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrakibuddin/Desktop/JavaJarAndOthers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        driver.manage().window().maximize();


        // Locate the draggable element
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='box1']"));


        // Locate the target element
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='box101']"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform the drag and drop operation

        Action drugAndDrop = actions.clickAndHold(sourceElement)
                .moveToElement(targetElement)
                .release(targetElement)
                .build();
        drugAndDrop.perform();


        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}





