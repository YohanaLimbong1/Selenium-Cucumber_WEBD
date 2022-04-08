package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class SignupPagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public SignupPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
        //This initElements method will create all WebElements
    }

    /*
     * All WebElements are identified by @FindBy annotation
     *
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
     * className, xpath as attributes.
     */


    @FindBy(xpath = "//*[@class='form-control']")
    private WebElement NameEditText;

    @FindBy(id = "password")
    private WebElement passwordEditText;

    @FindBy(id = "repassword")
    private WebElement passworRetypeEditText;

    @FindBy(id = "fullname")
    private WebElement fullnameEditText;

    @FindBy(id = "datepicker")
    private WebElement birthDateEditText;

    @FindBy(xpath ="//label[contains(text(),'female')]")
    private WebElement gender;

    @FindBy(xpath = "//div[contains(text(),'choose gender')]")
    private WebElement Field;

    @FindBy(id ="fullname")
    private WebElement Fullname;

    @FindBy(id = "signupPhone")
    private WebElement phoneEditText;

    @FindBy(xpath = "//option[contains(.,'August')]")
    private WebElement monthSelect;

    @FindBy(xpath = "//option[contains(.,'27')]")
    private WebElement daySelect;

    @FindBy(xpath = "//option[contains(.,'1998')]")
    private WebElement yearSelect;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg rounded-pill w-100 p-1 font-weight-bold']")
    private WebElement nextButton;

    @FindBy(id = "nextButtonSignupDisabled")
    private WebElement disableNextButton;

    @FindBy(xpath = "//a[@href='https://dev-webd.rctiplus.com/register']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@class='btn btn-register']")
    private WebElement ButtonNext;


    public void enterName(String name) {

        selenium.enterText(NameEditText, name, true);
    }

    public void enterPassword (String password){

        selenium.enterText(passwordEditText, password, true);
    }

    public void enterRetypePassword(String retype) {

        selenium.enterText(passworRetypeEditText, retype, true);
    }

    public void enterFullname(String fullname) {

        selenium.enterText(fullnameEditText, fullname, true);
    }

    public void enterBirthdate(String birthDate) {

        selenium.enterText(birthDateEditText, birthDate, true);
    }

    public boolean checkNextButtonIsDisable() {

        return selenium.waitTillElementIsVisible(disableNextButton)!= null;
    }

    public void enterPhone (String phone){

        selenium.enterText(phoneEditText, phone, true);
    }

    public void selectMonth() throws InterruptedException {
       selenium.clickOn(monthSelect);
    }

    public void selectDay() throws InterruptedException {
        selenium.clickOn(daySelect);
    }

    public void selectYear() throws InterruptedException {
        selenium.clickOn(yearSelect);
    }

    public void clickOnNextButton() throws InterruptedException {
        selenium.clickOn(nextButton);
    }

    public void clickOnRegister() throws InterruptedException {
        selenium.clickOn(registerButton);
    }


    public void clicOnButtonNext() throws InterruptedException {
        selenium.clickOn(ButtonNext);
    }

    public void clickonGender() throws InterruptedException {
        selenium.clickOn(gender);
    }

    public void clickonFullname() throws InterruptedException {
        selenium.clickOn(Fullname);
    }

    public void clickonFieldGender() throws InterruptedException {
        selenium.clickOn(Field);
    }
}