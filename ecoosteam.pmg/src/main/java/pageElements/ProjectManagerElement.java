package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Config;
import utils.ObjectMap;

public class ProjectManagerElement {
    private WebElement element=null;
    private ObjectMap objectMap=new ObjectMap(Config.PROPERTIES);
    private WebDriver driver;

    public ProjectManagerElement(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement menu_projectManager_Lv1() throws Exception {
        element=driver.findElement(objectMap.getLocator("menu.projectManager_Lv1"));
        return element;
    }
    public WebElement menu_projectManager_Lv2() throws Exception {
        element=driver.findElement(objectMap.getLocator("menu.projectManager_Lv2"));
        return element;
    }

    public WebElement newProjectButton() throws Exception {
        element=driver.findElement(objectMap.getLocator("newProjectButton"));
        return element;
    }

    public WebElement project_sheng() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.sheng"));
        return element;
    }
    public WebElement project_sheng_value() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.sheng.options"));
        return element;
    }

    public WebElement project_city() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.city"));
        return element;
    }
    public WebElement project_city_value() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.city.options"));
        return element;
    }
    public WebElement project_area() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.area"));
        return element;
    }
    public WebElement project_area_value() throws Exception {
        element=driver.findElement(objectMap.getLocator("project.area.options"));
        return element;
    }

    public WebElement newProjectName() throws Exception {
        element=driver.findElement(objectMap.getLocator("newProjectName"));
        return element;
    }

    public WebElement newProjectSave() throws Exception {
        element=driver.findElement(objectMap.getLocator("newProjectSave"));
        return element;
    }

    public WebElement searchProjectName() throws Exception {
        element=driver.findElement(objectMap.getLocator("searchProjectName"));
        return element;
    }

    public WebElement searchProjectButton() throws Exception {
        element=driver.findElement(objectMap.getLocator("searchProjectButton"));
        return element;
    }

    public WebElement searchResultProjectName() throws Exception {
        element=driver.findElement(objectMap.getLocator("searchResultProjectName"));
        return element;
    }

    public WebElement updateProject() throws Exception {
        element=driver.findElement(objectMap.getLocator("updateProject"));
        return element;
    }
    public WebElement updateProjectName() throws Exception {
        element=driver.findElement(objectMap.getLocator("updateProjectName"));
        return element;
    }
    public WebElement updateProjectSave() throws Exception {
        element=driver.findElement(objectMap.getLocator("updateProjectSave"));
        return element;
    }

    public WebElement deleteProject() throws Exception {
        element=driver.findElement(objectMap.getLocator("deleteProject"));
        return element;
    }

    public WebElement menu_buildingManager() throws Exception {
        element=driver.findElement(objectMap.getLocator("menu.buildingManager"));
        return element;
    }
    public WebElement downKey() throws Exception {
        element=driver.findElement(objectMap.getLocator("downKey"));
        return element;
    }
    public WebElement deleteProjectConfirm() throws Exception {
        element=driver.findElement(objectMap.getLocator("deleteProjectConfirm"));
        return element;
    }
    public WebElement recordCount() throws Exception {
        element=driver.findElement(objectMap.getLocator("recordCount"));
        return element;
    }

}
