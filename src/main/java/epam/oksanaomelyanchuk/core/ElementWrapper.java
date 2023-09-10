package epam.oksanaomelyanchuk.core;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Function;

import java.io.IOException;
import java.util.List;

public class ElementWrapper {

    public static WebElement find(final By by)
    {
        return DriverWrapper.getFindFluentWait().until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                try {
                    return AutomationWait.waitVisibleClickable(driver.findElement(by));
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static WebElement findOne(final String id)
    {
        return DriverWrapper.getFindFluentWait().until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                try {
                    return AutomationWait.waitVisibleClickable(driver.findElement(By.id(id)));
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static WebElement findByXpath(final String className)
    {
        return DriverWrapper.getFindFluentWait().until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                try {
                    return AutomationWait.waitVisibleClickable(driver.findElement(By.ByClassName.name(className)));
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static WebElement findByName(final String name)
    {
        return DriverWrapper.getFindFluentWait().until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                try {
                    return AutomationWait.waitVisibleClickable(driver.findElement(By.ByName.name(name)));
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static WebElement findByElXpath(final String name)
    {
        return DriverWrapper.getFindFluentWait().until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                try
                {
                    return AutomationWait.waitVisibleClickable(driver.findElement(By.xpath(name)));
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    public static List<WebElement> findList(final By by)
    {
        return DriverWrapper.getDriver().findElements(by);
    }
}