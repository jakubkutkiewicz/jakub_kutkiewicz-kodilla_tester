package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();
        WebDriverWait wait = new WebDriverWait(driver, 5);


        System.setProperty("webdriver.gecko.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.ebay.com/");
        WebElement inputField1 = driver2.findElement(By.name("_nkw"));
        inputField1.sendKeys("laptop");
        inputField1.submit();


    }
}
