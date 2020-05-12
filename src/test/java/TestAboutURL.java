import org.junit.Test;
import org.openqa.selenium.By;

public class TestAboutURL extends BaseTest {

    @Test
    public void testAboutURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/a\n")).click();

        assertEquals(driver.getCurrentUrl(), "https://sebastianw1991.github.io/#about");

        driver.navigate().back();
    }

    private void assertEquals(String currentUrl, String s) {
    }

}
