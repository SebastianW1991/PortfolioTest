import org.junit.Test;


public class TitleTest extends BaseTest{
    String properTitle= "Portfolio - Sebastian WÓjcik";
    @Test
    public void testTitle(){

        int pracaTitleCompare = driver.getTitle().compareTo(properTitle);
        System.out.println(pracaTitleCompare);
        if (pracaTitleCompare == 0) {
            System.out.println("Page has correct title");
        } else {
            System.out.println("Page has incorrect title, actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}


