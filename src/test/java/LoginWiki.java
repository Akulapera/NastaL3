import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWiki extends TestBase {

   @Test
   public void openChromeTest() throws InterruptedException {
      dr.get("https://www.wikipedia.org/");
      Thread.sleep(1000);
      dr.findElement(new By.ById("js-link-box-en")).click();
      dr.findElement(new By.ById("pt-login")).click();
      dr.findElement(new By.ById("wpName1")).click();
      dr.findElement(new By.ById("wpName1")).clear();
      dr.findElement(new By.ById("wpName1")).sendKeys("Nasta");
      Thread.sleep(1000);
      dr.findElement(new By.ByName("wpPassword")).click();
      dr.findElement(new By.ByName("wpPassword")).clear();
      dr.findElement(new By.ByName("wpPassword")).sendKeys("password12345");
      Thread.sleep(1000);
      dr.findElement(new By.ByClassName("mw-htmlform-submit")).click();
      Thread.sleep(2000);
   }
}
