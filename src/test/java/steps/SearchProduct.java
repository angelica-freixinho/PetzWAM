package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProduct {
    @Given("^I access Petz homepage$")
    public void iAccessPetzHomepage() {
    }

    @When("^I search \"([^\"]*)\"$")
    public void iSearch(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }

    @Then("^I see a list of product \"([^\"]*)\"$")
    public void iSeeAListOfProduct(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click at product \"([^\"]*)\"$")
    public void iClickAtProduct(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^show the title \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void showTheTitleAndPrice(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
