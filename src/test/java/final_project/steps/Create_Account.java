package final_project.steps;

import final_project.commendSteps.pageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import final_project.utility.Utility;

public class Create_Account extends Utility {



    @Given("input Username as {string}")
    public void inputUsernameAs(String username) {
        enterValue(pageSteps.userName,username);





    }
    @And("click on submit Button")
    public void clickOnSubmitButton() throws InterruptedException {
        clickButton(pageSteps.profileButton);
        Thread.sleep(2000);

    }

    @When("validate user navigate to {string}")
    public void validateUserNavigateToCustomerServicePortal(String ActualTitle) {
        String expectedTitle = getElementText(By.xpath("/html/body/div[1]/div/div[1]/div/h2"));
        Assert.assertEquals("validation Title", expectedTitle ,ActualTitle);


    }

    @Given("page title should be {string}")
    public void page_title(String actualTitle) {
        String expectedTitle = getDriver().getTitle();
        Assert.assertEquals("Application Title Validation "
                , expectedTitle
                , actualTitle);


    }

    @Then("Button should be exist")
    public void button_should_be_exist() {
        isButtonExist(pageSteps.buttonEnable);



    }

}
