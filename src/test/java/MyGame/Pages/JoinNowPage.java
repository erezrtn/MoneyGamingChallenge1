package MyGame.Pages;

import MyGame.Utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JoinNowPage extends BrowserUtil {

    public JoinNowPage(){ PageFactory.initElements(driver,this); }
    @FindBy(xpath = "//Select[@id='title']")
    private WebElement title;
    @FindBy(xpath = "//input[@id='forename']")
    private WebElement firstName;

    public void setTitle(){
        Select drpTitle =new Select(title);
        drpTitle.selectByVisibleText("Mr");
    }
    public void setFirstName(String FirstName) {
        firstName.sendKeys(FirstName);


    }
}
