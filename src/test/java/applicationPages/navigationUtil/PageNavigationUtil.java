package applicationPages.navigationUtil;


import applicationPages.pages.*;
import epam.oksanaomelyanchuk.core.DriverWrapper ;
import epam.oksanaomelyanchuk.core.Log ;
import java.io.IOException;

public class PageNavigationUtil {
    
    public static void to(String url) throws IOException {
        DriverWrapper.getDriver().navigate().to(url);
    }
    public static MainPage toMainPage() throws IOException {
        Log.setName(" cucumber test ").info("navigating to google.com");
        DriverWrapper.getDriver().navigate().to("http://www.google.com");
        return new MainPage();
    }
    public static SoftServeMain toSoftserve() throws IOException {
        DriverWrapper.getDriver().navigate().to(SoftServeMain.URL_ADDRESS);
        return new SoftServeMain();
    }

    public static EpamMain toEpam() throws IOException {
        DriverWrapper.getDriver().navigate().to(EpamMain.URL_ADDRESS);
        return new EpamMain();
    }
}