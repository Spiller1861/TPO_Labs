import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinerPage {
    WebDriver driver;
    By searchInputSelector = By.xpath("//*[@id=\"fast-search\"]/form/input[1]");

    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.onliner.by/");
    }

    public void searchFor(String query) {
        driver.findElement(searchInputSelector).sendKeys(query);
    }
}