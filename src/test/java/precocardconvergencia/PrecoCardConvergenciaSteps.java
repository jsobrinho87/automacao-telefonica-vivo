package precocardconvergencia;

import cucumber.api.java.en.Given;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PrecoCardConvergenciaSteps {
	
	static WebDriver _driver;
	
	ExtentReports report;
	ExtentTest    logger;
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre navegador preco card convergencia")
    public void navegadorConvergenciaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	        
    	driver = new ChromeDriver();
    	driver.manage().window().maximize(); 
    }
    
//-----//
// B2C //
//-----//    
//---------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G1_FSP_3P_15_vdsl //
//---------------------------------------------------------------// 	     
 	     
    @And ("acessa pg de convergencia G1")
    public void paginaConvergenciaG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/apucarana_PR/ofertas-com-movel");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
    }
    
    @Then ("valida preco dos cards de convergencia G1")
    public void convergenciaSucessoouErroG1() throws InterruptedException {   	
    	System.out.println("--------------------------------");
      	System.out.println("|B2C - Preços Convergencia - G1|");
      	System.out.println("--------------------------------");
      	System.out.println("|         CARROSSEL 01         |");
      	System.out.println("--------------------------------");
        //----------------Card-(1)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
      	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS1 = elementPCS1.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
    	System.out.println();
    	
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL1 = elementPCL1.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
    	System.out.println();
    	
    	//----------------Card-(2)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
      	
    	//----------------Oferta-Casa----------------//
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
    	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS2 = elementPCS2.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
    	System.out.println();
    	
    	//--------------Oferta-Celular--------------//
    	WebDriverWait wait02 = new WebDriverWait(driver, 200);
    	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
    	
    	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL2 = elementPCL2.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
    	System.out.println();
    	
    	System.out.println("--------------------------------");
    	System.out.println("|         CARROSSEL 02         |");
      	System.out.println("--------------------------------");
        //----------------Card-(3)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
      	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS3 = elementPCS3.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL3 = elementPCL3.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
    	System.out.println();
    	
    	//---------------Card-(4)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
      	
       	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS4 = elementPCS4.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL4 = elementPCL4.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
    	System.out.println();
    	
    	System.out.println("--------------------------------");
    	System.out.println("|         CARROSSEL 03         |");
      	System.out.println("--------------------------------");
        //----------------Card-(5)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
      	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
    	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS5 = elementPCS5.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL5 = elementPCL5.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
    	System.out.println();
    	    	
    	//---------------Card-(6)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
      	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
    	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS6 = elementPCS6.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL6 = elementPCL6.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
    	System.out.println();
    	
    	System.out.println("--------------------------------");
    	System.out.println("|         CARROSSEL 04         |");
      	System.out.println("--------------------------------");
        //----------------Card-(7)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
      	
      	WebDriverWait wait7 = new WebDriverWait(driver, 200);
    	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS7 = elementPCS7.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL7 = elementPCL7.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
    	System.out.println();
    	    	
    	//---------------Card-(8)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
      	
      	WebDriverWait wait8 = new WebDriverWait(driver, 200);
    	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS8 = elementPCS8.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL8 = elementPCL8.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
        System.out.println();
    	
    	System.out.println("--------------------------------");
    	System.out.println("|         CARROSSEL 05         |");
      	System.out.println("--------------------------------");
        //----------------Card-(9)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
      	
      	WebDriverWait wait9 = new WebDriverWait(driver, 200);
    	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS9 = elementPCS9.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL9 = elementPCL9.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
    	System.out.println();
    	    	
    	//---------------Card-(10)---------------//
      	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
      	
      	WebDriverWait wait10 = new WebDriverWait(driver, 200);
    	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
    	
    	//----------------Oferta-Casa----------------//
     	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
    	String strngPCS10 = elementPCS10.getText();
    	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
    	System.out.println();
    	//--------------Oferta-Celular--------------//
    	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
    	String strngPCL10 = elementPCL10.getText();
    	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
    	System.out.println();
    	System.out.println("--------------------------------");
    	
     	driver.quit();
    }
    
//---------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G2_FSP_3P_50_vdsl //
//---------------------------------------------------------------// 	     
  	     
     @And ("acessa pg de convergencia G2")
     public void paginaConvergenciaG2()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/brusque_SC/ofertas-com-movel");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
     }
     
     @Then ("valida preco dos cards de convergencia G2")
     public void convergenciaSucessoouErroG2() throws InterruptedException {   	
     	System.out.println("--------------------------------");
       	System.out.println("|B2C - Preços Convergencia - G2|");
       	System.out.println("--------------------------------");
       	System.out.println("|         CARROSSEL 01         |");
       	System.out.println("--------------------------------");
         //----------------Card-(1)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS1 = elementPCS1.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	System.out.println();
     	
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL1 = elementPCL1.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	System.out.println();
     	
     	//----------------Card-(2)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
       	
     	//----------------Oferta-Casa----------------//
       	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
      	
     	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS2 = elementPCS2.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	System.out.println();
     	
     	//--------------Oferta-Celular--------------//
     	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	
     	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL2 = elementPCL2.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	System.out.println();
     	
     	System.out.println("--------------------------------");
     	System.out.println("|         CARROSSEL 02         |");
       	System.out.println("--------------------------------");
         //----------------Card-(3)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
       	
       	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS3 = elementPCS3.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL3 = elementPCL3.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	System.out.println();
     	
     	//---------------Card-(4)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
       	
        WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS4 = elementPCS4.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL4 = elementPCL4.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	System.out.println();
     	
     	System.out.println("--------------------------------");
     	System.out.println("|         CARROSSEL 03         |");
       	System.out.println("--------------------------------");
         //----------------Card-(5)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
       	
       	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS5 = elementPCS5.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL5 = elementPCL5.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	System.out.println();
     	    	
     	//---------------Card-(6)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
       	
       	WebDriverWait wait6 = new WebDriverWait(driver, 200);
     	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS6 = elementPCS6.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL6 = elementPCL6.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	System.out.println();
     	
     	System.out.println("--------------------------------");
     	System.out.println("|         CARROSSEL 04         |");
       	System.out.println("--------------------------------");
         //----------------Card-(7)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
       	
       	WebDriverWait wait7 = new WebDriverWait(driver, 200);
     	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS7 = elementPCS7.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL7 = elementPCL7.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
     	System.out.println();
     	    	
     	//---------------Card-(8)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
       	
       	WebDriverWait wait8 = new WebDriverWait(driver, 200);
     	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS8 = elementPCS8.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL8 = elementPCL8.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
         System.out.println();
     	
     	System.out.println("--------------------------------");
     	System.out.println("|         CARROSSEL 05         |");
       	System.out.println("--------------------------------");
         //----------------Card-(9)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
       	
       	WebDriverWait wait9 = new WebDriverWait(driver, 200);
     	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS9 = elementPCS9.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL9 = elementPCL9.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
     	System.out.println();
     	    	
     	//---------------Card-(10)---------------//
       	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
       	
       	WebDriverWait wait10 = new WebDriverWait(driver, 200);
     	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	
     	//----------------Oferta-Casa----------------//
      	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	String strngPCS10 = elementPCS10.getText();
     	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
     	System.out.println();
     	//--------------Oferta-Celular--------------//
     	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	String strngPCL10 = elementPCL10.getText();
     	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
     	System.out.println();
     	System.out.println("--------------------------------");
     	
      	driver.quit();
     }

//-----------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G3_FSP_50_GPON//
//-----------------------------------------------------------// 	     
   	     
      @And ("acessa pg de convergencia G3")
      public void paginaConvergenciaG3()  throws InterruptedException {	
	      	driver.get("https://assine.vivo.com.br/navegantes_SC/ofertas-com-movel");
	      	
	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
      }
      
      @Then ("valida preco dos cards de convergencia G3")
      public void convergenciaSucessoouErroG3() throws InterruptedException {   	
      		System.out.println("--------------------------------");
        	System.out.println("|B2C - Preços Convergencia - G1|");
        	System.out.println("--------------------------------");
        	System.out.println("|         CARROSSEL 01         |");
        	System.out.println("--------------------------------");
          //----------------Card-(1)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
        	
	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS1 = elementPCS1.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
	      	System.out.println();
	      	
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL1 = elementPCL1.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
	      	System.out.println();
	      	
	      	//----------------Card-(2)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
        	
        	//----------------Oferta-Casa----------------//
        	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	       	
	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS2 = elementPCS2.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
	      	System.out.println();
	      	
	      	//--------------Oferta-Celular--------------//
	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
	      	
	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL2 = elementPCL2.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
	      	System.out.println();
	      	
	      	System.out.println("--------------------------------");
	      	System.out.println("|         CARROSSEL 02         |");
        	System.out.println("--------------------------------");
            //----------------Card-(3)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
        	
        	WebDriverWait wait3 = new WebDriverWait(driver, 200);
        	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
      	
        	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS3 = elementPCS3.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL3 = elementPCL3.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
	      	System.out.println();
      	
	      	//---------------Card-(4)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
        	
         	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS4 = elementPCS4.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL4 = elementPCL4.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
	      	System.out.println();
	      	
	      	System.out.println("--------------------------------");
	      	System.out.println("|         CARROSSEL 03         |");
        	System.out.println("--------------------------------");
        	//----------------Card-(5)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
        	
        	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS5 = elementPCS5.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL5 = elementPCL5.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
	      	System.out.println();
      	    	
	      	//---------------Card-(6)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
        	
        	WebDriverWait wait6 = new WebDriverWait(driver, 200);
        	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS6 = elementPCS6.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL6 = elementPCL6.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
	      	System.out.println();
	      	
	      	System.out.println("--------------------------------");
	      	System.out.println("|         CARROSSEL 04         |");
        	System.out.println("--------------------------------");
        	//----------------Card-(7)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
        	
        	WebDriverWait wait7 = new WebDriverWait(driver, 200);
	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS7 = elementPCS7.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL7 = elementPCL7.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
	      	System.out.println();
      	    	
	      	//---------------Card-(8)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
        	
        	WebDriverWait wait8 = new WebDriverWait(driver, 200);
	      	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS8 = elementPCS8.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL8 = elementPCL8.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
	          System.out.println();
	      	
	      	System.out.println("--------------------------------");
	      	System.out.println("|         CARROSSEL 05         |");
        	System.out.println("--------------------------------");
        	//----------------Card-(9)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
        	
        	WebDriverWait wait9 = new WebDriverWait(driver, 200);
	      	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
	      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS9 = elementPCS9.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL9 = elementPCL9.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
	      	System.out.println();
      	    	
	      	//---------------Card-(10)---------------//
        	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
        	
        	WebDriverWait wait10 = new WebDriverWait(driver, 200);
        	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
      	
	      	//----------------Oferta-Casa----------------//
	       	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
	      	String strngPCS10 = elementPCS10.getText();
	      	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
	      	System.out.println();
	      	//--------------Oferta-Celular--------------//
	      	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
	      	String strngPCL10 = elementPCL10.getText();
	      	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
	      	System.out.println();
	      	System.out.println("--------------------------------");
	      	
	       	driver.quit();
      }     

//---------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G4_FSP_2P_15_vdsl //
//---------------------------------------------------------------// 	     
     	     
        @And ("acessa pg de convergencia G4")
        public void paginaConvergenciaG4()  throws InterruptedException {	
        	driver.get("https://assine.vivo.com.br/rondonopolis_MT/ofertas-com-movel");
        	
        	WebDriverWait wait1 = new WebDriverWait(driver, 200);
        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
        }
        
        @Then ("valida preco dos cards de convergencia G4")
        public void convergenciaSucessoouErroG4() throws InterruptedException {   	
        	System.out.println("--------------------------------");
          	System.out.println("|B2C - Preços Convergencia - G4|");
          	System.out.println("--------------------------------");
          	System.out.println("|         CARROSSEL 01         |");
          	System.out.println("--------------------------------");
            //----------------Card-(1)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
          	
         	WebDriverWait wait1 = new WebDriverWait(driver, 200);
        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
        	
        	//----------------Oferta-Casa----------------//
         	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS1 = elementPCS1.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
        	System.out.println();
        	
        	//--------------Oferta-Celular--------------//
        	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL1 = elementPCL1.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
        	System.out.println();
        	
        	//----------------Card-(2)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
          	
        	//----------------Oferta-Casa----------------//
          	WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
         	
        	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS2 = elementPCS2.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
        	System.out.println();
        	
        	//--------------Oferta-Celular--------------//
        	WebDriverWait wait02 = new WebDriverWait(driver, 200);
        	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
        	
        	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL2 = elementPCL2.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
        	System.out.println();
        	
        	System.out.println("--------------------------------");
        	System.out.println("|         CARROSSEL 02         |");
          	System.out.println("--------------------------------");
            //----------------Card-(3)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
          	
          	WebDriverWait wait3 = new WebDriverWait(driver, 200);
        	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
        	
        	//----------------Oferta-Casa----------------//
         	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS3 = elementPCS3.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
        	System.out.println();
        	//--------------Oferta-Celular--------------//
        	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL3 = elementPCL3.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
        	System.out.println();
        	
        	//---------------Card-(4)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
          	
           WebDriverWait wait4 = new WebDriverWait(driver, 200);
        	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
        	//----------------Oferta-Casa----------------//
         	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS4 = elementPCS4.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
        	System.out.println();
        	//--------------Oferta-Celular--------------//
        	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL4 = elementPCL4.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
        	System.out.println();
        	
        	System.out.println("--------------------------------");
        	System.out.println("|         CARROSSEL 03         |");
          	System.out.println("--------------------------------");
            //----------------Card-(5)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
          	
          	WebDriverWait wait5 = new WebDriverWait(driver, 200);
        	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
        	
        	//----------------Oferta-Casa----------------//
         	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS5 = elementPCS5.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
        	System.out.println();
        	//--------------Oferta-Celular--------------//
        	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL5 = elementPCL5.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
        	System.out.println();
        	    	
        	//---------------Card-(6)---------------//
          	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
          	
          	WebDriverWait wait6 = new WebDriverWait(driver, 200);
        	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
        	
        	//----------------Oferta-Casa----------------//
         	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
        	String strngPCS6 = elementPCS6.getText();
        	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
        	System.out.println();
        	//--------------Oferta-Celular--------------//
        	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
        	String strngPCL6 = elementPCL6.getText();
        	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
        	System.out.println();
        	System.out.println("--------------------------------");
        	
         	driver.quit();
        }      

//-------------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G5_FSP_3P_50_vdsl_plus//
//-------------------------------------------------------------------// 	     
        	     
           @And ("acessa pg de convergencia G5")
           public void paginaConvergenciaG5()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/curitiba_PR/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida preco dos cards de convergencia G5")
           public void convergenciaSucessoouErroG5() throws InterruptedException {   	
           		System.out.println("--------------------------------");
             	System.out.println("|B2C - Preços Convergencia - G5|");
             	System.out.println("--------------------------------");
             	System.out.println("|         CARROSSEL 01         |");
             	System.out.println("--------------------------------");
               //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 04         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(7)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait7 = new WebDriverWait(driver, 200);
     	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS7 = elementPCS7.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL7 = elementPCL7.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(8)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait8 = new WebDriverWait(driver, 200);
     	      	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS8 = elementPCS8.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL8 = elementPCL8.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
     	          System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 05         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(9)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait9 = new WebDriverWait(driver, 200);
     	      	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS9 = elementPCS9.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL9 = elementPCL9.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(10)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait10 = new WebDriverWait(driver, 200);
             	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS10 = elementPCS10.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL10 = elementPCL10.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }          

//---------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G6_SP_3P_100_gpon //
//---------------------------------------------------------------// 	     
        	     
           @And ("acessa pg de convergencia G6")
           public void paginaConvergenciaG6()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/sao-paulo_SP/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida preco dos cards de convergencia G6")
           public void convergenciaSucessoouErroG6() throws InterruptedException {   	
           		System.out.println("--------------------------------");
             	System.out.println("|B2C - Preços Convergencia - G6|");
             	System.out.println("--------------------------------");
             	System.out.println("|         CARROSSEL 01         |");
             	System.out.println("--------------------------------");
               //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 04         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(7)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait7 = new WebDriverWait(driver, 200);
     	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS7 = elementPCS7.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL7 = elementPCL7.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(8)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait8 = new WebDriverWait(driver, 200);
     	      	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS8 = elementPCS8.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL8 = elementPCL8.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
     	          System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 05         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(9)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait9 = new WebDriverWait(driver, 200);
     	      	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS9 = elementPCS9.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL9 = elementPCL9.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(10)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait10 = new WebDriverWait(driver, 200);
             	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS10 = elementPCS10.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL10 = elementPCL10.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }     
           
//--------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G7_SP_3P_50_vdsl //
//--------------------------------------------------------------// 	     
        	     
           @And ("acessa pg de convergencia G7")
           public void paginaConvergenciaG7()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/aruja_SP/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida preco dos cards de convergencia G7")
           public void convergenciaSucessoouErroG7() throws InterruptedException {   	
           		System.out.println("--------------------------------");
             	System.out.println("|B2C - Preços Convergencia - G7|");
             	System.out.println("--------------------------------");
             	System.out.println("|         CARROSSEL 01         |");
             	System.out.println("--------------------------------");
               //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 04         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(7)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait7 = new WebDriverWait(driver, 200);
     	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS7 = elementPCS7.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL7 = elementPCL7.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(8)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait8 = new WebDriverWait(driver, 200);
     	      	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS8 = elementPCS8.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL8 = elementPCL8.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
     	          System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 05         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(9)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait9 = new WebDriverWait(driver, 200);
     	      	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS9 = elementPCS9.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL9 = elementPCL9.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(10)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait10 = new WebDriverWait(driver, 200);
             	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS10 = elementPCS10.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL10 = elementPCL10.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }                  

//-----------------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G9_FSP_3P_gpon_lançamento //
//-----------------------------------------------------------------------// 	     
        	     
           @And ("acessa pg de convergencia G9")
           public void paginaConvergenciaG9()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/teresina_PI/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("/html/body/section[1]/div/div/h1"), "Teresina tem Vivo Fibra"));
           }
     	      	
           @Then ("valida preco dos cards de convergencia G9")
 	       public void retornoSucessoouErroG9() throws IOException {
 	    	    System.out.println("--------------------------------");
 	    	    System.out.println("|B2C - Preços Convergencia - G9|");
 	    	    System.out.println("--------------------------------------------------------");
 	        	     	    	
 	        	WebElement element2 = driver.findElement(By.xpath("/html/body/section[1]/div/div/h1"));
 	        	assertTrue(element2.getText().contains("Teresina tem Vivo Fibra"));

 	        	System.out.printf("Resultado: "+ driver.getTitle());
 	        	System.out.println();
 	        	System.out.println("--------------------------------------------------------");
 	        	driver.quit();		  	
           }
           
//-----------------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - G10_FSP_3P_100_GPON //
//-----------------------------------------------------------------// 	     
        	     
           @And ("acessa pg convergencia G10")
           public void paginaConvergenciaG10()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/garanhuns_PE/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida precos cards de convergencia G10")
           public void convergenciaSucessoouErroG10() throws InterruptedException {   	
           		System.out.println("---------------------------------");
             	System.out.println("|B2C - Preços Convergencia - G10|");
             	System.out.println("---------------------------------");
             	System.out.println("|          CARROSSEL 01         |");
             	System.out.println("---------------------------------");
               //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 04         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(7)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait7 = new WebDriverWait(driver, 200);
     	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS7 = elementPCS7.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS7 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL7 = elementPCL7.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL7  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(8)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[5]/span[1]")).click();
             	
             	WebDriverWait wait8 = new WebDriverWait(driver, 200);
     	      	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS8 = elementPCS8.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS8 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[4]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL8 = elementPCL8.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL8  + " |");
     	          System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 05         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(9)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait9 = new WebDriverWait(driver, 200);
     	      	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS9 = elementPCS9.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS9 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL9 = elementPCL9.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL9  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(10)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[6]/span[1]")).click();
             	
             	WebDriverWait wait10 = new WebDriverWait(driver, 200);
             	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS10 = elementPCS10.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS10 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[5]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL10 = elementPCL10.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL10  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }              

//--------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - Massivo SP //
//--------------------------------------------------------// 	     
        	     
           @And ("acessa pg convergencia Massivo SP")
           public void paginaConvergenciaMassivoSP()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/aguai_SP/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida precos cards de convergencia Massivo SP")
           public void convergenciaSucessoouErroMassivoSP() throws InterruptedException {   	
           		System.out.println("----------------------------------------");
             	System.out.println("|B2C - Preços Convergencia - Massivo SP|");
             	System.out.println("----------------------------------------");
             	System.out.println("|          CARROSSEL 01         |");
             	System.out.println("---------------------------------");
               //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }    
           
//-------------------------------------------------------// 
// Precificação Precos Cards de Convergencia - Defaut SP //
//-------------------------------------------------------// 	     
        	     
           @And ("acessa pg convergencia Defaut SP")
           public void paginaConvergenciaDefautSP()  throws InterruptedException {	
     	      	driver.get("https://assine.vivo.com.br/bocaina_SP/ofertas-com-movel");
     	      	
     	      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h2/strong"), "Ofertas para sua Casa + Planos de Celular"));
           }
           
           @Then ("valida precos cards de convergencia Defaut SP")
           public void convergenciaSucessoouErroDefautSP() throws InterruptedException {   	
           		System.out.println("---------------------------------------");
             	System.out.println("|B2C - Preços Convergencia - Defaut SP|");
             	System.out.println("---------------------------------------");
             	System.out.println("|          CARROSSEL 01         |");
             	System.out.println("---------------------------------");
                //----------------Card-(1)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
     	       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS1 = elementPCS1.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS1 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------// 
     	      	WebElement elementPCL1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL1 = elementPCL1.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL1  + " |");
     	      	System.out.println();
     	      	
     	      	//----------------Card-(2)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[2]/span")).click();
             	
             	//----------------Oferta-Casa----------------//
             	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	       	
     	      	WebElement elementPCS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS2 = elementPCS2.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS2 + " |");
     	      	System.out.println();
     	      	
     	      	//--------------Oferta-Celular--------------//
     	      	WebDriverWait wait02 = new WebDriverWait(driver, 200);
     	      	wait02.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	WebElement elementPCL2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL2 = elementPCL2.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL2  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 02         |");
             	System.out.println("--------------------------------");
                 //----------------Card-(3)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, 200);
             	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
             	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS3 = elementPCS3.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS3 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL3 = elementPCL3.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL3  + " |");
     	      	System.out.println();
           	
     	      	//---------------Card-(4)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
             	
              	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS4 = elementPCS4.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS4 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL4 = elementPCL4.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL4  + " |");
     	      	System.out.println();
     	      	
     	      	System.out.println("--------------------------------");
     	      	System.out.println("|         CARROSSEL 03         |");
             	System.out.println("--------------------------------");
             	//----------------Card-(5)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
     	      	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS5 = elementPCS5.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS5 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[1]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL5 = elementPCL5.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL5  + " |");
     	      	System.out.println();
           	    	
     	      	//---------------Card-(6)---------------//
             	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[4]/span[1]")).click();
             	
             	WebDriverWait wait6 = new WebDriverWait(driver, 200);
             	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/small"), "Por apenas"));
           	
     	      	//----------------Oferta-Casa----------------//
     	       	WebElement elementPCS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[1]/div[2]/div/div/strong"));
     	      	String strngPCS6 = elementPCS6.getText();
     	      	System.out.printf("|Oferta Casa    | " + strngPCS6 + " |");
     	      	System.out.println();
     	      	//--------------Oferta-Celular--------------//
     	      	WebElement elementPCL6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[3]/article[2]/div[1]/div[3]/div[2]/div[2]/div/div/strong"));
     	      	String strngPCL6 = elementPCL6.getText();
     	      	System.out.printf("|Oferta Celular | " + strngPCL6  + " |");
     	      	System.out.println();
     	      	System.out.println("--------------------------------");
     	      	
     	       	driver.quit();
           }             
}