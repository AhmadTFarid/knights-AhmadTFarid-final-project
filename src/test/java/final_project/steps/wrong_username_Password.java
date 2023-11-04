package final_project.steps;

import final_project.commendSteps.pageSteps;
import final_project.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class wrong_username_Password extends Utility {


    @Given("input wrong Username as {string}")
    public void wrongUsernamePassword(String wrongUsername) {
        enterValue(pageSteps.userName,wrongUsername);


    }

    @And("input wrong Password as {string}")
    public void inputWrongPasswordAs(String wrongPassword) {
        enterValue(pageSteps.password,wrongPassword);
    }


    @And("validate selected show per page")
    public void table_records() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i <= 3; i++) {
            getDriver().findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);

        }}
}