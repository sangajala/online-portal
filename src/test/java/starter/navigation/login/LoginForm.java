package starter.navigation.login;

import net.serenitybdd.core.steps.UIInteractionSteps;

import java.io.IOException;
//import starter.search.SearchForm;

public class LoginForm extends UIInteractionSteps {

//    @Step("he login with valid credentials")
    public void login() throws IOException {

        String username = "lakshmi@bananaapps.co.uk";
        String password = "Bananaapps2";
        $(LoginLocators.USERNAME_FIELD).type(username);
        $(LoginLocators.PASSWORD_FIELD).type(password);
        $(LoginLocators.SIGN_IN_FORM).click();
    }
}
