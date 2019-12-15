import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openChromeTest() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Java");
        Thread.sleep(2000);
        driver.findElement(new By.ByClassName("pure-button")).click();
        Thread.sleep(2000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


