package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ph {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pornhub.com");


        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        inputField.sendKeys("milf");
        inputField = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
        inputField.click();
        List<WebElement> elements = driver.findElements(By.cssSelector("#videoSearchResult > li.sniperModeEngaged.alpha"));
        elements.get(0).click();

    }
}

