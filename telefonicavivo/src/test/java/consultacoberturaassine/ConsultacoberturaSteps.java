package consultacoberturaassine;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ConsultacoberturaSteps {
	
	ExtentReports report;
	ExtentTest    logger;
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador cobertura")
    public void paginaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	
        report = new ExtentReports("C:\\Users\\80479178\\Downloads\\Release\\ReportConsultaCobertura.html"); 
    	logger = report.startTest("Valida Consulta Cobertura");
        
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 
    }
    
//-----//
// B2C //
//-----//    

//----------------------------------------//
// Consulta Cobertura - G1_FSP_3P_15_vdsl //
//----------------------------------------// 	     
 	     
    @And ("acessa pg de cobertura G1")
    public void paginaCoberturaG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/apucarana_PR");
    	
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    	
    	logger.log(LogStatus.INFO, "Carrega página grupo G1_FSP_3P_15_vdsl");
    }
    
    @And ("seleciona opcao de combo G1")
    public void acessarMenuCoberturaG1() throws InterruptedException { 	
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    	
    	logger.log(LogStatus.INFO, "Carrega modal Consulta Cobertura");
    }
    
    @When ("na modal de consulta cobertura G1")
    public void consultaCoberturaG1()  throws InterruptedException {
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Armindo Monteiros Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("86800-620");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("36");
        
    }
    
    @And ("seleciona botao consultar G1")
    public void consultaG1() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("valida retorno de sucesso ou erro G1")
    public void retornoSucessoouErroG1() throws InterruptedException {   	
      	System.out.println("----------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G1_FSP_3P_15_vdsl)");
      	System.out.println("----------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("----------------------------------------------");
    
      	logger.log(LogStatus.PASS, "G1_FSP_3P_15_vdsl");
      	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
//      report.endTest(logger);
      	report.flush();
      	
//    	driver.quit();
    	
    }
    
//----------------------------------------//
// Consulta Cobertura - G2_FSP_3P_50_vdsl //
//----------------------------------------// 	     
  	     
     @And ("acessa pg de cobertura G2")
     public void paginaCobertG2()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/Brusque_SC");
     	
     	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
     	Thread.sleep(3000);
     }
     
     @And ("seleciona opcao de combo G2")
     public void acessarMenuCoberturaG2() throws InterruptedException { 	
     	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
     	Thread.sleep(3000);
     }
     
     @When ("na modal de consulta cobertura G2")
     public void consultaCoberturaG2()  throws IOException {
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("João da Silva Testando");   
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88350-360");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("70");
         
     }
     
     @And ("seleciona botao consultar G2")
     public void consultaG2() throws InterruptedException {
     	driver.findElement(By.className("btn-consult")).click();
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	Thread.sleep(3000);
     	
     	WebDriverWait wait = new WebDriverWait(driver, 30);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
     }
     
     @Then ("valida retorno de sucesso ou erro G2")
     public void retornoSucessoouErroG2() throws IOException {
        System.out.println("----------------------------------------------");
       	System.out.println("B2C - Consulta Cobertura - (G2_FSP_3P_50_vdsl)");
       	System.out.println("----------------------------------------------");
       	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("----------------------------------------------");
      	
      	logger.log(LogStatus.PASS, "G2_FSP_3P_50_vdsl");
//      	report.endTest(logger);
//      	report.flush();
//      	 
//      	driver.get("C:\\Users\\80479178\\Downloads\\Release\\advanceReport.html");
      	
    	driver.quit();
     	
     }    
     
//----------------------------------------//
// Consulta Cobertura - G3_FSP_50_GPON    //
//----------------------------------------// 	     
   	     
      @And ("acessa pg de cobertura G3")
      public void paginaCoberturaG3()  throws InterruptedException {	
      	driver.navigate().to("https://assine.vivo.com.br/navegantes_SC");
      	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
      	Thread.sleep(3000);
      }
      
      @And ("seleciona opcao de combo G3")
      public void acessarMenuCoberturaG3() throws InterruptedException { 	
      	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
      	Thread.sleep(1000);
      	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
      	Thread.sleep(3000);
      }
      
      @When ("na modal de consulta cobertura G3")
      public void consultaCoberturaG3()  throws IOException {
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Marcio Neto Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88372-602");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("69");
          
      }
      
      @And ("seleciona botao consultar G3")
      public void consultaG3() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	Thread.sleep(3000);
      	
      	WebDriverWait wait = new WebDriverWait(driver, 30);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
      }
      
      @Then ("valida retorno de sucesso ou erro G3")
      public void retornoSucessoouErroG3() throws IOException {
        	System.out.println("-------------------------------------------");
        	System.out.println("B2C - Consulta Cobertura - (G3_FSP_50_GPON)");
        	System.out.println("-------------------------------------------");
        	     	    	
          	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
          	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//          String strng2 = element2.getText();
          	System.out.printf("Resultado: "+ driver.getTitle());
          	System.out.println();
          	System.out.println("-------------------------------------------");
        	driver.quit();    	
      }
//----------------------------------------//
// Consulta Cobertura - G4_FSP_2P_15_vdsl //
//----------------------------------------// 	     
    	     
       @And ("acessa pg de cobertura G4")
       public void paginaCoberturaG4()  throws InterruptedException {	
        	driver.navigate().to("https://assine.vivo.com.br/rondonopolis_MT");
        	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
         	Thread.sleep(3000);
       }
       
       @And ("seleciona opcao de combo G4")
       public void acessarMenuCoberturaG4() throws InterruptedException { 	
        	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[5]/a")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[5]/ul/li[3]/a")).click();
        	Thread.sleep(3000);
       }
       
       @When ("na modal de consulta cobertura G4")
       public void consultaCoberturaG4()  throws IOException {
         	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Carlos Monteiros Testando");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("78710-720");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("645");
            
       }
       
       @And ("seleciona botao consultar G4")
       public void consultaG4() throws InterruptedException {
         	driver.findElement(By.className("btn-consult")).click();
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	Thread.sleep(3000);
       	
        	WebDriverWait wait = new WebDriverWait(driver, 30);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
       }
       
       @Then ("valida retorno de sucesso ou erro G4")
       public void retornoSucessoouErroG4() throws IOException {
         	System.out.println("----------------------------------------------");
         	System.out.println("B2C - Consulta Cobertura - (G4_FSP_2P_15_vdsl)");
         	System.out.println("----------------------------------------------");
         	     	    	
          	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
          	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//          String strng2 = element2.getText();
          	System.out.printf("Resultado: "+ driver.getTitle());
          	System.out.println();
          	System.out.println("----------------------------------------------");
        	driver.quit();
       	
       }    
       
//---------------------------------------------//
// Consulta Cobertura - G5_FSP_3P_50_vdsl_plus //
//---------------------------------------------// 	     
 	     
    @And ("acessa pg de cobertura G5")
    public void paginaCoberturaG5()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR");
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    }
    
    @And ("seleciona opcao de combo G5")
    public void acessarMenuCoberturaG5() throws InterruptedException { 	
      	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
      	Thread.sleep(1000);
      	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
      	Thread.sleep(3000);
    }
    
    @When ("na modal de consulta cobertura G5")
    public void consultaCoberturaG5()  throws IOException {
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Santos Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82920-100");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("697");
        
    }
    
    @And ("seleciona botao consultar G5")
    public void consultaG5() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @Then ("valida retorno de sucesso ou erro G5")
    public void retornoSucessoouErroG5() throws IOException {
    	System.out.println("---------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G5_FSP_3P_50_vdsl_plus)");
      	System.out.println("---------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("---------------------------------------------------");
    	driver.quit();
    	
    }   
    
//----------------------------------------//
//Consulta Cobertura - G6_SP_3P_100_gpon  //
//----------------------------------------// 	     
 	     
    @And ("acessa pg de cobertura G6")
    public void paginaCoberturaG6()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/sao-paulo_SP");
     	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
      	Thread.sleep(3000);
    }
    
    @And ("seleciona opcao de combo G6")
    public void acessarMenuCoberturaG6() throws InterruptedException { 	
     	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
     	Thread.sleep(3000);
    }
    
    @When ("na modal de consulta cobertura G6")
    public void consultaCoberturaG6()  throws IOException {
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Maria Santos Testando");   
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("01510-001");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("729");
         
    }
    
    @And ("seleciona botao consultar G6")
    public void consultaG6() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	Thread.sleep(3000);
    	
     	WebDriverWait wait = new WebDriverWait(driver, 30);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
    }
    
    @Then ("valida retorno de sucesso ou erro G6")
    public void retornoSucessoouErroG6() throws IOException {
    	System.out.println("----------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G6_SP_3P_100_gpon)");
      	System.out.println("----------------------------------------------");
      	     	    	
   	    WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
    	assertTrue(element2.getText().contains("Monte sua oferta"));

//    	String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ driver.getTitle());
    	System.out.println();
    	System.out.println("----------------------------------------------");
    	driver.quit();
    	
    }   

//----------------------------------------//
//Consulta Cobertura - G7_SP_3P_50_vdsl   //
//----------------------------------------// 	     
   	     
      @And ("acessa pg de cobertura G7")
      public void paginaCoberturaG7()  throws InterruptedException {	
       	    driver.navigate().to("https://assine.vivo.com.br/aruja_SP");
        	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        	Thread.sleep(3000);
      }
      
      @And ("seleciona opcao de combo G7")
      public void acessarMenuCoberturaG7() throws InterruptedException { 	
        	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.className("sublevel-link"));
        	Thread.sleep(3000);
      }
      
      @When ("na modal de consulta cobertura G7")
      public void consultaCoberturaG7()  throws InterruptedException {
      	    driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robson Vieira Testando");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("07402-120");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("27");
           
      }
      
      @And ("seleciona botao consultar G7")
      public void consultaG7() throws InterruptedException {
        	driver.findElement(By.className("btn-consult")).click();
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	Thread.sleep(3000);
      	
        	WebDriverWait wait = new WebDriverWait(driver, 30);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
      }
      
      @Then ("valida retorno de sucesso ou erro G7")
      public void retornoSucessoouErroG7() throws IOException {
        	System.out.println("---------------------------------------------");
        	System.out.println("B2C - Consulta Cobertura - (G7_SP_3P_50_vdsl)");
        	System.out.println("---------------------------------------------");
        	     	    	
       	    WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
        	assertTrue(element2.getText().contains("Monte sua oferta"));

//        	String strng2 = element2.getText();
        	System.out.printf("Resultado: "+ driver.getTitle());
        	System.out.println();
        	System.out.println("---------------------------------------------");
        	driver.quit(); 	
      }   

//-----------------------------------------------//
//Consulta Cobertura - G9_FSP_3P_gpon_lançamento //
//-----------------------------------------------// 	     
 	     
    @And ("acessa pg de cobertura G9")
    public void paginaCoberturaG9()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/teresina_PI");
      	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
      	Thread.sleep(3000);
    }
    
    @And ("seleciona opcao de combo G9")
    public void acessarMenuCoberturaG9() throws InterruptedException { 	
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    }
    
    @When ("na modal de consulta cobertura G9")
    public void consultaCoberturaG9()  throws InterruptedException {
    	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robson Vieira Testando");   
      	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
          driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("64001-020");
          driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1860");
         
    }
    
    @And ("seleciona botao consultar G9")
    public void consultaG9() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	Thread.sleep(3000);
    	
      	WebDriverWait wait = new WebDriverWait(driver, 30);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @Then ("valida retorno de sucesso ou erro G9")
    public void retornoSucessoouErroG9() throws IOException {
      	System.out.println("------------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G9_FSP_3P_gpon_lancamento)");
      	System.out.println("------------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("------------------------------------------------------");
      	driver.quit();		  	 
}
    
//------------------------------------------//
//Consulta Cobertura - G10_FSP_3P_100_GPON  //
//------------------------------------------// 	     
 	     
    @And ("acessa pg grupo G10")
    public void pgCoberturaG10()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/garanhuns_PE");
      	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
      	Thread.sleep(3000);
    }
    
    @And ("seleciona opcao combo G10")
    public void acessarMenuCoberturaG10() throws InterruptedException { 	
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    }
    
    @When ("na modal consulta cobertura G10")
    public void consultaCoberturaG10()  throws InterruptedException {
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Fernando Santos Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("55292-515");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("269");
         
    }
    
    @And ("seleciona botao consulta G10")
    public void consultaG10() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	Thread.sleep(3000);
    	
      	WebDriverWait wait = new WebDriverWait(driver, 30);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @Then ("valida retorno sucesso ou erro G10")
    public void retornoSucessoouErroG10() throws IOException {
      	System.out.println("------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G10_FSP_3P_100_GPON)");
      	System.out.println("------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("------------------------------------------------");
      	driver.quit();
    	
    }   
}
