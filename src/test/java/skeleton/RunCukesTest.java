package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(plugin = {"json:target/cucumber.json","html:target/html/html-report"},tags="@Guestuser,@RegisteredUser, @DirectCheckOutPage")
public class RunCukesTest {
}
