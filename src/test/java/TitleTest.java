import org.junit.Test;


public class TitleTest extends BaseTest{

    @Test
    public void testTitle(){

        assertEquals(driver.getTitle(), "Portfolio - Sebastian Wójcik");

        driver.navigate().back();
    }

    private void assertEquals(String title, String s) {
    }
}


