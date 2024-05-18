import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YslPage {
    private WebDriver driver;
    private By linkToYslPageSelector = By.xpath("//*[@id=\"service-list\"]/div[2]/div/div/div[3]/search-tasks-list/div/div/div[2]/search-tasks-item/div/div/div[1]/div/a");


    public YslPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openYslPrice() throws InterruptedException {

        Thread.sleep(2000);
        WebElement linkToProductPage = driver.findElement(linkToYslPageSelector);
        String href = linkToProductPage.getAttribute("href");
        driver.get(href);
        Thread.sleep(1000);
    }
}
