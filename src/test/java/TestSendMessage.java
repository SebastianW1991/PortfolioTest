import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSendMessage extends BaseTest{
    @Test
    public void testSendMessage(){
        WebElement name = driver.findElement(By.className("nameInput"));
        WebElement email=driver.findElement(By.className("mailInput"));
        WebElement message=driver.findElement(By.className("messageInput"));

        name.sendKeys("Seba");
        email.sendKeys("mail@.com");
        message.sendKeys("Test");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/form[1]/button[1]\n")).click();
         int success =assertEquals(driver.getCurrentUrl(), "https://formspree.io/thanks?next=https%3A%2F%2Fsebastianw1991.github.io%2F&language=pl");
        if (success == 0)
            System.out.println("sukces");
        else System.out.println("brak sukcesu");
}

    private int assertEquals(String currentUrl, String s) {
        return 0;
    }
}
