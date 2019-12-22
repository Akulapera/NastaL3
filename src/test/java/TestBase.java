import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver dr;

    @BeforeMethod
    public void setUp() {
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        dr.quit();
    }

    public void openSite(String url) {
        dr.get(url);
    }

    public void pressSubmit() {
       dr.findElement(new By.ByClassName("mw-htmlform-submit")).click();
    }

    public void selectLang(String local) {
       dr.findElement(new By.ById("js-link-box-"+ local)).click();
    }

    public void initLogin() {
       dr.findElement(new By.ById("pt-login")).click();
    }

    public void fillLoginForm(String user, String password) {
       type(new By.ById("wpName1"), user);
       type(new By.ByName("wpPassword"), password);
    }

    public void type(By.ByName locator, String text) {
       dr.findElement(locator).click();
       dr.findElement(locator).clear();
       dr.findElement(locator).sendKeys(text);
    }

    public void type(By.ById locator, String text) {
       dr.findElement(locator).click();
       dr.findElement(locator).clear();
       dr.findElement(locator).sendKeys(text);
    }

    public String getArticleName(String locator) {
        return dr.findElement(By.id(locator)).getText();
    }

    public void selectItemOfMenu(String locatorItemOfMenu) {
        dr.findElement(By.id(locatorItemOfMenu)).click();
    }

    public void printArticleName(String itemOfMenu, String ArticleLocator) {
        selectItemOfMenu(itemOfMenu);
        String s1 = getArticleName(ArticleLocator);
        System.out.println(s1);
    }
}
