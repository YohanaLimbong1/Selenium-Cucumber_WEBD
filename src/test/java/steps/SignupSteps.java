package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.SignupPagePO;
import utilities.ThreadManager;

import static java.lang.Thread.sleep;

public class SignupSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private SignupPagePO signupPage = new SignupPagePO(driver);


    @When("user input on username signup {string}")
    public void userInputOnUsernameSignup(String username) {

        signupPage.enterName(username);
    }

    @When("user input on password signup {string}")
    public void userInputOnPasswordSignup(String password) {

        signupPage.enterPassword(password);
    }

    @And("user input re-type password {string}")
    public void userInputReTypePassword(String retype) {
        signupPage.enterRetypePassword(retype);
    }

    @And("user input on fullname {string}")
    public void userInputOnFullname(String fullname) {
        signupPage.enterFullname(fullname);
    }

    @And("user input on birth date {string}")
    public void userInputOnBirthDate(String birthDate) {
        signupPage.enterBirthdate(birthDate);
    }

    @Then("user see Next Button is disable")
    public void userSeeNextButtonIsDisable() {
        Assert.assertTrue(signupPage.checkNextButtonIsDisable());

    }

    @When("user input on twitty signup Phone {string}")
    public void userInpuOntTwittySignPhone(String phone) {

        signupPage.enterPhone(phone);
    }

    @Then("user click on twitty Next button")
    public void userClickOnTwittyNextButton() throws InterruptedException {
        signupPage.clickOnNextButton();
    }

    @And("user select on twityy signup date Month of birth")
    public void userSelectOnTwityySignupDateMonthOfBirth() throws InterruptedException {
        signupPage.selectMonth();
    }

    @And("user select on twityy signup date day  of birth")
    public void userSelectOnTwityySignupDateDayOfBirth() throws InterruptedException {
        signupPage.selectDay();
    }

    @And("user select on twityy signup date Year  of birth")
    public void userSelectOnTwityySignupDateYearOfBirth() throws InterruptedException {
        signupPage.selectYear();
    }

    @And("user mengklik button register")
    public void userMengklikButtonRegister() throws InterruptedException {
        signupPage.clickOnRegister();
    }

    @Then("user click button next")
    public void userClickButtonNext() throws InterruptedException {
        signupPage.clicOnButtonNext();
    }

    @And("user click gender")
    public void userClickGender() throws InterruptedException {
        signupPage.clickonGender();
    }

    @And("user click field fullname")
    public void userClickFieldFullname() throws InterruptedException {
        signupPage.clickonFullname();
    }

    @And("user click field gender")
    public void userClickFieldGender() throws InterruptedException {
        signupPage.clickonFieldGender();
    }

    @Then("sleep waiting second")
    public void sleepWaitingSecond() throws InterruptedException {
        sleep(5000);
    }
}
