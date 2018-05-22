package precoscardscombos;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrecoCardsComboSteps {
	
	static WebDriver _driver;
	
	ExtentReports report;
	ExtentTest    logger;
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador preco card combo")
    public void paginaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	
        report = new ExtentReports("C:\\Users\\80479178\\Downloads\\Release\\ReportConsultaCobertura.html"); 
    	logger = report.startTest("Valida Consulta Cobertura");
        
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }
    
//-----//
// B2C //
//-----//    
//------------------------------------------------------------// 
// Precificação preço dos Cards de Combos - G1_FSP_3P_15_vdsl //
//------------------------------------------------------------// 	     
 	     
    @And ("acessa pg de combo G1")
    public void paginaCoberturaG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/apucarana_PR/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
    }
    
   
    @Then ("valida preco dos cards de combos G1")
    public void retornoSucessoouErroG1() throws InterruptedException {   	
    	System.out.println("----------------------------------------------------");
      	System.out.println("|B2C - Preços Cards de Combos - (G1_FSP_3P_15_vdsl)|");
      	System.out.println("----------------------------------------------------");
      	
//      	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//    	String strngText1 = elementText1.getText();
//    	System.out.printf(strngText1);
//    	System.out.println();
//    	System.out.println("---------------------------------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a + " |");
    	System.out.println();
    	System.out.println("----------------------------------");
    	
//    	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//    	String strngText2 = elementText2.getText();
//    	System.out.printf(strngText2);
//    	System.out.println();
//    	System.out.println("---------------------------------------------------------------------");
    	
    	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
    	
    	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS4 = elementRS4.getText();
    	System.out.printf("| " + strngRS4);
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng4 = element4.getText();
    	System.out.printf(strng4);
    	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng4a = element4a.getText();
    	System.out.printf(strng4a);
    	
    	WebDriverWait wait5 = new WebDriverWait(driver, 200);
    	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
    	
    	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS5 = elementRS5.getText();
    	System.out.printf(" | " + strngRS5);
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng5 = element5.getText();
    	System.out.printf(strng5);
    	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng5a = element5a.getText();
    	System.out.printf(strng5a);
    	
    	
    	WebDriverWait wait6 = new WebDriverWait(driver, 200);
    	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
    	
    	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS6 = elementRS6.getText();
    	System.out.printf(" | " + strngRS6);
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng6 = element6.getText();
    	System.out.printf(strng6);
    	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng6a = element6a.getText();
    	System.out.printf(strng6a + " |");
    	System.out.println();
    	System.out.println("----------------------------------");
    	
     	driver.quit();
    }
    
//------------------------------------------------------------// 
// Precificação preço dos Cards de Combos - G2_FSP_3P_50_vdsl //
//------------------------------------------------------------// 	     
  	     
     @And ("acessa pg de combo G2")
     public void paginaCoberturaG2()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/brusque_SC/combos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
     }
     
    
     @Then ("valida preco dos cards de combos G2")
     public void retornoSucessoouErroG2() throws InterruptedException {   	
     	System.out.println("----------------------------------------------------");
       	System.out.println("|B2C - Preços Cards de Combos - (G2_FSP_3P_50_vdsl)|");
       	System.out.println("----------------------------------------------------");
       	
//       	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//     	String strngText1 = elementText1.getText();
//     	System.out.printf(strngText1);
//     	System.out.println();
//     	System.out.println("---------------------------------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a + " |");
     	System.out.println();
     	System.out.println("----------------------------------");
     	
//     	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//     	String strngText2 = elementText2.getText();
//     	System.out.printf(strngText2);
//     	System.out.println();
//     	System.out.println("---------------------------------------------------------------------");
     	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf("| " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a);
     	
     	WebDriverWait wait5 = new WebDriverWait(driver, 200);
     	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS5 = elementRS5.getText();
     	System.out.printf(" | " + strngRS5);
     	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng5 = element5.getText();
     	System.out.printf(strng5);
     	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng5a = element5a.getText();
     	System.out.printf(strng5a);
     	
     	WebDriverWait wait6 = new WebDriverWait(driver, 200);
     	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS6 = elementRS6.getText();
     	System.out.printf(" | " + strngRS6);
     	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng6 = element6.getText();
     	System.out.printf(strng6);
     	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng6a = element6a.getText();
     	System.out.printf(strng6a + " |");
     	System.out.println();
     	System.out.println("----------------------------------");
     	
      	driver.quit();
     }
     
//--------------------------------------------------------// 
// Precificação preço dos Cards de Combos - G3_FSP_50_GPON//
//--------------------------------------------------------// 	     
   	     
      @And ("acessa pg de combo G3")
      public void paginaCoberturaG3()  throws InterruptedException {	
      	driver.get("https://assine.vivo.com.br/navegantes_SC/combos");
      	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
      }
      
     
      @Then ("valida preco dos cards de combos G3")
      public void retornoSucessoouErroG3() throws InterruptedException {   	
      	System.out.println("-------------------------------------------------");
        System.out.println("|B2C - Preços Cards de Combos - (G3_FSP_50_GPON)|");
        System.out.println("-------------------------------------------------");
        	
//        	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//      	String strngText1 = elementText1.getText();
//      	System.out.printf(strngText1);
//      	System.out.println();
//      	System.out.println("---------------------------------------------------------------------");
      	
        WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
      	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a);
            	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
      	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
      	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS3 = elementRS3.getText();
      	System.out.printf(" | " + strngRS3);
      	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng3 = element3.getText();
      	System.out.printf(strng3);
      	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng3a = element3a.getText();
      	System.out.printf(strng3a + " |");
      	System.out.println();
      	System.out.println("----------------------------------");
      	
//      	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//      	String strngText2 = elementText2.getText();
//      	System.out.printf(strngText2);
//      	System.out.println();
//      	System.out.println("---------------------------------------------------------------------");
      	
      	WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
      	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
      	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
      	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS6 = elementRS6.getText();
      	System.out.printf(" | " + strngRS6);
      	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng6 = element6.getText();
      	System.out.printf(strng6);
      	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng6a = element6a.getText();
      	System.out.printf(strng6a + " |");
      	System.out.println();
      	System.out.println("----------------------------------");
      	
       	driver.quit();
      }     
   
//-----------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G4_FSP_2P_15_vdsl //
//-----------------------------------------------------------// 	     
	     
 @And ("acessa pg de combo G4")
 public void paginaCoberturaG4()  throws InterruptedException {	
 	driver.get("https://assine.vivo.com.br/rondonopolis_MT/combos");
 	
 	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Banda Larga + Telefonia Fixa"));
 }
 

 @Then ("valida preco dos cards de combos G4")
 public void retornoSucessoouErroG4() throws InterruptedException {   	
 		System.out.println("----------------------------------------------------");
	   	System.out.println("|B2C - Preços Cards de Combos - (G4_FSP_2P_15_vdsl)|");
	   	System.out.println("----------------------------------------------------");
	   	
	//   	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
	// 	String strngText1 = elementText1.getText();
	// 	System.out.printf(strngText1);
	// 	System.out.println();
	// 	System.out.println("---------------------------------------------------------------------");
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	 	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	 	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS = elementRS.getText();
	 	System.out.printf("| " + strngRS);
	 	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng1 = element1.getText();
	 	System.out.printf(strng1);
	 	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng1a = element1a.getText();
	 	System.out.printf(strng1a);
	 	
	 	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	 	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	 	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS2 = elementRS2.getText();
	 	System.out.printf(" | " + strngRS2);
	 	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng2 = element2.getText();
	 	System.out.printf(strng2);
	 	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng2a = element2a.getText();
	 	System.out.printf(strng2a);
	       	
	 	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	 	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	 	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS3 = elementRS3.getText();
	 	System.out.printf(" | " + strngRS3);
	 	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng3 = element3.getText();
	 	System.out.printf(strng3);
	 	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng3a = element3a.getText();
	 	System.out.printf(strng3a + " |");
	 	System.out.println();
	 	System.out.println("----------------------------------");
	 	
	// 	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
	// 	String strngText2 = elementText2.getText();
	// 	System.out.printf(strngText2);
	// 	System.out.println();
	// 	System.out.println("---------------------------------------------------------------------");
	 	
	 	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	 	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	 	
	 	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS4 = elementRS4.getText();
	 	System.out.printf("| " + strngRS4);
	 	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng4 = element4.getText();
	 	System.out.printf(strng4);
	 	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng4a = element4a.getText();
	 	System.out.printf(strng4a);
	 	
	 	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	 	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	 	
	 	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS5 = elementRS5.getText();
	 	System.out.printf(" | " + strngRS5);
	 	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng5 = element5.getText();
	 	System.out.printf(strng5);
	 	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng5a = element5a.getText();
	 	System.out.printf(strng5a);
	 	
	 	
	 	WebDriverWait wait6 = new WebDriverWait(driver, 200);
	 	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	 	
	 	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	 	String strngRS6 = elementRS6.getText();
	 	System.out.printf(" | " + strngRS6);
	 	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	 	String strng6 = element6.getText();
	 	System.out.printf(strng6);
	 	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	 	String strng6a = element6a.getText();
	 	System.out.printf(strng6a + " |");
	 	System.out.println();
	 	System.out.println("----------------------------------");
	 	
	  	driver.quit();
 }
 
//----------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G5_FSP_3P_50_vdsl_plus //
//----------------------------------------------------------------// 	     
	     
  @And ("acessa pg de combo G5")
  public void paginaCoberturaG5()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/curitiba_PR/combos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
  }
  
 
  @Then ("valida preco dos cards de combos G5")
  public void retornoSucessoouErroG5() throws InterruptedException {   	
  	    System.out.println("---------------------------------------------------------");
    	System.out.println("|B2C - Preços Cards de Combos - (G5_FSP_3P_50_vdsl_plus)|");
    	System.out.println("---------------------------------------------------------");
    	
//    	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//  	String strngText1 = elementText1.getText();
//  	System.out.printf(strngText1);
//  	System.out.println();
//  	System.out.println("---------------------------------------------------------------------");
  	
	    WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a + " |");
	  	System.out.println();
	  	System.out.println("----------------------------------");
	  	
	//  	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
	//  	String strngText2 = elementText2.getText();
	//  	System.out.printf(strngText2);
	//  	System.out.println();
	//  	System.out.println("---------------------------------------------------------------------");
	  	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	  	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf("| " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a);
	  	
	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	  	
	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS5 = elementRS5.getText();
	  	System.out.printf(" | " + strngRS5);
	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng5 = element5.getText();
	  	System.out.printf(strng5);
	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng5a = element5a.getText();
	  	System.out.printf(strng5a);
	  	
	  	
	  	WebDriverWait wait6 = new WebDriverWait(driver, 200);
	  	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	  	
	  	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS6 = elementRS6.getText();
	  	System.out.printf(" | " + strngRS6);
	  	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng6 = element6.getText();
	  	System.out.printf(strng6);
	  	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng6a = element6a.getText();
	  	System.out.printf(strng6a + " |");
	  	System.out.println();
	  	System.out.println("----------------------------------");
	  	
	   	driver.quit();
  } 
 
//-----------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G6_SP_3P_100_gpon //
//-----------------------------------------------------------// 	     
	     
  @And ("acessa pg de combo G6")
  public void paginaCoberturaG6()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/sao-paulo_SP/combos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
  }
  
  @Then ("valida preco dos cards de combos G6")
  public void retornoSucessoouErroG6() throws InterruptedException {   	
  	    System.out.println("----------------------------------------------------");
    	System.out.println("|B2C - Preços Cards de Combos - (G6_SP_3P_100_gpon)|");
    	System.out.println("----------------------------------------------------");
    	
//    	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//  	String strngText1 = elementText1.getText();
//  	System.out.printf(strngText1);
//  	System.out.println();
//  	System.out.println("---------------------------------------------------------------------");
  	
	    WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a + " |");
	  	System.out.println();
	  	System.out.println("----------------------------------");
  	
//  	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//  	String strngText2 = elementText2.getText();
//  	System.out.printf(strngText2);
//  	System.out.println();
//  	System.out.println("---------------------------------------------------------------------");
  	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	  	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf("| " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a);
	  	
	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	  	
	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS5 = elementRS5.getText();
	  	System.out.printf(" | " + strngRS5);
	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng5 = element5.getText();
	  	System.out.printf(strng5);
	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng5a = element5a.getText();
	  	System.out.printf(strng5a);
	  	
	  	WebDriverWait wait6 = new WebDriverWait(driver, 200);
	  	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
	  	
	  	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	  	String strngRS6 = elementRS6.getText();
	  	System.out.printf(" | " + strngRS6);
	  	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	  	String strng6 = element6.getText();
	  	System.out.printf(strng6);
	  	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	  	String strng6a = element6a.getText();
	  	System.out.printf(strng6a + " |");
	  	System.out.println();
	  	System.out.println("----------------------------------");
	  	
	   	driver.quit();
  } 
  
//----------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G7_SP_3P_50_vdsl //
//----------------------------------------------------------// 	     
	     
  @And ("acessa pg de G7")
  public void paginaCoberturaG7()  throws InterruptedException {	
  	    driver.get("https://assine.vivo.com.br/aruja_SP");
  	
  	    WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
  }
  
  @And ("informa menu combo G7")
  public void acessarMenuCoberturaG7() throws InterruptedException { 	
	    Actions act2=new Actions(driver); 	
        act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a"))).click().build().perform();
  }
  
  @When ("na modal de consulta G7")
  public void consultaCoberturaG7()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
  	
  	    driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robson Vieira Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("07402-120");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("27");
       
  }
  
  @And ("informa botao consultar G7")
  public void consultaG7() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
  }
  
  @Then ("valida preco dos cards de combos G7")
  public void retornoSucessoouErroG7() throws InterruptedException {   	
	    System.out.println("--------------------------------------------------");
  	    System.out.println("B2C - Verifica página Vivo TV - (G7_SP_3P_50_vdsl)");
     	System.out.println("--------------------------------------------------");
  	     	    	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.id("btnLinkMonte"), "Monte sua oferta"));

 	    System.out.printf("Resultado página: "+ driver.getTitle());
 	    System.out.println();
 	    System.out.println("---------------------------------------------");
 	    driver.quit(); 	
  }   
  
//-------------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G9_FSP_3P_gpon_lançamento //
//-------------------------------------------------------------------// 	     
	     
   @And ("acessa pg de combo G9")
   public void paginaCoberturaG9()  throws InterruptedException {	
   		driver.get("https://assine.vivo.com.br/teresina_PI/combos");
   	
   		WebDriverWait wait1 = new WebDriverWait(driver, 200);
   		wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
   }
   
  
   @Then ("valida preco dos cards de combos G9")
   public void retornoSucessoouErroG9() throws InterruptedException {   	
    	System.out.println("------------------------------------------------------------");
     	System.out.println("|B2C - Preços Cards de Combos - (G9_FSP_3P_gpon_lançamento)|");
     	System.out.println("------------------------------------------------------------");
     	
//     	WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//   	String strngText1 = elementText1.getText();
//   	System.out.printf(strngText1);
//   	System.out.println();
//   	System.out.println("---------------------------------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
   	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
   		WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng2a = element2a.getText();
   		System.out.printf(strng2a);
         	
   		WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   	
//   	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//   	String strngText2 = elementText2.getText();
//   	System.out.printf(strngText2);
//   	System.out.println();
//   	System.out.println("---------------------------------------------------------------------");
   	
	   	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	   	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	   	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS4 = elementRS4.getText();
	   	System.out.printf("| " + strngRS4);
	   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng4 = element4.getText();
	   	System.out.printf(strng4);
	   	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng4a = element4a.getText();
	   	System.out.printf(strng4a);
	   	
	   	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	   	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	   	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS5 = elementRS5.getText();
	   	System.out.printf(" | " + strngRS5);
	   	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng5 = element5.getText();
	   	System.out.printf(strng5);
	   	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng5a = element5a.getText();
	   	System.out.printf(strng5a);
	   	
	   	
	   	WebDriverWait wait6 = new WebDriverWait(driver, 200);
	   	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	
	   	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS6 = elementRS6.getText();
	   	System.out.printf(" | " + strngRS6);
	   	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng6 = element6.getText();
	   	System.out.printf(strng6);
	   	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng6a = element6a.getText();
	   	System.out.printf(strng6a + " |");
	   	System.out.println();
	   	System.out.println("----------------------------------");
   	
    	driver.quit();
   }

//-------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G10_FSP_3P_100_GPON //
//-------------------------------------------------------------// 	     
 	     
    @And ("acessa pg combo G10")
    public void paginaCoberturaG10()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/garanhuns_PE/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"), "Banda Larga + TV por Assinatura + Telefonia Fixa"));
    }
    
    @Then ("valida preco cards de combos G10")
    public void retornoSucessoouErroG10() throws InterruptedException {   	
     	System.out.println("------------------------------------------------------");
      	System.out.println("|B2C - Preços Cards de Combos - (G10_FSP_3P_100_GPON)|");
      	System.out.println("------------------------------------------------------");
      	
//      WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//    	String strngText1 = elementText1.getText();
//    	System.out.printf(strngText1);
//    	System.out.println();
//    	System.out.println("---------------------------------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
    	
//    	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//    	String strngText2 = elementText2.getText();
//    	System.out.printf(strngText2);
//    	System.out.println();
//    	System.out.println("---------------------------------------------------------------------");
    	
    	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
 	   	
 	   	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
 	   	String strngRS4 = elementRS4.getText();
 	   	System.out.printf("| " + strngRS4);
 	   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
 	   	String strng4 = element4.getText();
 	   	System.out.printf(strng4);
 	   	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
 	   	String strng4a = element4a.getText();
 	   	System.out.printf(strng4a);
 	   	
 	   	WebDriverWait wait5 = new WebDriverWait(driver, 200);
 	   	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
 	   	
 	   	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
 	   	String strngRS5 = elementRS5.getText();
 	   	System.out.printf(" | " + strngRS5);
 	   	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
 	   	String strng5 = element5.getText();
 	   	System.out.printf(strng5);
 	   	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
 	   	String strng5a = element5a.getText();
 	   	System.out.printf(strng5a);
 	   	
 	   	
 	   	WebDriverWait wait6 = new WebDriverWait(driver, 200);
 	   	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
 	   	
 	   	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
 	   	String strngRS6 = elementRS6.getText();
 	   	System.out.printf(" | " + strngRS6);
 	   	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
 	   	String strng6 = element6.getText();
 	   	System.out.printf(strng6);
 	   	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
 	   	String strng6a = element6a.getText();
 	   	System.out.printf(strng6a + " |");
 	   	System.out.println();
 	    System.out.println("----------------------------------");
    	
     	driver.quit();
    }   
  
//------------------------------------------------// 
//Precificação preço dos Cards de Combos - OFFNET //
//------------------------------------------------// 	     
   	     
      @And ("acessa pg combo Offnet")
      public void paginaCoberturaOffnet()  throws InterruptedException {	
      	 	driver.get("https://assine.vivo.com.br/erechim_RS/combos");
      		
      		WebDriverWait wait1 = new WebDriverWait(driver, 200);
      		wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Banda Larga + Telefonia Fixa"));
      }
      
      @Then ("valida preco cards de combos Offnet")
      public void retornoSucessoouErroOffnet() throws InterruptedException {   	
       		System.out.println("-----------------------------------------");
        	System.out.println("|B2C - Preços Cards de Combos - (OFFNET)|");
        	System.out.println("-----------------------------------------");
        	
//          WebElement elementText1 = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
//      	String strngText1 = elementText1.getText();
//      	System.out.printf(strngText1);
//      	System.out.println();
//      	System.out.println("---------------------------------------------------------------------");
      	
        	WebDriverWait wait1 = new WebDriverWait(driver, 200);
        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS = elementRS.getText();
        	System.out.printf("| " + strngRS);
        	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng1 = element1.getText();
        	System.out.printf(strng1);
        	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng1a = element1a.getText();
        	System.out.printf(strng1a);
      	
        	WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS2 = elementRS2.getText();
        	System.out.printf(" | " + strngRS2);
        	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng2 = element2.getText();
        	System.out.printf(strng2);
        	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng2a = element2a.getText();
        	System.out.printf(strng2a);
            	
        	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
     		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     		String strngRS3 = elementRS3.getText();
     		System.out.printf(" | " + strngRS3);
     		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     		String strng3 = element3.getText();
     		System.out.printf(strng3);
     		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     		String strng3a = element3a.getText();
     		System.out.printf(strng3a + " |");
     		System.out.println();
     		System.out.println("----------------------------------");
      	
//      	WebElement elementText2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[2]/div/div/h1/strong"));
//      	String strngText2 = elementText2.getText();
//      	System.out.printf(strngText2);
//      	System.out.println();
//      	System.out.println("---------------------------------------------------------------------");
      	
     		WebDriverWait wait4 = new WebDriverWait(driver, 200);
	      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS4 = elementRS4.getText();
	   	   	System.out.printf("| " + strngRS4);
	   	   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng4 = element4.getText();
	   	   	System.out.printf(strng4);
	   	   	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[4]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng4a = element4a.getText();
	   	   	System.out.printf(strng4a);
	   	   	
	   	   	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	   	   	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS5 = elementRS5.getText();
	   	   	System.out.printf(" | " + strngRS5);
	   	   	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng5 = element5.getText();
	   	   	System.out.printf(strng5);
	   	   	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[5]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng5a = element5a.getText();
	   	   	System.out.printf(strng5a);
	   	   	
	   	   	
	   	   	WebDriverWait wait6 = new WebDriverWait(driver, 200);
	   	   	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS6 = elementRS6.getText();
	   	   	System.out.printf(" | " + strngRS6);
	   	   	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng6 = element6.getText();
	   	   	System.out.printf(strng6);
	   	   	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng6a = element6a.getText();
	   	   	System.out.printf(strng6a + " |");
	   	   	System.out.println();
	   	    System.out.println("----------------------------------");
	      	
	       	driver.quit();
      }      
      
//----------------------------------------------------// 
//Precificação preço dos Cards de Combos - Massivo SP //
//----------------------------------------------------// 	     
    	     
      @And ("acessa pg de Massivo SP")
      public void paginaCoberturaMassivoSP()  throws InterruptedException {	
    	    driver.navigate().to("https://assine.vivo.com.br/aguai_SP");
      	
      	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
      }
      
      @And ("informa menu combo Massivo SP")
      public void acessarMenuCoberturaMassivoSP() throws InterruptedException { 	
    	    Actions act2=new Actions(driver); 	
            act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a"))).click().build().perform();
      }
      
      @When ("na modal de consulta Massivo SP")
      public void consultaCoberturaMassivoSP()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
  	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Marcos Ferreira Testando");   
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("13860-000");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("868");
      }
      
      @And ("informa botao consultar Massivo SP")
      public void consultaMassivoSP() throws InterruptedException {
        	driver.findElement(By.className("btn-consult")).click();
        	
        	WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
      }
      
      @Then ("valida preco dos cards de combos Massivo SP")
      public void retornoSucessoouErroMassivoSP() throws InterruptedException {   	
    	    System.out.println("--------------------------------------------");
        	System.out.println("B2C - Verifica página Vivo TV - (Massivo SP)");
        	System.out.println("--------------------------------------------");
        	     	    	     	
        	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	      	wait4.until(ExpectedConditions.textToBe(By.id("btnLinkMonte"), "Monte sua oferta"));

        	System.out.printf("Resultado página: "+ driver.getTitle());
        	System.out.println();
        	System.out.println("--------------------------------------------");
        	driver.quit(); 	
      } 

//---------------------------------------------------// 
//Precificação preço dos Cards de Combos - Defaut SP //
//---------------------------------------------------// 	     
 	     
    @And ("acessa pg de Defaut SP")
    public void paginaCoberturaDefautSP()  throws InterruptedException {	
  	    driver.navigate().to("https://assine.vivo.com.br/bocaina_SP");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
  	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("informa menu combo Defaut SP")
    public void acessarMenuCoberturaDefautSP() throws InterruptedException { 	
  	    Actions act2=new Actions(driver); 	
        act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a"))).click().build().perform();
    }
    
    @When ("na modal de consulta Defaut SP")
    public void consultaCoberturaDefautSP()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));

  	    driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Neto Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("17240-000");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("474");
    }
    
    @And ("informa botao consultar Defaut SP")
    public void consultaDefautSP() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
    }
    
    @Then ("valida preco dos cards de combos Defaut SP")
    public void retornoSucessoouErroDefautSP() throws InterruptedException {   	
  	    System.out.println("-------------------------------------------");
      	System.out.println("B2C - Verifica página Vivo TV - (Defaut SP)");
      	System.out.println("-------------------------------------------");
      	     	    	     	
      	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	    wait4.until(ExpectedConditions.textToBe(By.id("btnLinkMonte"), "Monte sua oferta"));
 
      	System.out.printf("Resultado página: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("-------------------------------------------");
      	driver.quit(); 	
    }             
      
//-----//
// B2B //
//-----//      
//------------------------------------------------------// 
//Precificação preço dos Cards de Combos - Onnet_padrao //
//------------------------------------------------------// 	     
  	     
      @And ("acessa pg combo Onnet_padrao")
      public void paginaCoberturaOnnetpadrao()  throws InterruptedException {	
      	driver.get("https://assine.vivo.com.br/apucarana_PR/empresas/pequenas-e-medias/combos");
      	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
      }
      
      @Then ("valida preco cards de combos Onnet_padrao")
      public void retornoSucessoouErroOnnetpadrao() throws InterruptedException {   	
    	  	System.out.println("-----------------------------------------------");
        	System.out.println("|B2B - Preços Cards de Combos - (Onnet_padrao)|");
        	System.out.println("-----------------------------------------------");	
        	System.out.println("|            COMBOS 2P           |");
        	System.out.println("----------------------------------");
        	
//Internet + Telefone Fixo// 
//Aba 01//       	
        	WebDriverWait wait1 = new WebDriverWait(driver, 200);
        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS = elementRS.getText();
        	System.out.printf("| " + strngRS);
        	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng1 = element1.getText();
        	System.out.printf(strng1);
        	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng1a = element1a.getText();
        	System.out.printf(strng1a);
      	
        	WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS2 = elementRS2.getText();
        	System.out.printf(" | " + strngRS2);
        	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng2 = element2.getText();
        	System.out.printf(strng2);
        	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng2a = element2a.getText();
        	System.out.printf(strng2a); 	
            	
        	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
     		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     		String strngRS3 = elementRS3.getText();
     		System.out.printf(" | " + strngRS3);
     		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     		String strng3 = element3.getText();
     		System.out.printf(strng3);
     		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     		String strng3a = element3a.getText();
     		System.out.printf(strng3a + " |");
     		System.out.println();
     		System.out.println("----------------------------------");
     		
//Aba 2//        		
     		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
     		
     		WebDriverWait wait4 = new WebDriverWait(driver, 200);
        	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS4 = elementRS4.getText();
        	System.out.printf("| " + strngRS4);
        	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng4 = element4.getText();
        	System.out.printf(strng4);
        	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng4a = element4a.getText();
        	System.out.printf(strng4a);
      	
        	WebDriverWait wait5 = new WebDriverWait(driver, 200);
        	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
        	String strngRS5 = elementRS5.getText();
        	System.out.printf(" | " + strngRS5);
        	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
        	String strng5 = element5.getText();
        	System.out.printf(strng5);
        	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
        	String strng5a = element5a.getText();
        	System.out.printf(strng5a);
            	
        	WebDriverWait wait6 = new WebDriverWait(driver, 200);
     		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
     		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
     		String strngRS6 = elementRS6.getText();
     		System.out.printf(" | " + strngRS6);
     		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
     		String strng6 = element6.getText();
     		System.out.printf(strng6);
     		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
     		String strng6a = element6a.getText();
     		System.out.printf(strng6a + " |");
     		System.out.println();

//Internet + TV por Assinatura + Telefone Fixo//
//Aba 01//   
     		System.out.println("----------------------------------");
        	System.out.println("|            COMBOS 3P           |");
        	System.out.println("----------------------------------");
        	
	      	WebDriverWait wait7 = new WebDriverWait(driver, 200);
	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS7 = elementRS7.getText();
	   	   	System.out.printf("| " + strngRS7);
	   	   	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng7 = element7.getText();
	   	   	System.out.printf(strng7);
	   	   	WebElement element7a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng7a = element7a.getText();
	   	   	System.out.printf(strng7a);
	   	   	
	   	   	WebDriverWait wait8 = new WebDriverWait(driver, 200);
	   	   	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS8 = elementRS8.getText();
	   	   	System.out.printf(" | " + strngRS8);
	   	   	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng8 = element8.getText();
	   	   	System.out.printf(strng8);
	   	   	WebElement element8a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng8a = element8a.getText();
	   	   	System.out.printf(strng8a);
	   	   	
	   	   	WebDriverWait wait9 = new WebDriverWait(driver, 200);
	   	   	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS9 = elementRS9.getText();
	   	   	System.out.printf(" | " + strngRS9);
	   	   	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng9 = element9.getText();
	   	   	System.out.printf(strng9);
	   	   	WebElement element9a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng9a = element9a.getText();
	   	   	System.out.printf(strng9a + " |");
	   	   	System.out.println();
	   	    System.out.println("----------------------------------");

//Aba 2//        		
     		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ol/li[3]/span")).click();	   	    
	   	    
	      	WebDriverWait wait10 = new WebDriverWait(driver, 200);
	      	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS10 = elementRS10.getText();
	   	   	System.out.printf("| " + strngRS10);
	   	   	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng10 = element10.getText();
	   	   	System.out.printf(strng10);
	   	   	WebElement element10a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng10a = element10a.getText();
	   	   	System.out.printf(strng10a);
	   	   	
	   	   	WebDriverWait wait11 = new WebDriverWait(driver, 200);
	   	   	wait11.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS11 = elementRS11.getText();
	   	   	System.out.printf(" | " + strngRS11);
	   	   	WebElement element11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng11 = element11.getText();
	   	   	System.out.printf(strng11);
	   	   	WebElement element11a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng11a = element11a.getText();
	   	   	System.out.printf(strng11a);
	   	   	
	   	   	WebDriverWait wait12 = new WebDriverWait(driver, 200);
	   	   	wait12.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS12 = elementRS12.getText();
	   	   	System.out.printf(" | " + strngRS12);
	   	   	WebElement element12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng12 = element12.getText();
	   	   	System.out.printf(strng12);
	   	   	WebElement element12a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng12a = element12a.getText();
	   	   	System.out.printf(strng12a + " |");
	   	   	System.out.println();
	   	    System.out.println("----------------------------------");
     		
	       	driver.quit();
      }     

//------------------------------------------------------// 
//Precificação preço dos Cards de Combos - Onnet_sem_tv //
//------------------------------------------------------// 	     
	     
    @And ("acessa pg combo Onnet_sem_tv")
    public void paginaCoberturaOnnetsemtv()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/cuiaba_MT/empresas/pequenas-e-medias/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
    }
    
    @Then ("valida preco cards de combos Onnet_sem_tv")
    public void retornoSucessoouErroOnnetsemtv() throws InterruptedException {   	
  	  	System.out.println("-----------------------------------------------");
      	System.out.println("|B2B - Preços Cards de Combos - (Onnet_sem_tv)|");
      	System.out.println("-----------------------------------------------");	
      	System.out.println("|            COMBOS 2P           |");
      	System.out.println("----------------------------------");
      	
//Internet + Telefone Fixo// 
//Aba 01//       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a); 	
          	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   		
//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
   		
   		WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
    	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
          	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
   		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS6 = elementRS6.getText();
   		System.out.printf(" | " + strngRS6);
   		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng6 = element6.getText();
   		System.out.printf(strng6);
   		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng6a = element6a.getText();
   		System.out.printf(strng6a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");

       	driver.quit();
    }     
    
//----------------------------------------------------// 
//Precificação preço dos Cards de Combos - Onnet_plus //
//----------------------------------------------------// 	     
	     
    @And ("acessa pg combo Onnet_plus")
    public void paginaCoberturaOnnetplus()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/curitiba_PR/empresas/pequenas-e-medias/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
    }
    
    @Then ("valida preco cards de combos Onnet_plus")
    public void retornoSucessoouErroOnnetplus() throws InterruptedException {   	
  	  	System.out.println("---------------------------------------------");
      	System.out.println("|B2B - Preços Cards de Combos - (Onnet_plus)|");
      	System.out.println("---------------------------------------------");	
      	System.out.println("|            COMBOS 2P           |");
      	System.out.println("----------------------------------");
      	
//Internet + Telefone Fixo// 
//Aba 01//       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a); 	
          	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   		
//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
   		
   		WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
    	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
          	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
   		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS6 = elementRS6.getText();
   		System.out.printf(" | " + strngRS6);
   		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng6 = element6.getText();
   		System.out.printf(strng6);
   		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng6a = element6a.getText();
   		System.out.printf(strng6a + " |");
   		System.out.println();

//Internet + TV por Assinatura + Telefone Fixo//
//Aba 01//   
   		System.out.println("----------------------------------");
      	System.out.println("|            COMBOS 3P           |");
      	System.out.println("----------------------------------");
      	
	      	WebDriverWait wait7 = new WebDriverWait(driver, 200);
	      	wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS7 = elementRS7.getText();
	   	   	System.out.printf("| " + strngRS7);
	   	   	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng7 = element7.getText();
	   	   	System.out.printf(strng7);
	   	   	WebElement element7a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng7a = element7a.getText();
	   	   	System.out.printf(strng7a);
	   	   	
	   	   	WebDriverWait wait8 = new WebDriverWait(driver, 200);
	   	   	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS8 = elementRS8.getText();
	   	   	System.out.printf(" | " + strngRS8);
	   	   	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng8 = element8.getText();
	   	   	System.out.printf(strng8);
	   	   	WebElement element8a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng8a = element8a.getText();
	   	   	System.out.printf(strng8a);
	   	   	
	   	   	WebDriverWait wait9 = new WebDriverWait(driver, 200);
	   	   	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS9 = elementRS9.getText();
	   	   	System.out.printf(" | " + strngRS9);
	   	   	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng9 = element9.getText();
	   	   	System.out.printf(strng9);
	   	   	WebElement element9a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng9a = element9a.getText();
	   	   	System.out.printf(strng9a + " |");
	   	   	System.out.println();
	   	    System.out.println("----------------------------------");

//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ol/li[3]/span")).click();	   	    
	   	    
	      	WebDriverWait wait10 = new WebDriverWait(driver, 200);
	      	wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS10 = elementRS10.getText();
	   	   	System.out.printf("| " + strngRS10);
	   	   	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng10 = element10.getText();
	   	   	System.out.printf(strng10);
	   	   	WebElement element10a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng10a = element10a.getText();
	   	   	System.out.printf(strng10a);
	   	   	
	   	   	WebDriverWait wait11 = new WebDriverWait(driver, 200);
	   	   	wait11.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS11 = elementRS11.getText();
	   	   	System.out.printf(" | " + strngRS11);
	   	   	WebElement element11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng11 = element11.getText();
	   	   	System.out.printf(strng11);
	   	   	WebElement element11a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng11a = element11a.getText();
	   	   	System.out.printf(strng11a);
	   	   	
	   	   	WebDriverWait wait12 = new WebDriverWait(driver, 200);
	   	   	wait12.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	   	WebElement elementRS12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	   	String strngRS12 = elementRS12.getText();
	   	   	System.out.printf(" | " + strngRS12);
	   	   	WebElement element12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	   	String strng12 = element12.getText();
	   	   	System.out.printf(strng12);
	   	   	WebElement element12a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	   	String strng12a = element12a.getText();
	   	   	System.out.printf(strng12a + " |");
	   	   	System.out.println();
	   	    System.out.println("----------------------------------");
   		
	       	driver.quit();
    }   

//----------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G7_SP_3P_50_vdsl - B2B //
//----------------------------------------------------------------// 	     
	     
  @And ("acessa pg combo G7_SP_B2B")
  public void paginaCoberturaG7spb2b()  throws InterruptedException {	
  	driver.get("https://assine.vivo.com.br/votorantim_SP/empresas/pequenas-e-medias/combos");
  	
  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
  }
  
  @Then ("valida preco cards de combos G7_SP_B2B")
  public void retornoSucessoouErroG7spb2b() throws InterruptedException {   	
	  	System.out.println("---------------------------------------------------------");
    	System.out.println("|B2B - Preços Cards de Combos - (G7_SP_3P_50_vdsl - B2B)|");
    	System.out.println("---------------------------------------------------------");	
    	System.out.println("|            COMBOS 2P           |");
    	System.out.println("----------------------------------");
    	
//Internet + Telefone Fixo// 
//Aba 01//       	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
  	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a); 	
        	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
 		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
 		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
 		String strngRS3 = elementRS3.getText();
 		System.out.printf(" | " + strngRS3);
 		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
 		String strng3 = element3.getText();
 		System.out.printf(strng3);
 		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
 		String strng3a = element3a.getText();
 		System.out.printf(strng3a + " |");
 		System.out.println();
 		System.out.println("----------------------------------");
 		
//Aba 2//        		
 		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
 		
 		WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
    	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS4 = elementRS4.getText();
    	System.out.printf("| " + strngRS4);
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng4 = element4.getText();
    	System.out.printf(strng4);
    	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng4a = element4a.getText();
    	System.out.printf(strng4a);
  	
    	WebDriverWait wait5 = new WebDriverWait(driver, 200);
    	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
    	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
    	String strngRS5 = elementRS5.getText();
    	System.out.printf(" | " + strngRS5);
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
    	String strng5 = element5.getText();
    	System.out.printf(strng5);
    	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
    	String strng5a = element5a.getText();
    	System.out.printf(strng5a);
        	
    	WebDriverWait wait6 = new WebDriverWait(driver, 200);
 		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
    	
 		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
 		String strngRS6 = elementRS6.getText();
 		System.out.printf(" | " + strngRS6);
 		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
 		String strng6 = element6.getText();
 		System.out.printf(strng6);
 		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
 		String strng6a = element6a.getText();
 		System.out.printf(strng6a + " |");
 		System.out.println();
 		System.out.println("----------------------------------");

     	driver.quit();
  }

//--------------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - G9_FSP_3P_gpon_lançamento  //
//--------------------------------------------------------------------// 	     
	     
    @And ("acessa pg combo G9_FSP_B2B")
    public void paginaCoberturaG9fspB2B()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/teresina_PI/empresas/pequenas-e-medias/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
    }
    
    @Then ("valida preco cards de combos G9_FSP_B2B")
    public void retornoSucessoouErroG9fspB2B() throws InterruptedException {   	
  	  	System.out.println("------------------------------------------------------------");
      	System.out.println("|B2B - Preços Cards de Combos - (G9_FSP_3P_gpon_lançamento)|");
      	System.out.println("------------------------------------------------------------");	
      	System.out.println("|            COMBOS 2P           |");
      	System.out.println("----------------------------------");
      	
//Internet + Telefone Fixo// 
//Aba 01//       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a); 	
          	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   		
//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
   		
   		WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
    	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
          	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
   		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
      	
   		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS6 = elementRS6.getText();
   		System.out.printf(" | " + strngRS6);
   		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng6 = element6.getText();
   		System.out.printf(strng6);
   		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng6a = element6a.getText();
   		System.out.printf(strng6a + " |");
   		System.out.println();

//Internet + TV por Assinatura + Telefone Fixo//
//Aba 01//   
   		System.out.println("----------------------------------");
      	System.out.println("|            COMBOS 3P           |");
      	System.out.println("----------------------------------");
      	
	    WebDriverWait wait7 = new WebDriverWait(driver, 200);
	    wait7.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS7 = elementRS7.getText();
	   	System.out.printf("| " + strngRS7);
	   	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng7 = element7.getText();
	   	System.out.printf(strng7);
	   	WebElement element7a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng7a = element7a.getText();
	   	System.out.printf(strng7a);
	   	   	
	   	WebDriverWait wait8 = new WebDriverWait(driver, 200);
	   	wait8.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS8 = elementRS8.getText();
	   	System.out.printf(" | " + strngRS8);
	   	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng8 = element8.getText();
	   	System.out.printf(strng8);
	   	WebElement element8a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng8a = element8a.getText();
	   	System.out.printf(strng8a);
	   	   	
	   	WebDriverWait wait9 = new WebDriverWait(driver, 200);
	   	wait9.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS9 = elementRS9.getText();
	   	System.out.printf(" | " + strngRS9);
	   	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng9 = element9.getText();
	   	System.out.printf(strng9);
	   	WebElement element9a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng9a = element9a.getText();
	   	System.out.printf(strng9a + " |");
	   	System.out.println();
	   	System.out.println("----------------------------------");

//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ol/li[3]/span")).click();	   	    
	   	    
	    WebDriverWait wait10 = new WebDriverWait(driver, 200);
	    wait10.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS10 = elementRS10.getText();
	   	System.out.printf("| " + strngRS10);
	   	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng10 = element10.getText();
	   	System.out.printf(strng10);
	   	WebElement element10a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[1]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng10a = element10a.getText();
	   	System.out.printf(strng10a);
	   	   	
	   	WebDriverWait wait11 = new WebDriverWait(driver, 200);
	   	wait11.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS11 = elementRS11.getText();
	   	System.out.printf(" | " + strngRS11);
	   	WebElement element11 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng11 = element11.getText();
	   	System.out.printf(strng11);
	   	WebElement element11a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[2]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng11a = element11a.getText();
	   	System.out.printf(strng11a);
	   	   	
	   	WebDriverWait wait12 = new WebDriverWait(driver, 200);
	   	wait12.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
	   	   	
	   	WebElement elementRS12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[1]"));
	   	String strngRS12 = elementRS12.getText();
	   	System.out.printf(" | " + strngRS12);
	   	WebElement element12 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"));
	   	String strng12 = element12.getText();
	   	System.out.printf(strng12);
	   	WebElement element12a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[2]/article[3]/div/div[4]/div[2]/div[2]/div[1]/div/div/strong"));
	   	String strng12a = element12a.getText();
	   	System.out.printf(strng12a + " |");
	   	System.out.println();
	   	System.out.println("----------------------------------");
   		
	    driver.quit();
    }   

//----------------------------------------------------// 
//Precificação preço dos Cards de Combos - OFFNET B2B //
//----------------------------------------------------// 	     
  	     
    @And ("acessa pg combo Offnet_B2B")
    public void paginaCoberturaOffnetB2B()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/votorantim_SP/empresas/pequenas-e-medias/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
    }
    
    @Then ("valida preco cards de combos Offnet_B2B")
    public void retornoSucessoouErroOffnetB2B() throws InterruptedException {   	
  	  	System.out.println("---------------------------------------------");
      	System.out.println("|B2B - Preços Cards de Combos - (Offnet_B2B)|");
      	System.out.println("---------------------------------------------");	
      	System.out.println("|            COMBOS 2P           |");
      	System.out.println("----------------------------------");
      	
//Internet + Telefone Fixo// 
//Aba 01//       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a); 	
          	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   		
//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
   		
   		WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
    	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
          	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
   		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
   		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS6 = elementRS6.getText();
   		System.out.printf(" | " + strngRS6);
   		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng6 = element6.getText();
   		System.out.printf(strng6);
   		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng6a = element6a.getText();
   		System.out.printf(strng6a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");

       	driver.quit();
    }    

//---------------------------------------------------------------// 
//Precificação preço dos Cards de Combos - Default_SP_soft - B2B //
//---------------------------------------------------------------// 	     
  	     
    @And ("acessa pg combo Default_SP_B2B")
    public void paginaCoberturaDefaultSPB2B()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/votorantim_SP/empresas/pequenas-e-medias/combos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"), "Internet + Telefone Fixo"));
    }
    
    @Then ("valida preco cards de combos Default_SP_B2B")
    public void retornoSucessoouErroDefaultSPB2B() throws InterruptedException {   	
  	  	System.out.println("--------------------------------------------------------");
      	System.out.println("|B2B - Preços Cards de Combos - (Default_SP_soft - B2B)|");
      	System.out.println("--------------------------------------------------------");	
      	System.out.println("|            COMBOS 2P           |");
      	System.out.println("----------------------------------");
      	
//Internet + Telefone Fixo// 
//Aba 01//       	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS = elementRS.getText();
      	System.out.printf("| " + strngRS);
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng1 = element1.getText();
      	System.out.printf(strng1);
      	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng1a = element1a.getText();
      	System.out.printf(strng1a);
    	
      	WebDriverWait wait2 = new WebDriverWait(driver, 200);
      	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS2 = elementRS2.getText();
      	System.out.printf(" | " + strngRS2);
      	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng2 = element2.getText();
      	System.out.printf(strng2);
      	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng2a = element2a.getText();
      	System.out.printf(strng2a); 	
          	
      	WebDriverWait wait3 = new WebDriverWait(driver, 200);
   		wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
   		WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS3 = elementRS3.getText();
   		System.out.printf(" | " + strngRS3);
   		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng3 = element3.getText();
   		System.out.printf(strng3);
   		WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[1]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng3a = element3a.getText();
   		System.out.printf(strng3a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");
   		
//Aba 2//        		
   		driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ol/li[3]/span")).click();
   		
   		WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS4 = elementRS4.getText();
      	System.out.printf("| " + strngRS4);
      	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng4 = element4.getText();
      	System.out.printf(strng4);
      	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[1]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng4a = element4a.getText();
      	System.out.printf(strng4a);
    	
      	WebDriverWait wait5 = new WebDriverWait(driver, 200);
      	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
      	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
      	String strngRS5 = elementRS5.getText();
      	System.out.printf(" | " + strngRS5);
      	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
      	String strng5 = element5.getText();
      	System.out.printf(strng5);
      	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
      	String strng5a = element5a.getText();
      	System.out.printf(strng5a);
          	
      	WebDriverWait wait6 = new WebDriverWait(driver, 200);
   		wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[2]/atom-button/a"), "Assine Já"));
      	
   		WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[1]"));
   		String strngRS6 = elementRS6.getText();
   		System.out.printf(" | " + strngRS6);
   		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/strong[2]"));
   		String strng6 = element6.getText();
   		System.out.printf(strng6);
   		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/ul/li[2]/article[3]/div/div[3]/div[2]/div[2]/div[1]/div/div/strong"));
   		String strng6a = element6a.getText();
   		System.out.printf(strng6a + " |");
   		System.out.println();
   		System.out.println("----------------------------------");

       	driver.quit();
    }    
    
}

