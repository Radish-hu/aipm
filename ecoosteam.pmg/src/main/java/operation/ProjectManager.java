package operation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageElements.ProjectManagerElement;
import utils.KeyBoard;
import utils.UtilRandom;

public class ProjectManager {
    public static final String projectName="ecoosteam"+UtilRandom.projectName();
    public static final String setProjectName="ecoosteam"+ UtilRandom.projectName();
    /*项目管理菜单*/
    public static void projectMenu(WebDriver driver) throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        pm.menu_projectManager_Lv2().click();
    }
    /*新增项目*/
    public static void addProject(WebDriver driver) throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        pm.newProjectButton().click();
        pm.project_sheng().click();
        pm.project_sheng_value().click();
        pm.project_city().click();
        pm.project_city_value().click();
        pm.project_area().click();
        pm.project_area_value().click();
        pm.newProjectName().sendKeys(projectName);
        pm.newProjectSave().click();
        System.out.println("新增项目成功："+projectName);
    }
    /*查询项目*/
    public static void searchProject(WebDriver driver) throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        pm.searchProjectName().clear();
        pm.searchProjectName().sendKeys(projectName);
        pm.searchProjectButton().click();
    }
    /*修改项目*/
    public static void updateProject(WebDriver driver) throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        pm.searchProjectName().clear();
        pm.searchProjectName().sendKeys(projectName);
        pm.searchProjectButton().click();
        Thread.sleep(1000);
        pm.downKey().click();
        /*键盘下方向键*/
        KeyBoard.pressDownKey();
        /*鼠标悬浮*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement logout=pm.updateProject();
        js.executeScript("arguments[0].click();",logout);
        Thread.sleep(1000);
        pm.updateProjectName().clear();
        pm.updateProjectName().sendKeys(setProjectName);
        pm.updateProjectSave().click();
        pm.searchProjectName().clear();
        pm.searchProjectName().sendKeys(setProjectName);
        pm.searchProjectButton().click();
    }
    /*删除项目*/
    public static void deleteProject(WebDriver driver) throws Exception {
        ProjectManagerElement pm=new ProjectManagerElement(driver);
        pm.searchProjectName().clear();
        pm.searchProjectName().sendKeys(setProjectName);
        pm.searchProjectButton().click();
        Thread.sleep(1000);
        pm.downKey().click();
        /*键盘下方向键*/
        KeyBoard.pressDownKey();
        /*鼠标悬浮*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement logout=pm.deleteProject();
        js.executeScript("arguments[0].click();",logout);
        Thread.sleep(1000);
        pm.deleteProjectConfirm().click();
        Thread.sleep(1000);
        int expect=0;
        int actual=Integer.parseInt(pm.recordCount().getText());
        Assert.assertEquals(expect,actual);
    }
}
