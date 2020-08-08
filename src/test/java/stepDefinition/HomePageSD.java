package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import runnerTest.webPage.HomePage;
import util.BasePage;



public class HomePageSD {

    private HomePage homePage= new HomePage();

    @Given("^I am on Darksky HomePage$")

    public void IamOnHomePage(){

        Assert.assertEquals(BasePage.get().getTitle(), "Dark Sky - Broadway, New York, NY");

    }
    @When("^I click today area on HomePage$")
    public void clickToday(){
        homePage.temperature();
    }
    @And("^I get temperatures on HomePage$")
    public void allTemperatures(){
        System.out.println(homePage.getTempList());
    }
    @And("^I get min temperature on HomePage$")
    public void getMin(){
        System.out.println(homePage.minTemp());
    }
    @And("^I get max temperature on HomePage$")
    public void getMax(){
        System.out.println(homePage.maxTemp());
    }
    @Then("^I verify min temperature on HomePage$")
    public void verifyMinTemp(){
        boolean result = homePage.verifyMin() == homePage.minTemp();
        Assert.assertFalse("Different values", result);
    }
    @Then("^I verify max temperature on HomePage$")

    public void verifyMaxTemp(){
        boolean maxResult = homePage.verifyMax() == homePage.maxTemp();
        Assert.assertFalse("Different values", maxResult);
    }



}
