package consultacoberturaassine;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/cucumber/features/Consultacobertura.feature",
	glue = { "" }, monochrome = true, dryRun = false,

	tags  = {
//	         "@Cenario-G1,"
//           + "@Cenario-G2,"
//           + "@Cenario-G3,"
//           + "@Cenario-G4,"
//           + "@Cenario-G5,"
//           + "@Cenario-G6,"
//           + "@Cenario-G7,"
//           + "@Cenario-G9," 
//           + "@Cenario-G10,"
//           + "@Cenario-OFFNET,"
//           + "@Cenario-MassivoSP,"
//           + "@Cenario-DefautSP"
//               "@Cenario-OnnetPadrao"
              "@Cenario-OnnetSemTV"
			
        	})   

public class ConsultacoberturaTest {

}