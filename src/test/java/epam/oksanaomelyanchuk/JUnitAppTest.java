package epam.oksanaomelyanchuk;

import applicationPages.navigationUtil.PageNavigationUtil;
import applicationPages.pages.*;
import epam.oksanaomelyanchuk.core.Log;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import java.io.IOException;
import org.junit.jupiter.api.*;
import org.testng.annotations.BeforeTest;
import static epam.oksanaomelyanchuk.core.Log.getLogger;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * Unit test for simple App.
 */
public class JUnitAppTest {
    @BeforeTest
    public void setLoggerONRootOff(){
        Logger.getRootLogger().setLevel(Level.OFF);
    }
@org.junit.jupiter.api.Test
@DisplayName("JUnit test that fails")
public void sometest() throws IOException
{
    Log.getLogger().error("This is a error message");
    Log.getLogger().trace("This is a trace message");
   //Log.setName(JUnitAppTest.class.getName()+"  test()");
   getLogger().error("new test");
    PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE1);
  //  PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE).getFirstResult();
    Assertions.assertTrue(PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE).getFirstResult().isBlank()); // fail
// to pass  Assertions.assertFalse(PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE).getFirstResult().isBlank());
 // to fail   Assertions.assertAll(()->assertThat(PageNavigationUtil.toSoftserve().getUrl()).as("Fail URL").isEqualTo(EpamMain.URL_ADDRESS),()->assertThat(PageNavigationUtil.toSoftserve().getUrl()).as("OK URL").isEqualTo(SoftServeMain.URL_ADDRESS),()->assertThat(PageNavigationUtil.toSoftserve().getUrl()).as("Fail URL").isEqualTo(EpamMain.URL_ADDRESS));
}
@Nested
@DisplayName("nested class for tests")
class MyNestedClasses {
    @Nested
    @DisplayName("first inner class")
    class Checking{
        @Test
        @DisplayName("actually checking")
    void checkPage() throws IOException {
        PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE1);
        assertThat(PageNavigationUtil.toSoftserve().getUrl()).as("Fail URL").isEqualTo(EpamMain.URL_ADDRESS);
    }
}
@Nested
@DisplayName("second inner class")
    class AgainChecking
{
        @Test
    @DisplayName("actually checking again")
    void againCheckPage() throws IOException
        {
            PageNavigationUtil.toMainPage().writeButton(MainPage.FIND_MESSAGE1);
            assertThat(PageNavigationUtil.toSoftserve().getUrl()).as("Fail URL").isEqualTo(EpamMain.URL_ADDRESS);
        }
    }

}
  // @AfterAll
  @Test
  public void testPage() throws IOException {
      String s =PageNavigationUtil.toTestPage().enter("java").check().toString();
   Assertions.assertTrue(s.equalsIgnoreCase("Java For Testers"));
}
}
