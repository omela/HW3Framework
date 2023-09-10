package applicationPages.pages;

import epam.oksanaomelyanchuk.core.DriverWrapper ;
import epam.oksanaomelyanchuk.core.ElementWrapper;
import epam.oksanaomelyanchuk.core.Log;
import java.io.IOException;

public class EpamMain extends BasePage {
    public static final String URL_ADDRESS_FAIL = "https://www.epam1.com/";
    public static final String URL_ADDRESS = "https://www.epam.com/";

    public EpamMain() throws IOException {

    }
    public String getUrl() throws IOException {
        return DriverWrapper.getDriver().getCurrentUrl();
    }
}