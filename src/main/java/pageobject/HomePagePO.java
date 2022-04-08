package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class HomePagePO {
    WebDriver driver;
    SeleniumHelpers selenium;
    public HomePagePO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    /*
     * All WebElements are identified by @FindBy annotation
     *
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
     * className, xpath as attributes.
     */

    @FindBy(xpath = "//*[@class='navbar-login']")
    private WebElement iconLogin;

    @FindBy(id = "swal2-content")
    private WebElement messageError;

    @FindBy(xpath = "//*[@class='btn-login']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@class='btn btn-register']")
    private WebElement buttonContinue;


    public void clickOnIconLogin() throws InterruptedException {
        selenium.clickOn(iconLogin);
    }

    public String getLoginMessageError() {

        return selenium.getText(messageError);
    }

    public void clickOnButtonLogin() throws InterruptedException {
        selenium.clickOn(buttonLogin);
    }

    public void clickOnButtonContinue() throws InterruptedException {
        selenium.clickOn(buttonContinue);
    }
}




