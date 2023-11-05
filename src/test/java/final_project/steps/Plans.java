package final_project.steps;

import final_project.commendSteps.pageSteps;
import final_project.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Plans extends Utility {

    @And("click Plans Page")
    public void PlansPageValidation() throws InterruptedException {
       clickButton(pageSteps.clickButton);
        Thread.sleep(1000);

    }

    @And("Validate rows of data is present")
    public void validateRowOfDataIsPresent() {
        getAllElements(By.xpath("/html/body/div[1]/div/div[3]/div/div/div"));

    }

    @Then("Validate Date Created for DATATable {string} and {string}")
    public void DateValidationPlans(String ExpectedCreated, String ExpectedExpiry){
        String ActualCreatedDate = getVisibilityOfElement(pageSteps.tableCreatedDate).getText();
        String ActualExpiryDate = getVisibilityOfElement(pageSteps.tableExpiryDate).getText();
        Assert.assertEquals("Validation of Created Date",ExpectedCreated,ActualCreatedDate);
        Assert.assertEquals("Validation of Expiry Date", ExpectedExpiry,ActualExpiryDate);
}}