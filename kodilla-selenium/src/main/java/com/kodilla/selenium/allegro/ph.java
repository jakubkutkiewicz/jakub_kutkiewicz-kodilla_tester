package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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



        WebDriverWait wait = new WebDriverWait(driver, 5);
       List<WebElement> sss = driver.findElements(By.xpath("/html/body/div[7]/div/div[3]/div/div/ul/li[2]/div/div[1]/a/img"));


        

      //WebDriverWait(driver, 20).until(.element_to_be_clickable((By.xpath ("//button[@class='ytp-large-play-button ytp-button']")))).click();

//        driver.findElement(By.xpath("//*[@id=\"v111728942\"]/div/div[3]/span/a"));


    }
}

