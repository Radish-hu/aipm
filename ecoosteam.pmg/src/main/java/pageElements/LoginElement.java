package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Config;
import utils.ObjectMap;

public class LoginElement {
    private WebElement element=null;
    private ObjectMap objectMap=new ObjectMap(Config.PROPERTIES);
    private WebDriver driver;

    public LoginElement(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement userName() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.username"));
        return element;
    }
    public WebElement passWord() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.password"));
        return element;
    }
    public WebElement submit() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.submit"));
        return element;
    }
}
