import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = {"src/test/resource"}
        //tags = "@all",
        //dryRun = false,
        //strict = false,
        //snippets = SnippetType.UNDERSCORE
)

public class RunCukesTest {

    public static ClassLoader RunCukesTest;

    @BeforeClass
    public static void setupTimeout() throws Exception
    {
        Configuration.timeout = 60000;
    }

    /*@AfterClass
    public static void quit()
    {   _driver.close(); }*/
}
