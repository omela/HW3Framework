package applicationPages.pages;

import epam.oksanaomelyanchuk.core.DriverWrapper;

import java.io.IOException;

public class SoftServeMain extends BasePage {
    public static final String URL_ADDRESS_FAIL = "http://softserve.ua/";
    public static final String URL_ADDRESS = "https://www.softserveinc.com/en-us";

    public SoftServeMain() throws IOException {
    }

    public String getUrl() throws IOException {
        return DriverWrapper.getDriver().getCurrentUrl();
    }
}