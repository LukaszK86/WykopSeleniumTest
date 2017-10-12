import net.bytebuddy.TypeCache;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class MostPopularPosts extends FunctionalTestSetup {

    @Test
    public void displayMostPopularPosts(){

      driver = new ChromeDriver();
     driver.get("http://wykop.pl");
        driver.manage().window().maximize();


     MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
     mainPage.clickMicroblog();

     ResultPage resultPage = PageFactory.initElements(driver, ResultPage.class);
     resultPage.clickTime6h();

        SortPosts sortPosts = PageFactory.initElements(driver,SortPosts.class);
        sortPosts.displayThreeMostPopularComments();

        DisplayPosts displayPosts = PageFactory.initElements(driver, DisplayPosts.class);
        displayPosts.DisplayAllPosts();
    }
}
