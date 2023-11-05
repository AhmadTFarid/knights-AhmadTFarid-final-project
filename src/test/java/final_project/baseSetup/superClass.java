package final_project.baseSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class superClass {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://dev.insurance.tekschool-students.com/ ");
        driver.manage().window().maximize();
    }

    public void endBrowser(){
        driver.quit();
    }
}


