package applicationPages.pages;

import epam.oksanaomelyanchuk.core.ElementWrapper;
import epam.oksanaomelyanchuk.core.Log;
import epam.oksanaomelyanchuk.core.elements.Button;
import lombok.Getter;
import java.io.IOException;

public class GooglePage extends BasePage{
    public static final String URL_ADDRESS = "https://www.google.com/";
     @Getter private Button lucky = new Button(ElementWrapper.findByXpath("RNmpXc"));

    public GooglePage() throws IOException {

    }
        public void luckyBtnClick(){
            Log.setName("change theme").info(String.format("click %s to Button"));
            lucky.click();
        }
    }

