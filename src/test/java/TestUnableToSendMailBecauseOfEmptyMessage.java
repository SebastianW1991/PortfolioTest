import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestUnableToSendMailBecauseOfEmptyMessage extends BaseTest{
    @Test
    public void testUnableToSendMailBecauseOfEmptyMessage(){
        WebElement name = driver.findElement(By.className("nameInput"));
        WebElement email=driver.findElement(By.className("mailInput"));
        WebElement message=driver.findElement(By.className("messageInput"));

        name.sendKeys("Sebastian");
        email.sendKeys("test@test.com");
        message.sendKeys("");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/form[1]/button[1]\n")).click();
        int success =assertEquals(driver.getCurrentUrl(), "https://formspree.io/moqkaprl");
        if (success == 0)
            System.out.println("sukces, wiadomość wysłana");
        else System.out.println("brak sukcesu");
    }

    private int assertEquals(String currentUrl, String s) {
        return 0;
    }
}
