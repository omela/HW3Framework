package jBehave;
import applicationPages.navigationUtil.PageNavigationUtil;
import applicationPages.pages.EpamMain;
import applicationPages.pages.MainPage;
import org.jbehave.core.annotations.*;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;

public class steps {
   public MainPage MainPage;
   public EpamMain EpamMain;
    @Given("I opened main page")
    public MainPage openMainPage() throws IOException {
        MainPage=PageNavigationUtil.toMainPage();
        return MainPage;
    }
    @When("I proceed to EpamPage")
    public EpamMain openEpamPage() throws IOException {
        EpamMain=PageNavigationUtil.toEpam();
        return EpamMain;
    }
    @Then("I am no more on google page")
    public void checkStep() {
    Assertions.assertFalse(applicationPages.pages.EpamMain.URL_ADDRESS=="www.google.com","should not fail");
    }
}
