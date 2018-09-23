package stepsdefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {

    WebDriver driver = null;

    @Given("^I have open the browser$")
    public void create_instance() throws Exception {
        driver = new FirefoxDriver();
    }

    @When("^I open (.*) website$")
    public void open_url(String arg1) throws Exception {
        driver.navigate().to("http://www.facebook.com/");
    }

    @Then("^Check current url is (.*)$")
    public void check_url(String url) throws Exception {
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
        driver.close();
    }

}

