import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private WebDriver driver;
    private By linkForumTag = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[4]/ul/li[1]/h3/a");
    private By linkSubmit = By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div[2]/button[1]/p");

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSuperPrice() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(linkSubmit).click();
        driver.findElement(linkForumTag).click();
    }

}
