package cucumberJava.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Oksana_Omelyanchuk\\IdeaProjects\\MyFrameworkSkeleton\\src\\test\\resources\\userStory1.feature", glue = "cucumberJava.test")
public class userStory1Runner {

}
