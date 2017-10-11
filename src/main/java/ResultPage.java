import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class ResultPage {


@FindBy(how=How.LINK_TEXT,using = "6h")
    WebElement time6h;

public void clickTime6h (){
    time6h.click();


}

}
