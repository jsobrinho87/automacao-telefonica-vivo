package release;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class screenshotstep {
	public static void screenshot(WebDriver driver, long ms)
	{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("C/Users/Jhon/Downloads/Testes/"+ms+"Testeevidencia.jpg"));
	    System.out.println("ScreenShot Taken");
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}

}
