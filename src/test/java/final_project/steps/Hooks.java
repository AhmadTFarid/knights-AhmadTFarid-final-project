package final_project.steps;

import final_project.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Utility {

    @Before
    public void openWindow() {
        openBrowser();
    }


@AfterStep
    public void takeScreenShotAfterEachSteps(Scenario scenario){
        byte[] picture = takeScreenshot();

        scenario.attach(picture, "image/png", "testScreenShot");

    }

    @After
    public void closeWindow( ) {

        endBrowser();
    }
}