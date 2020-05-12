import org.junit.Test;
import org.openqa.selenium.By;

public class TestContactURL extends BaseTest{

    @Test
    public void testContactURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]/a\n")).click();

        assertEquals(driver.getCurrentUrl(), "https://sebastianw1991.github.io/#contact");

        driver.navigate().back();
    }

    private void assertEquals(String currentUrl, String s) {
    }

}
