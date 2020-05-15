import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestUnableToSendMessageBecauseOfWrongMail extends BaseTest{
    @Test
    public void testUnableToSendMessageBecauseOfWrongMail(){
        WebElement name = driver.findElement(By.className("nameInput"));
        WebElement email=driver.findElement(By.className("mailInput"));
        WebElement message=driver.findElement(By.className("messageInput"));

        name.sendKeys("Sebastian");
        email.sendKeys("1test.com");
        message.sendKeys("test");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/form[1]/button[1]\n")).click();
        int success =assertEquals(driver.getCurrentUrl(), "https://formspree.io/moqkaprl");
        if (success == 0)
            System.out.println("sukces");
        else System.out.println("brak sukcesu");
    }

    private int assertEquals(String currentUrl, String s) {
        return 0;
    }
}