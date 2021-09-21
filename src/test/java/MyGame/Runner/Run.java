package MyGame.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "/MyGame",
        dryRun=false,  //When it is false it is inactive
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
        }
)
public class Run {
}
