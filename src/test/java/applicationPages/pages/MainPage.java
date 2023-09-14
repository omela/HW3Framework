package applicationPages.pages;

import epam.oksanaomelyanchuk.core.ElementWrapper ;
import epam.oksanaomelyanchuk.core.Log ;
import epam.oksanaomelyanchuk.core.elements.Input ;
import lombok.Getter;
import org.openqa.selenium.By;
import java.io.IOException;
import static epam.oksanaomelyanchuk.core.DriverWrapper.getDriver;

public class MainPage extends BasePage {
    public static final String FIND_MESSAGE = "selenium";
    public static final String FIND_MESSAGE1 = "https://www.softserveinc.com/en-us";
    public static final String FIND_MESSAGE2 = "https://www.epam.com/";
    public static final String FIND_MESSAGE3 = "https://automationbookstore.dev/";
    @Getter private Input str = new Input(ElementWrapper.find(By.name("q")));
   // @Getter private Input str1 = new Input(ElementWrapper.find(By.name("btnI")));
    public MainPage() throws IOException {
    }

    public SearchResultPage writeButton(String message) throws IOException {
        Log.setName("navigate from Main to destination page").info(String.format(" result page is expected", message));
        str.write(message);
        str.submit();
        return new SearchResultPage();
    }

    public static void closeBrowser() {
        getDriver().close();
    }
}