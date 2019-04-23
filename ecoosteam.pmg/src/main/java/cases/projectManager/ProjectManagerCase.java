package cases.projectManager;

import operation.Login;
import operation.ProjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageElements.ProjectManagerElement;
import utils.CreateDriver;

public class ProjectManagerCase {
    public WebDriver driver;
    public ProjectManagerElement pm;
    @BeforeClass
    public void beforeMethod() throws Exception {
        driver= CreateDriver.getDriver();
        pm=new ProjectManagerElement(driver);
        Login.execute(driver);
        ProjectManager.projectMenu(driver);
        Thread.sleep(1000);
    }
    @Test(priority = 1)
    public void addProject() throws Exception {
        ProjectManager.addProject(driver);
    }
    @Test(priority = 2)
    public void searchProject() throws Exception {
        ProjectManager.searchProject(driver);
    }
    @AfterClass
    public void afterMethod(){
        driver.close();
        driver.quit();
    }
}
