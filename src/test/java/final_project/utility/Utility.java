package final_project.utility;

import final_project.baseSetup.superClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Utility extends superClass {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    }

    public WebElement getVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getElementText(By locator) {
        WebElement element = getVisibilityOfElement(locator);
        return element.getText();
    }


    public void isButtonExist(By locator) {
        WebElement element = getVisibilityOfElement(locator);
        element.isEnabled();

    }

    public void clickButton(By locator) {
        WebElement buttonElement = getVisibilityOfElement(locator);
        buttonElement.click();


    }

    public void enterValue(By locator, String text) {
        WebElement element = getVisibilityOfElement(locator);
        element.sendKeys(text);
    }

    public byte[] takeScreenshot() {

        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);


    }
    public void getAllElements(By locator) {
        List<WebElement> linkElements = getDriver().findElements(locator);
        for (WebElement linkElement : linkElements) {
            String linkText = linkElement.getText();
            System.out.print(linkText);
        }

    }}

