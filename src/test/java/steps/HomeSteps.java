package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.HomePagePO;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class HomeSteps {
    private final WebDriver driver = ThreadManager.getDriver();
    private final HomePagePO mainPage = new HomePagePO(driver);
    private final SeleniumHelpers selenium = new SeleniumHelpers(driver);

    @Given("user access page {string}")
    public void user_access_page(String url) {
        selenium.navigateToPage(url);
    }

    @Then("compare current url with {string}")
    public void compare_url(String url){
        Assert.assertEquals(url, selenium.getURL());
    }


    @Then("user mengklik navigasi bar login Di Mainpage")
    public void userMengklikNavigasiBarLoginDiMainpage() throws InterruptedException {
        mainPage.clickOnIconLogin();
    }

    @And("user mengkllik button login")
    public void userMengkllikButtonLogin() throws InterruptedException {
        mainPage.clickOnButtonLogin();
    }

    @And("user mengklik button continue with email or phone number")
    public void userMengklikButtonContinueWithEmailOrPhoneNumber() throws InterruptedException {
        mainPage.clickOnButtonContinue();

    }

    @And("system menampilkan box message error {string}")
    public void systemMenampilkanBoxMessageError(String messageError) {
        org.testng.Assert.assertEquals(mainPage.getLoginMessageError(), messageError, "Message error not match");
    }

}