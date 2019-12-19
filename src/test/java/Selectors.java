import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors extends TestBase {

    @Test
    public  void  WikiElementsTest(){
        dr.get("https://www.wikipedia.org/");
        dr.findElement(By.cssSelector("#js-link-box-ru")).click();
        dr.navigate().back();
        dr.findElement(By.xpath("//*[@id='js-link-box-ja']")).click();
    }

}
