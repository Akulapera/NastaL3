import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TelRan extends TestBase{
    @Test
    public  void doingSomethingSiteTelRan(){
        openSite("https://www.tel-ran.com/");

        selectItemOfMenu("comp-k2d3m6ja1label");
        String s1 = getArticleName("comp-k2iv941f");
        System.out.println(s1);

        selectItemOfMenu("comp-k2d3m6ja2label");
        String s2= getArticleName("comp-k2lwlhsp");
        System.out.println(s2);

        selectItemOfMenu("comp-k2d3m6ja3label");
        String s3= getArticleName("comp-k2yjzeum");
        System.out.println(s3);

        selectItemOfMenu("comp-k2d3m6ja4label");
        String s4= getArticleName("comp-k2yoaibp");
        System.out.println(s4);

        selectItemOfMenu("comp-k2d3m6ja5label");
        String s5= getArticleName("comp-k2yqvjis");
        System.out.println(s5);

        selectItemOfMenu("comp-k2d3m6ja6label");
        String s6= getArticleName("comp-k2ysntl7");
        System.out.println(s6);
    }
}
