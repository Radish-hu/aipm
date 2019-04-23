package cases.projectManager;

import operation.Login;
import operation.ProjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CreateDriver;

public class AddProjectCase{
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
    }
    //@Test(priority = 1)
    public void execute() throws Exception {
        Login.execute(driver);
        ProjectManager.projectMenu(driver);
        ProjectManager.addProject(driver);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
        driver.quit();
    }
}
