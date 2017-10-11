import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class MainPage {

//   WebDriver driver = new ChromeDriver();
//
//    public MainPage (WebDriver driver){
//
//        this.driver=driver;
//    }

    @FindBy (how= How.LINK_TEXT,using="Mikroblog")
    WebElement microblog;

    public void clickMicroblog (){
        microblog.click();

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




}
