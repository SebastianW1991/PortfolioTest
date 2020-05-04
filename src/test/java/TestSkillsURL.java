import org.junit.Test;
import org.openqa.selenium.By;

public class TestSkillsURL extends BaseTest {
    String properSkillsURL ="https://sebastianw1991.github.io/#skills";
    @Test
    public void testSkillsURL(){
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a\n")).click();
        int skillsURLCompare = driver.getCurrentUrl().compareTo(properSkillsURL);
        System.out.println(skillsURLCompare);
        if (skillsURLCompare == 0) {
            System.out.println("About section subpage has correct URL");
        } else {
            System.out.println("About section has incorrect URL, actual URL is : "+ driver.getCurrentUrl()+"" );


        }
        driver.navigate().back();
    }

}
