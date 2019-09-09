package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    LoginPage loginPage;

    @Step("patient is in login page")
    public void thePatientPortalPage() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/mac/chromedriver");
        loginPage.open();
    }
}
