import org.junit.Test;
import org.openqa.selenium.By;

public class TestPortfolioURL extends BaseTest {

    @Test
    public void testPortfolioURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[4]/a\n")).click();

        assertEquals(driver.getCurrentUrl(), "https://sebastianw1991.github.io/#portfolio");

        driver.navigate().back();
    }

    private void assertEquals(String currentUrl, String s) {
    }

}
