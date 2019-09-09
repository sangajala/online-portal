package starter.navigation.dashboard;

import org.openqa.selenium.By;

public class DashboardLocators {

    static By PANEL_TITLE = By.className("panel-title");
    static By PASSWORD_FIELD = By.id("inputPassword");
    static By SIGN_IN_FORM = By.tagName("button");

    static class leftPanel{
         static By LEFT_MENU = By.cssSelector("ul.site-menu.ng-scope");
    }
}
