package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/results/rcti+/cucumber-report.json",  "html:target/results/rcti+"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"@Signup"} )
public class rctiTestRunner extends BaseTestRunner {}
