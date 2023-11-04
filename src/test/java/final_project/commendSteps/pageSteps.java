package final_project.commendSteps;

import final_project.utility.Utility;
import org.openqa.selenium.By;

public class pageSteps extends Utility {


    public final static By userName = By.id("username");
    public final static By password = By.id("password");
    public final static  By buttonEnable = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");

    public final static  By clickButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]");
    public final static  By createAccountButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");
    public final static  By createPrimaryAccount= By.xpath("/html/body/div[1]/div/div[2]/div/div/a");
    public final static By AccountsPageButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[1]");
    public final static By profileButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public final static By loginButton = By.xpath("/html/body/div[1]/div/div[1]/div/a[2]");


}
