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

import static operation.ProjectManager.projectName;

public class SearchProjectCase {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
    }
    //@Test(priority = 2)
    public void execute() throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        Login.execute(driver);
        ProjectManager.searchProject(driver);
        String expect=projectName;
        System.out.println("预期值:"+expect);
        String actual=pm.searchResultProjectName().getText();
        System.out.println("实际值:"+actual);
        Assert.assertEquals(expect,actual);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
        driver.quit();
    }
}
