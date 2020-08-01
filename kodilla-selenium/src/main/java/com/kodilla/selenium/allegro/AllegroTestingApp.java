package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement element = driver.findElement(By.xpath("//html/body/div/div/div/div/div/button"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }


        WebElement inputField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > input"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.m911_co.mefy_co.mnyp_co.mdwl_co.m911_co.mefy_co.mnyp_co.mdwl_co.m0xf_co.mx7m_1.mefy_5r.mlkp_ag.msts_9u._d25db_1Qn1q > div > select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        category = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > button"));
        category.click();

//        WebElement txt = driver.findElement(By.cssSelector("#opbox-listing--base > div "));
        List<WebElement> elements = driver.findElements(By.cssSelector("#opbox-listing--base"));
        System.out.println(elements.get(0).getText());

    }
}
