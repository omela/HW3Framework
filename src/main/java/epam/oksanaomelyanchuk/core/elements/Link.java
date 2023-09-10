package epam.oksanaomelyanchuk.core.elements;
import org.openqa.selenium.WebElement;

import epam.oksanaomelyanchuk.core.interfaces.elements.ILink ;

public class Link implements ILink{
    WebElement base;
    public Link(WebElement base) {
        this.base = base;
    }
    public void click() {
        base.click();
    }
    public String getLinkText() {
        return base.getText();
    }
}
