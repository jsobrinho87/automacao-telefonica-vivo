package release;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Testesregressao.feature",
	glue = { "" }, monochrome = true, dryRun = false)

public class TestesregressaoTest {

}