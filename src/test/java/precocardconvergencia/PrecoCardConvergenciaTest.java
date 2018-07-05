package precocardconvergencia;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Precocardsconvergencia.feature",
	glue = { "" }, monochrome = true, dryRun = false,	
  
	tags  = {
	           "@Cenario-G1-B2C,"
             + "@Cenario-G2-B2C,"
             + "@Cenario-G3-B2C,"
             + "@Cenario-G4-B2C,"
             + "@Cenario-G5-B2C,"
             + "@Cenario-G6-B2C,"
             + "@Cenario-G7-B2C,"
             + "@Cenario-G9-B2C," 
             + "@Cenario-G10-B2C,"
             + "@Cenario-MassivoSP-B2C,"
             + "@Cenario-DefautSP-B2C,"
        	})   

public class PrecoCardConvergenciaTest {

}