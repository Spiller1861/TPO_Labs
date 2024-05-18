import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchButtonSelector2 = By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div[2]/button[1]");
    private By searchInputSelector = By.xpath("//*[@id=\"fleaMarketSearchInput\"]");
    private By searchButtonSelector = By.xpath("//*[@id=\"fleaMarketSearch\"]/div/form/button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://baraholka.onliner.by/");
    }

    public void clickInitialSearchButton() {
        driver.findElement(searchButtonSelector2).click();
    }

    public void searchFor(String query) {
        driver.findElement(searchInputSelector).sendKeys(query);
        driver.findElement(searchButtonSelector).click();
    }
}
