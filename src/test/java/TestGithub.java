import org.junit.Test;
import org.openqa.selenium.By;

public class TestGithub extends BaseTest {

    @Test
    public void testGithubLink(){
        driver.findElement(By.xpath("//*[@id=\"contact\"]/form[2]/h3/button")).click();

        assertEquals(driver.getCurrentUrl(), "https://github.com/SebastianW1991");

        driver.navigate().back();

    }

    private void assertEquals(String currentUrl, String s) {
    }
}