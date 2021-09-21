package MyGame.Pages;

import MyGame.Utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BrowserUtil {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='newUser green']")
    private WebElement joinNowButton;

    public void setJoinNowButton() {
        joinNowButton.click();
    }
}

