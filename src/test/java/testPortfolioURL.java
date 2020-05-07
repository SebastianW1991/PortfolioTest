import org.junit.Test;
import org.openqa.selenium.By;

public class testPortfolioURL extends BaseTest {
    String properPortfolioURL ="https://sebastianw1991.github.io/#portfolio";
    @Test
    public void testPortfolioURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[4]/a\n")).click();
        int portfolioURLCompare = driver.getCurrentUrl().compareTo(properPortfolioURL);
        System.out.println(portfolioURLCompare);
        if (portfolioURLCompare == 0) {
            System.out.println("Portfolio section subpage has correct URL");
        } else {
            System.out.println("Portfolio section has incorrect URL, actual URL is : "+ driver.getCurrentUrl()+"" );


        }
        driver.navigate().back();
    }

}
