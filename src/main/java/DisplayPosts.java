import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class DisplayPosts extends FunctionalTestSetup {


    List<WebElement> commentsList = driver.findElements(By.cssSelector("div[data-type='entry']"));

    public void DisplayAllPosts() {
        for (WebElement e : commentsList) {
            String linkText = e.getText();
            System.out.println("Post:" + linkText);
        }
    }
}
