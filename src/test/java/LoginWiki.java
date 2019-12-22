import org.testng.annotations.Test;

public class LoginWiki extends TestBase {

   @Test
   public void openChromeTest() throws InterruptedException {
      openSite("https://www.wikipedia.org/");
      selectLangEN("en");
      initLogin();
      fillLoginForm("Nasta", "123456");
      pressSubmit();
   }
}
