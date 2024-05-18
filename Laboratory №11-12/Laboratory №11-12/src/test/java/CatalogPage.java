import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage {
    private WebDriver driver;
    private By linkSuperPrice = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/a[1]/div[1]");
    private By linkToSuperPageSelector = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]/p");
    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSuperPrice() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(linkToSuperPageSelector).click();
        driver.findElement(linkSuperPrice).click();
    }

}
