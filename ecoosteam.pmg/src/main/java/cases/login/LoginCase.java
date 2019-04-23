package cases.login;

import operation.Login;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.CreateDriver;

public class LoginCase {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
    }
    //@Test
    public void execute() throws Exception {
        Login.execute(driver);
        String expect="运营管理后台-项目管理";
        String actual=driver.getTitle();
        Assert.assertEquals(expect,actual);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
        driver.quit();
    }

}
