package applicationPages.pages;

import epam.oksanaomelyanchuk.core.DriverWrapper ;
import epam.oksanaomelyanchuk.core.elements.FieldDecorator ;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BasePage {
    public BasePage() throws IOException {
        PageFactory.initElements(new FieldDecorator(DriverWrapper.getDriver()), this);
    }

}
