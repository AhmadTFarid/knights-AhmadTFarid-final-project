package final_project.steps;

import final_project.baseSetup.superClass;
import final_project.commendSteps.pageSteps;
import final_project.utility.Utility;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlansPage extends Utility {

    @And("click Plans Page")
    public void PlansPageValidation() throws InterruptedException {
       clickButton(pageSteps.clickButton);
        Thread.sleep(1000);

    }

    @And("Validate rows of data is present")
    public void validateRowOfDataIsPresent() {
        getAllElements(By.xpath("/html/body/div[1]/div/div[3]/div/div/div"));



    }
}