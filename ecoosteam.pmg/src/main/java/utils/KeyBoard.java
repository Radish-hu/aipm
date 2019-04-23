package utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KeyBoard {
    public static void tabKey(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }
    public static void enterKey(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void ctrlCAndCtrlV(String string){
        StringSelection stringSelection=new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    public static void F5(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);
    }
    public static void Esc(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    public static void F1(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F1);
        robot.keyRelease(KeyEvent.VK_F1);
    }
    public static void F12(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease(KeyEvent.VK_F12);
    }
    public static void click_double(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.mouseMove(1790,40);

        robot.mousePress(InputEvent.BUTTON1_MASK);

        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        robot.delay(100);

        robot.mousePress(InputEvent.BUTTON1_MASK);

        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    public static void pressDownKey(){
        Robot robot = null;
        try{
            robot = new Robot();
        }catch (AWTException e){
            e.printStackTrace();
        }
        assert robot != null;
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
    }

}
