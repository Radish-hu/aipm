package cases.projectManager;

import operation.Login;
import operation.ProjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageElements.ProjectManagerElement;
import utils.CreateDriver;

import static operation.ProjectManager.setProjectName;

public class UpdateProjectCase {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
    }
    //@Test(priority = 3)
    public void execute() throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        Login.execute(driver);
        ProjectManager.projectMenu(driver);
        ProjectManager.updateProject(driver);
        String expect=setProjectName;
        String actual=pm.searchResultProjectName().getText();
        Assert.assertEquals(expect,actual);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
        driver.quit();
    }
}
