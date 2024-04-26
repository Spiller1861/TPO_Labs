package epam.lab9;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverTest {
  public static void main(String[] args) throws InterruptedException {


    System.setProperty("webdriver.edge.driver", "F:\\study\\study\\6_sem\\TPO\\Drivers\\msedgedriver.exe");


    WebDriver driver  = new EdgeDriver();
    driver.get("https://baraholka.onliner.by/");

    Thread.sleep(1000);

    By searchButtonSelector2 = By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div[2]/button[1]");
    WebElement searchButton2 = driver.findElement(searchButtonSelector2);
    searchButton2.click();

    Thread.sleep(2000);

    By searchInputSelector = By.xpath("//*[@id=\"fleaMarketSearchInput\"]");
    By searchButtonSelector = By.xpath("//*[@id=\"fleaMarketSearch\"]/div/form/button");


    WebElement searchInput = driver.findElement(searchInputSelector);
    WebElement searchButton = driver.findElement(searchButtonSelector);

    searchInput.sendKeys("ноутбук");
    searchButton.click();



    By linkToProductPageSelector = By.xpath("//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/div/table/tbody/tr/td/h2/a");
    WebElement linkToProductPage = driver.findElement(linkToProductPageSelector);

    String href = linkToProductPage.getAttribute("href");
    driver.get(href);
    Thread.sleep(2000);

    driver.quit();
  }
}
