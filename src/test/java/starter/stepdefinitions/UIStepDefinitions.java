package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.inbox.Inbox;
import starter.navigation.NavigateTo;
import starter.navigation.dashboard.Dashboard;
import starter.navigation.login.LoginForm;
import starter.search.SearchFor;
import starter.search.SearchResult;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class UIStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Steps
    LoginForm loginFor;

    @Steps
    Dashboard dashboard;

    @Steps
    Inbox inbox;

    @Given("^(?:.*) is on the DuckDuckGo home page")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.thePatientPortalPage();
    }

    @When("s?he searches for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }

    @Then("all the result titles should contain the word \"(.*)\"")
    public void all_the_result_titles_should_contain_the_word(String term) {
        assertThat(searchResult.titles())
                .matches(results -> results.size() > 0)
                .allMatch(title -> textOf(title).containsIgnoringCase(term));
    }

    @Given("patient is in login page")
    public void patientIsInLoginPage() {
//        navigateTo.thePatientPortalPage();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/mac/chromedriver");
        loginFor.open();
    }

    @When("he login with valid credentials")
    public void heLoginWithValidCredentials() throws IOException {
            loginFor.login();
    }

    @Then("he should be able in see dashboard")
    public void heShouldBeAbleInSeeDashboard() throws Exception{
        assertThat(dashboard.dashBoardTitle().contains("Your upcoming appointments"));
    }

    @When("he navigate to inbox")
    public void heNavigateToInbox() {
        dashboard.gotoMenu("Inbox");
    }

    @When("he start a feed with text {string}")
    public void heStartAFeedWithText(String text) throws IOException, InterruptedException {
        inbox.addFeed(text);
    }

    @Then("the feed should be shown with {string}")
    public void theFeedShouldBeShownWith(String expText) {
        assertThat(inbox.getLastFeedText().contains(expText));
    }


}
