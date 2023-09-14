package epam.oksanaomelyanchuk.core;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.FluentWait;
import epam.oksanaomelyanchuk.utils.Propertiator;

public class DriverWrapper {
    private static WebDriver driver = null;
    private static FluentWait<WebDriver> wait = null;

    private DriverWrapper() {
       // EventFiringWebDriver  is deprecated
        WebDriver decoratedDriver=null;
        String type = Propertiator.getPropertie("driver");

        switch(type) {
            case "Chrome":
                ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(System.getProperty("user.dir")+"\\chromedriver.exe")).usingAnyFreePort().build();

                try {
                    service.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                decoratedDriver = new EventFiringDecorator<WebDriver>(new MyEventListener()).decorate(new ChromeDriver());
                break;
            case "Firefox":
                GeckoDriverService fservice = new GeckoDriverService.Builder()
                       .usingDriverExecutable(new File(System.getProperty("user.dir")+"\\geckodriver.exe")).usingAnyFreePort().build();
                try {
                    fservice.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                 decoratedDriver = new EventFiringDecorator<WebDriver>(new MyEventListener()).decorate(new FirefoxDriver());

                break;
        }
        driver = decoratedDriver;
         driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        if(driver != null) {
            return driver;
        } else {
            new DriverWrapper();
            return driver;
        }
    }

    public static FluentWait<WebDriver> getFindFluentWait() {
        getFluentWait().withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        return wait;
    }

    public static FluentWait<WebDriver> getFluentWait() {
        if(wait != null) {
            return wait;
        } else {
            wait =  new FluentWait<WebDriver>(driver);
            return wait;
        }
    }
}