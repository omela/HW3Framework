package applicationPages.pages;

import epam.oksanaomelyanchuk.core.DriverWrapper ;
import epam.oksanaomelyanchuk.core.elements.FieldDecorator ;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public BasePage() {
        PageFactory.initElements(new FieldDecorator(DriverWrapper.getDriver()), this);
    }

}
