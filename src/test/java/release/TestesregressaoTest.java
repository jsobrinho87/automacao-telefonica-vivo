package release;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Testesregressao.feature",
	glue = { "" }, monochrome = true, dryRun = false,

    tags  = {
            "@CenarioCombo3P-B2C,"
           + "@CenarioCombo2P-B2C,"
           + "@CenarioBL-B2C,"
           + "@CenarioFixa-B2C,"
           + "@CenarioTV-B2C,"
           + "@CenarioSimu3P-B2C," 
           + "@CenarioFixa02-B2C,"
           + "@CenarioSimu2P-B2C," 
           + "@CenarioSimu2P-B2B," 
           + "@CenarioCombo3P-B2B," 
           + "@CenarioSimu2PSP-B2B,"
           + "@CenarioCombo3PSP-B2B"
        	})

public class TestesregressaoTest { 

}