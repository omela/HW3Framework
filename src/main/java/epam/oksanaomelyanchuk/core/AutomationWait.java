package epam.oksanaomelyanchuk.core;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationWait {

    public static void waitPageLoad() throws IOException {
        DriverWrapper.getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    }

    public static WebElement waitForElementClickable(WebElement element) throws IOException {
        new WebDriverWait( DriverWrapper.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public static WebElement waitForElementVisible(WebElement element) throws IOException {
        new WebDriverWait( DriverWrapper.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public static WebElement waitVisibleClickable(WebElement element) throws IOException {
        return waitForElementVisible(waitForElementClickable(element));
    }

    public static void waitTitleContains(String title) throws IOException {
        new WebDriverWait(DriverWrapper.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.titleContains(title));
    }

    public static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

