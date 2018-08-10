package ChatOracleAssine;

import cucumber.api.java.en.Given;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChatOracleSteps {
	
	static WebDriver _driver;
	
	ExtentReports report;
	ExtentTest    logger;
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador home chat")
    public void paginaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize(); 
    }
    
//-----//
// B2C //
//-----//    
//------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G1_FSP_3P_15_vdsl //
//------------------------------------------------// 	     
	     
    @And ("acessa pg de home Chat G1")
    public void paginaHomeChatG1()  throws InterruptedException {	
         driver.navigate().to("https://assine.vivo.com.br/apucarana_PR");

         WebDriverWait wait = new WebDriverWait(driver, 200);
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
         	
    	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
    		driver.navigate().refresh();
     		
    		WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
    	}
    }
    
    @And ("seleciona opcao Compre pelo chat G1")
    public void acessarCtaChatG1() throws InterruptedException { 	
         ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       	 Thread.sleep(3000);

         Actions act2=new Actions(driver); 	
    	 act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    @And ("na modal informa btao chat Oracle G1")
    public void selecionaChatOracleG1()  throws InterruptedException {
 	     WebDriverWait wait = new WebDriverWait(driver, 200);
         wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
     	
      	 driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
    }
    
    @When ("na modal chat informa Cep e numero G1")
    public void modalConsultaCoberturaChatG1()  throws InterruptedException {
 	     WebDriverWait wait = new WebDriverWait(driver, 200);
         wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
      	
       	 driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("86800-620");
         driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("36"); 
         
         driver.findElement(By.className("btn-consult")).click();
         Thread.sleep(10000); 
    }
    
    @And ("modal informa dados de acesso ao chat G1")
    public void dadosAcessoChatG1() throws InterruptedException {

//     	  WebDriverWait wait = new WebDriverWait(driver,200);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

 	      driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
 	   
 	      driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
          driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
          driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
        
          WebDriverWait wait2 = new WebDriverWait(driver, 200);
          wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
    	
          driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
        
          driver.switchTo().defaultContent();
    }
    
    @Then ("realiza acesso chat oracle G1")
    public void realizaAcessoChatOracleG1() throws IOException {
 	      System.out.println("----------------------------------------");
     	  System.out.println(" Testando acesso Chat Oracle - B2C (G1) ");
          System.out.println("----------------------------------------");
     	
     	  String winHandleBefore = driver.getWindowHandle();

          for(String winHandle : driver.getWindowHandles()){
             driver.switchTo().window(winHandle);
          }
     	         	
     	  WebDriverWait wait2 = new WebDriverWait(driver, 300);
          wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("rn_ChatTranscriptFraseologiaEncerramiento_8_Transcript"))));
     	         	
     	  WebElement element2 = driver.findElement(By.xpath("//*[@id=\"chat-status\"]"));
       	  String strng2 = element2.getText();
       	  System.out.printf("Atendente: "+ strng2);
       	  System.out.println();
       	  System.out.println("----------------------------------------");
    	
     	  driver.findElement(By.id("rn_ChatTimeoutDisconnector_10_Input")).sendKeys("Olá! Esse é um teste automático, estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
     	  driver.findElement(By.id("rn_ChatTimeoutDisconnector_10_Input")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
     
          driver.close();
          driver.switchTo().window(winHandleBefore);
     	
     	  driver.quit(); 
    }   
   
}
 

