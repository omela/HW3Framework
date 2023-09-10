package applicationPages.pages;


import epam.oksanaomelyanchuk.core.AutomationWait ;
import epam.oksanaomelyanchuk.core.DriverWrapper ;
import epam.oksanaomelyanchuk.core.ElementWrapper;
import epam.oksanaomelyanchuk.core.Log;
import epam.oksanaomelyanchuk.core.elements.Button;
import epam.oksanaomelyanchuk.core.elements.Input;
import epam.oksanaomelyanchuk.core.elements.Link ;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SearchResultPage extends BasePage {
    @Getter
    private Input str = new Input(ElementWrapper.find(By.name("q")));

    @Getter
    private Link firstResult = new Link(ElementWrapper.find(By.className("g")));

    @Getter
    @FindBy(xpath = "//*[@class='hdtb-mn-hd' and @aria-label='Будь-коли']")
    private Button timeFilter;

    @Getter
    @FindBy(xpath = "//*[@class='hdtb-mn-hd hdtb-tsel']/div")
    private Button selectedFilter;

    @Getter
    @FindBy(xpath = "//*[@role='button' and text()='Інструменти']")
    private Button toolsButton;

    @Getter
    @FindBy(id = "qdr_d")
    private Button last24Hour;

    public SearchResultPage() throws IOException {
    }


    public SearchResultPage clickOnToolsButton() {
        Log.log("Click on tools button");
        toolsButton.click();
        return this;
    }

    public SearchResultPage selectLastDayItems() {
        Log.log("Click on last 24 hours");
        last24Hour.click();
        return this;
    }

    public void filterResultsByTime() throws IOException {
        clickOnToolsButton();
        AutomationWait.waitVisibleClickable(timeFilter.getBase());
        Actions actions = new Actions(DriverWrapper.getDriver());
        actions.click(timeFilter.getBase()).build().perform();
        selectLastDayItems();
    }

    public String getSearchTitle() {
        return str.getSearchTitle();
    }
    public void windowClose() throws IOException {
        DriverWrapper.getDriver().close();
    }

    public String getFirstResult() {
        return firstResult.getLinkText();
    }

    public Button getLast24Hour() {
        return last24Hour;
    }

    public Button getToolsButton() {
        return toolsButton;
    }

    public Button getSelectedFilter() {
        return selectedFilter;
    }
}
