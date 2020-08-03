package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;


public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    @FindBy(css= "div[class='TbwUpd NJjxre']")
    private List<WebElement> links;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("i see results");
        System.out.println(results.size());
    }
        public void clickRandomLink() {
        links.get(new Random().nextInt(links.size())).click();
    }



}
