package final_project.steps;

import final_project.commendSteps.commendSteps;
import final_project.commendSteps.pageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import final_project.utility.Utility;
import org.openqa.selenium.WebElement;

import java.util.List;

public class createAccount extends Utility {


    @And("fill up the form")
    public void fillUpTheForm() {
        enterValue(By.id("email"), "a.tariq.farid@gmail.com");
        enterValue(By.id("firstName"), "Ahmad");
        enterValue(By.id("lastName"), "Farid");
        enterValue(By.id("employmentStatus"), "Software Tester");
        enterValue(By.id("gender"), "Male");
        enterValue(By.id("title"), "Mr.");
        enterValue(By.name("maritalStatus"), "MARRIED");
        enterValue(By.id("dateOfBirth"), "09/05/1988");


    }

    @And("click on create Account Button")
    public void clickOnCreateAccountButton() {
        clickButton(pageSteps.createAccountButton);

    }

    @And("navigate to Sing up your Account page")
    public void navigateToSingUpYourAccountPage()  {
        getElementText(commendSteps.applicationTitle);


    }

    @Then("existing email address and validate error message")
    public void existingEmailAddressAndValidateErrorMessage() {
        String errorMassageElement = getElementText(commendSteps.errorMassage);
        System.out.println(errorMassageElement);

    }

    @When("click Create Primary Account bottom")
    public void createPrimaryAccount() {
        clickButton(pageSteps.createPrimaryAccount);


    }

    @Given("Expected page title should be {string}")
    public void expectedPageTitleShouldBe(String actualTitle) {
        String expectedTitle = getElementText(commendSteps.pageTitle);
        Assert.assertEquals("validate title", expectedTitle, actualTitle);
        System.out.println(expectedTitle);

    }

    @And("click Accounts page")
    public void Accountable() throws InterruptedException {
        clickButton(pageSteps.AccountsPageButton);
        Thread.sleep(1000);

    }

    @And("verify five row per page is default")
    public void verifyFiveRowAccount() {
        getAllElements(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table"));


    }
}