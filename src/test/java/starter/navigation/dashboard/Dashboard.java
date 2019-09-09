package starter.navigation.dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import starter.navigation.login.LoginForm;

import java.io.IOException;
//import starter.search.SearchForm;

public class Dashboard extends UIInteractionSteps {

//    @Step("he login with valid credentials")
    public String dashBoardTitle() throws IOException {
        return $(DashboardLocators.PANEL_TITLE).getText();
    }

    public void gotoMenu(String menu) {
        getDriver().
                findElement(By.linkText(menu)).click();
    }
}
