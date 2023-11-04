package final_project.steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import final_project.utility.Utility;

import java.util.List;

public class profileValidateInformation extends Utility {


    @And("click on profile button")
    public void profile_button() throws InterruptedException {

        clickButton(By.xpath("/html/body/div[1]/div/div[1]/div/button"));
        Thread.sleep(1000);

    }

    @And("validate information is in Profile")
    public void validateInformation() {
      getAllElements(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div"));



    }
}