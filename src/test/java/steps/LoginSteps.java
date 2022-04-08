package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPagePO;
import utilities.ThreadManager;

public class LoginSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private LoginPagePO loginPage = new LoginPagePO(driver);

    @When("user memasukkan email akun rcti+ {string}")
    public void userMemasukkanEmailAkunRcti(String email) {
        loginPage.enterEmail(email);
    }

    @And("user memasukkan password akun rcti+ {string}")
    public void userMemasukkanPasswordAkunRcti(String password) {
        loginPage.enterPassword(password);
    }

    @Then("user mengklik login button")
    public void userMengklikLoginButton() throws InterruptedException {
        loginPage.clickOnLoginButon();
    }
}

