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
    private CatalogPage catalogPage;
    private YslPage yslPage;
    private ProductPage productPage;
    private ForumPage forumPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "F:\\study\\study\\6_sem\\TPO\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        onlinerPage = new OnlinerPage(driver);
        catalogPage = new CatalogPage(driver);
        yslPage = new YslPage(driver);
        productPage = new ProductPage(driver);
        forumPage = new ForumPage(driver);
    }

    @Test
    public void testSearchForum() throws InterruptedException {
        homePage.open();
        Thread.sleep(5000);
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
    @Test
    public void testClickSpecificLink() {
        onlinerPage.open();
        onlinerPage.clickSpecificLink();
    }
    @Test
    public void testClickAutoBarah() throws InterruptedException {
        onlinerPage.open();
        driver.manage().window().maximize();
        onlinerPage.clickAutoBarah();
    }
    @Test
    public void testClickCatalogPrice() throws InterruptedException {
        onlinerPage.open();
        driver.manage().window().maximize();
        onlinerPage.clickCatalogSelector();
        catalogPage.openSuperPrice();
    }
    @Test
    public void testClickYslPage() throws InterruptedException {
        onlinerPage.open();
        driver.manage().window().maximize();
        onlinerPage.clickYslSelector();
        yslPage.openYslPrice();
    }
    @Test
    public void testClickView() throws InterruptedException {
        productPage.open();
        driver.manage().window().maximize();
        productPage.openProductsView();
    }
    @Test
    public void testClickNews() throws InterruptedException {
        onlinerPage.open();
        driver.manage().window().maximize();
        onlinerPage.clickNews();
    }
    @Test
    public void testClickOb() throws InterruptedException {
        productPage.open();
        driver.manage().window().maximize();
        productPage.openProductsOb();
    }
@Test
public void testClickForum() throws InterruptedException {
    onlinerPage.open();
    driver.manage().window().maximize();
    onlinerPage.clickForum();
    Thread.sleep(1000);
    forumPage.openSuperPrice();
}
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
