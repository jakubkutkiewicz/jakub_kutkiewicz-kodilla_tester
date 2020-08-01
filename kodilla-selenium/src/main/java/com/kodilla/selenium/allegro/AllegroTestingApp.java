package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement element = driver.findElement(By.xpath("//html/body/div/div/div/div/div/button"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }

        WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div/div/form/input"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.xpath("//select[@class=\"mr3m_1 m7er_k4 m7er_k4 m7er_wn _k70df mgn2_14 mgn2_14 mgn2_jk mp0t_0a mqu1_21 mgmw_wo mli8_k4 _d25db_an94v\"]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        category =driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        category.click();

    }
}
