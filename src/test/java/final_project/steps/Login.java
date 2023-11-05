package final_project.steps;

import final_project.commendSteps.pageSteps;
import final_project.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login extends Utility {
    @Given("click the login bottom")
    public void clickTheLoginBottom() {
        clickButton(pageSteps.loginButton);
    }

    @And("input Password as {string}")
    public void inputPasswordAs(String password) {
        enterValue(pageSteps.password, password);

    }
}