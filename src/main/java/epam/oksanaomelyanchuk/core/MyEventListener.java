package epam.oksanaomelyanchuk.core;
import epam.oksanaomelyanchuk.enums.LogType;
import org.apache.logging.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import epam.oksanaomelyanchuk.core.Log;

public class MyEventListener implements WebDriverListener {

    @Override
    public void afterClick(WebElement element)
    {
System.out.print("We clicked element"+element);

    }
    @Override
    public void  afterFindElement(WebDriver driver,
                                      By locator,
                                      WebElement result) {
        System.out.print("MyEventListener: We find element "+driver.findElement(locator).getTagName()+"  ");
       Log.getLogger().error("we log error level");Log.getLogger().trace("some trace");
    }
    @Override
    public void afterBack(WebDriver.Navigation navigation)
    {

        System.out.println("we are back ");
    }
    @Override
    public void afterForward(WebDriver.Navigation navigation) {
        // TODO Auto-generated method stub
    }
    @Override
    public void afterGetCurrentUrl(String result,
                                   WebDriver driver) {

        // TODO Auto-generated method stub
    }
    @Override
    public void afterExecuteScript(WebDriver driver,
                                   String script,
                                   Object[] args,
                                   Object result) {

        // TODO Auto-generated method stub
    }

    @Override
    public void  beforeClick(WebElement element) {
        // TODO Auto-generated method stub
    }
    @Override
    public void beforeFindElements(WebDriver driver,
                                   By locator) {
        // TODO Auto-generated method stub
    }

    @Override
    public void beforeExecuteScript(WebDriver driver,
                                    String script,
                                    Object[] args) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onError(Object target,
                        Method method,
                        Object[] args,
                        InvocationTargetException e) {
        // TODO Auto-generated method stub

    }
}
