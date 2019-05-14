package testesdiarios;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Testediarios.feature",
	glue = { "" }, monochrome = true, dryRun = false,
	
	tags  = {
//		     "@CenarioC2CR-01,"
//	       + "@CenarioCombo-3P,"
//	       + "@CenarioBL-Avulsa,"
//	       + "@CenarioFixa-Avulsa,"
//	       + "@CenarioTV-Avulsa,"
//	       + "@CenarioSimulador-3P,"
//	       + "@CenarioCom3P-B2B,"
//           + "@CenarioSimu2PSP-B2B,"
//           + "@CenarioC2CR-02,"
//           + "@CenarioConsultaSP-G6,"
//           + "@CenarioConsultaSP-Defalt,"
		    "@CenarioChatOracle"
	    	}) 

public class TestediariosTest {

}