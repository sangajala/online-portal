package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.status.ApplicationStatus;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static starter.status.AppStatus.RUNNING;

public class ApplicationStatusStepDefinitions {

    @Steps
    ApplicationStatus theApplication;

    @Given("the application is running")
    public void the_application_is_running() {
        assertThat(theApplication.currentStatus()).isEqualTo(RUNNING);
    }

    @When("I check the application status")
    public void i_check_the_application_status() {
        theApplication.readStatusMessage();
    }

    @Then("the API should return {string}")
    public void the_API_should_return(String expectedMessage) {

        restAssuredThat(lastResponse -> lastResponse.body(equalTo(expectedMessage)));
    }

    @Then("the API should return with string contains {string}")
    public void the_API_should_return_string(String expectedMessage) {

        restAssuredThat(lastResponse -> lastResponse.statusCode(equalTo(200)));
    }

}
