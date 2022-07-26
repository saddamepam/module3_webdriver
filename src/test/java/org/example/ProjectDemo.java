package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ProjectDemo {
    @Test
    public  void pasteBin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
       // driver.findElements(By.className("header__btn"));
       // driver.switchTo().frame("postform-text");
        WebElement input=  driver.findElement(By.id("postform-text"));
        //input.clear();
        input.sendKeys("Hello from WebDriver");
        //driver.quit();

    }
}
