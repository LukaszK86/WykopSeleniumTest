import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortPosts extends FunctionalTestSetup {

    // public static void main(String[] args) throws Exception {

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.wykop.pl/mikroblog/");


    //List<WebElement> popularList = driver.findElements(By.cssSelector("li[class='entry ic']> div[data-type='entry']>p[class='vC']"));

    List<WebElement> popularList = driver.findElements(By.className("c2a7017"));

    public List<WebElement> displayThreeMostPopularComments() {

        int[] linkList = new int[popularList.size()];
        for (int i = 0; i < linkList.length; i++) {
            linkList[i] = Integer.parseInt(driver.findElements(By.className("c2a7017")).get(i).getText());  //c2a7017
        }


        Arrays.sort(linkList);
        for (int ex : linkList) {
        }


        System.out.println("The most popular comment have the number of likes: " + linkList[popularList.size() - 1]);
        System.out.println("The second popular comment have the number of likes: " + linkList[popularList.size() - 2]);
        System.out.println("The third popular comment have the number of likes: " + linkList[popularList.size() - 3]);
        System.out.println();
        System.out.println();
        return popularList;
    }



}







