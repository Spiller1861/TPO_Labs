import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverTest {

    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private OnlinerPage onlinerPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "F:\\study\\study\\6_sem\\TPO\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        onlinerPage = new OnlinerPage(driver);
    }

    @Test
    public void testSearchForum() throws InterruptedException {
        homePage.open();
        Thread.sleep(3000);
        homePage.clickInitialSearchButton();
        Thread.sleep(2000);
        homePage.searchFor("ноутбук");
        searchResultsPage.openFirstProduct();
        Thread.sleep(2000);
    }
    @Test
    public void testSearchOnliner() throws InterruptedException {
        onlinerPage.open();
        Thread.sleep(1000);
        onlinerPage.searchFor("ноутбук");
        Thread.sleep(2000);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
