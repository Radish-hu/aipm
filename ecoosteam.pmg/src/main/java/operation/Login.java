package operation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageElements.LoginElement;
import utils.Config;

public class Login {
    public static void execute(WebDriver driver) throws Exception {
        LoginElement login=new LoginElement(driver);
        driver.get(Config.PMGURL);
        login.userName().sendKeys(Config.USERNAME);
        login.passWord().sendKeys(Config.PASSWORD);
        login.submit().click();
        Thread.sleep(2000);
    }
}
