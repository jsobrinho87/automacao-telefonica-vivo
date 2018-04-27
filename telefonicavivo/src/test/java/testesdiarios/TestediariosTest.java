package testesdiarios;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Testediarios.feature",
	glue = { "" }, monochrome = true, dryRun = false,
	
	tags  = {
		     "@Cenario01,"
	       + "@Cenario02,"
	       + "@Cenario03,"
	       + "@Cenario04,"
	       + "@Cenario05,"
	       + "@Cenario06,"
	       + "@Cenario07,"
	       + "@Cenario08," 
           + "@Cenario09,"
           + "@Cenario10,"
           + "@Cenario11,"
           + "@Cenario12"
	    	})    

public class TestediariosTest {

}