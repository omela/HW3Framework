package cucumberJava.test;

import applicationPages.navigationUtil.PageNavigationUtil;
import applicationPages.pages.MainPage;
import applicationPages.pages.SearchResultPage;
import io.cucumber.java.en.*;
import org.assertj.core.api.Assertions;
import java.io.IOException;
import static org.assertj.core.api.Assertions.assertThat;

public class myCucumberTest {

    @Given("I launch chrome browser")
public MainPage i_launch_chrome_browser() throws IOException {
        return PageNavigationUtil.toMainPage();

}
    @When("I search for something")
    public SearchResultPage i_search_for_something() throws IOException {

        return i_launch_chrome_browser().writeButton("test cucumber");
    }
    @Then("I see result page")
    public void i_see_result_page() throws IOException {
        assertThat(i_search_for_something().getFirstResult().contains("test")==true);

    }

}
