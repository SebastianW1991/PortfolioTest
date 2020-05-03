import org.junit.Test;
import org.openqa.selenium.By;

public class TestAboutURL extends BaseTest {
    String properAboutURL ="https://sebastianw1991.github.io/#about";
    @Test
    public void testAboutURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/a\n")).click();
        int aboutURLCompare = driver.getCurrentUrl().compareTo(properAboutURL);
        System.out.println(aboutURLCompare);
        if (aboutURLCompare == 0) {
            System.out.println("About section subpage has correct URL");
        } else {
            System.out.println("About section has incorrect URL, actual URL is : "+ driver.getCurrentUrl()+"" );


        }
        driver.navigate().back();
    }

}
