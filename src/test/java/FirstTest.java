import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends TestBase {

    @Test
    public void openChromeTest() throws InterruptedException {
        dr.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        dr.findElement(By.name("search")).click();
        dr.findElement(By.name("search")).clear();
        dr.findElement(By.name("search")).sendKeys("Java");
        Thread.sleep(2000);
        dr.findElement(new By.ByClassName("pure-button")).click();
        Thread.sleep(2000);
    }

}


