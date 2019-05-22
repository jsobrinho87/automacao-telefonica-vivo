package email;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class EnviarEmail {
	
	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
	
	@Before
	public void beforeCenario(Scenario cenario) {
		if(extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}
		
		extentTest = extentReport.createTest(cenario.getId());
	}
	
	@After 
	public void afterCenario(Scenario cenario) {
		
		extentTest.log(Status.PASS, "Cenario "+ cenario.getName()+ " executado com sucesso!");
		extentTest.log(Status.ERROR, "Cenario "+ cenario.getName()+ " executado com falha.");
		extentReport.flush();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static ExtentTest getExtertTest() {
		return extentTest;
	}

}
