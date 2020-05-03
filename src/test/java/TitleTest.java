import org.junit.Test;


public class TitleTest extends BaseTest{
    String properTitle= "Portfolio - Sebastian Wójcik";
    @Test
    public void testTitle(){

        int TitleCompare = driver.getTitle().compareTo(properTitle);
        System.out.println(TitleCompare);
        if (TitleCompare == 0) {
            System.out.println("Page has correct title");
        } else {
            System.out.println("Page has incorrect title, actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}


