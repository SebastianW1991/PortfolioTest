import org.junit.Test;
import org.openqa.selenium.By;

public class TestSkillsURL extends BaseTest {

    @Test
    public void testSkillsURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a\n")).click();

        assertEquals(driver.getCurrentUrl(), "https://sebastianw1991.github.io/#skills");

        driver.navigate().back();
    }

    private void assertEquals(String currentUrl, String s) {
    }

}
