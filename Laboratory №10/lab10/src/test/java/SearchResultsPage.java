import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private WebDriver driver;
    private By linkToProductPageSelector = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/div/table/tbody/tr/td/h2/a");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openFirstProduct() {
        WebElement linkToProductPage = driver.findElement(linkToProductPageSelector);
        String href = linkToProductPage.getAttribute("href");
        driver.get(href);
    }
}
