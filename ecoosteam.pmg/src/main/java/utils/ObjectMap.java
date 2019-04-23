package utils;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectMap {
    Properties properties;
    public ObjectMap(String propFile){
        properties=new Properties();
        try {
            FileInputStream in=new FileInputStream(propFile);
            properties.load(in);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public By getLocator(String elementNameInpropFile) throws Exception {
        String locator=properties.getProperty(elementNameInpropFile);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        locatorValue=new String(locatorValue.getBytes("ISO-8859-1"),"UTF-8");
        if (locatorType.toLowerCase().equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.toLowerCase().equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.toLowerCase().equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.toLowerCase().equals("tagName")){
            return By.tagName(locatorValue);
        }else if (locatorType.toLowerCase().equals("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.toLowerCase().equals("partialLinkText")){
            return By.partialLinkText(locatorValue);
        }else if (locatorType.toLowerCase().equals("cssSelector")||locatorType.toLowerCase().equals("css")){
            return By.cssSelector(locatorValue);
        }else if (locatorType.toLowerCase().equals("xpath")){
            return By.xpath(locatorValue);
        }else {
            throw new Exception(locatorType);
        }
    }
}
