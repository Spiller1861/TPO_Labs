import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
    WebDriver driver;
    private By clickView = By.xpath("//*[@id=\"product-sub-navigation-container\"]/li[3]/a/span");

    private By confirmS = By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[2]/button[1]");

    private By clickOb = By.xpath("//*[@id=\"product-sub-navigation-container\"]/li[4]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://catalog.onliner.by/mobile/poco/pococ656128wbl/prices");
    }

    public void openProductsView() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(confirmS).click();
        driver.findElement(clickView).click();
    }
    public void openProductsOb() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(confirmS).click();
        driver.findElement(clickOb).click();
    }

}