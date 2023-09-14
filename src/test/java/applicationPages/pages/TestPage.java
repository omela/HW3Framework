package applicationPages.pages;

import epam.oksanaomelyanchuk.core.ElementWrapper;
import epam.oksanaomelyanchuk.core.Log;
import epam.oksanaomelyanchuk.core.elements.Button;
import epam.oksanaomelyanchuk.core.elements.Input;
import epam.oksanaomelyanchuk.core.elements.Label;
import epam.oksanaomelyanchuk.core.elements.Link;
import lombok.Getter;
import java.io.IOException;

public class TestPage extends BasePage{
    public static final String URL_ADDRESS = "https://automationbookstore.dev/";
   private Input fnd = new Input(ElementWrapper.byId("searchBar"));
   private Button lbl = new Button(ElementWrapper.byId("pid5_title"));

    public TestPage() throws IOException {

    }
    public TestPage enter(String message) throws IOException {
        Log.setName("navigate to results").info(String.format(" result page is expected", message));
        fnd.write(message);
       // fnd.submit();
        return this;
    }
    public String check() throws IOException {
       // Log.setName("check results").info(String.format(" expected", message));
//lbl.getLabelText();
return lbl.getText();
    }
}

