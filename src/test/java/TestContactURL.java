import org.junit.Test;
import org.openqa.selenium.By;

public class TestContactURL extends BaseTest{
    String properContactURL ="https://sebastianw1991.github.io/#contact";
    @Test
    public void testContactURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]/a\n")).click();
        int contactURLCompare = driver.getCurrentUrl().compareTo(properContactURL);
        System.out.println(contactURLCompare);
        if (contactURLCompare == 0) {
            System.out.println("Contact section subpage has correct URL");
        } else {
            System.out.println("Contact section has incorrect URL, actual URL is : "+ driver.getCurrentUrl()+"" );


        }
        driver.navigate().back();
    }

}
