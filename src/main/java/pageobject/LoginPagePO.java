package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class LoginPagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
        //This initElements method will create all WebElements
    }

        @FindBy(id = "username")
        private WebElement UsernameEditText;

        @FindBy(id = "password")
        private WebElement PasswordEditText;

        @FindBy(xpath = "//*[@class='btn btn-register']")
        private WebElement loginButton;


        public void enterEmail(String email) {
            selenium.enterText(UsernameEditText, email, true);
    }

        public void enterPassword(String Password)
    {
        selenium.enterText(PasswordEditText, Password, true);
    }

        public void clickOnLoginButon() throws InterruptedException {
        selenium.clickOn(loginButton);
    }
}
