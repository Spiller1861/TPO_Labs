import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class OnlinerPage {
    WebDriver driver;
    By searchInputSelector = By.xpath("//*[@id=\"fast-search\"]/form/input");
    By specificLinkSelector = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div/div[1]/ul[2]/li[1]/a/span/span");
    By autoBarah = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/a/span");
    By autoBarahSelector = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[1]/div[2]/div/div[2]/ul/li[1]/a/span[1]");
    By catalogSelector = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]/span");
    By yslSelector = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[5]/a/span");

    By news = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/a/span");
    By newsSelector = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/div/div/div/div/div[1]/div[1]/a");

    By forumSelector = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[7]/a/span");


    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.onliner.by/");
    }

    public void searchFor(String query) {
        driver.findElement(searchInputSelector).sendKeys(query);
    }
    public void clickSpecificLink() {
        driver.findElement(specificLinkSelector).click();
    }
    public void clickAutoBarah() throws InterruptedException{
        WebElement autoBarahElement = driver.findElement(autoBarah);
        WebElement autoBarahSelectorElement = driver.findElement(autoBarahSelector);

        Actions actions = new Actions(driver);
        actions.moveToElement(autoBarahElement).perform();
        Thread.sleep(1000);
        autoBarahSelectorElement.click();
    }
    public void clickCatalogSelector() {
        driver.findElement(catalogSelector).click();
    }
    public void clickYslSelector() {
        driver.findElement(yslSelector).click();
    }
    public void clickNews() throws InterruptedException{
        WebElement autoBarahElement = driver.findElement(news);
        WebElement autoBarahSelectorElement = driver.findElement(newsSelector);

        Actions actions = new Actions(driver);
        actions.moveToElement(autoBarahElement).perform();
        Thread.sleep(1000);
        autoBarahSelectorElement.click();
    }
    public void clickForum() throws InterruptedException{
        driver.findElement(forumSelector).click();
    }
}