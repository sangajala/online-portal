package starter.inbox;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import starter.navigation.dashboard.DashboardLocators;

import java.io.IOException;
//import starter.search.SearchForm;

public class Inbox extends UIInteractionSteps {

//    @Step("he login with valid credentials")
    public void addFeed(String text) throws IOException, InterruptedException {
        Thread.sleep(3000);
        $(InboxLocators.FEEDTEXT).sendKeys(text);
        $(InboxLocators.START).click();
    }

    public String getLastFeedText(){
        return $(InboxLocators.LASTFEED).getText();
    }


}
