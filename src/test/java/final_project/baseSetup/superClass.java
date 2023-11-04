package final_project.baseSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class superClass {
    private static WebDriver driver;

    private static final String  url = "https://dev.insurance.tekschool-students.com";

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(url);

    }
    public void endBrowser() {
        driver.quit();
    }



    public static WebDriver
    getDriver() {
        return driver;
    }



}
