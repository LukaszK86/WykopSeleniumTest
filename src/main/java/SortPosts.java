import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class SortPosts  {

    public static void main (String[] args) throws Exception {

     WebDriver driver = new ChromeDriver();
     driver.get("https://www.wykop.pl/mikroblog/");


 //List<WebElement> popularList = driver.findElements(By.cssSelector("li[class=\"entry ic\"]> div[data-type=\"entry\"]p[class=\"VC\"]"));

        List<WebElement> popularList = driver.findElements(By.cssSelector("li[class='entry ic']"));
 for (WebElement e:popularList){
    String linkList =  e.getText();
     System.out.println(linkList);
 }

    }

 }

