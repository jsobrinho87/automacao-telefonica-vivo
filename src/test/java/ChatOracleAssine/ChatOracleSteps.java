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
     	         	
          WebDriverWait wait2 = new WebDriverWait(driver, 400);
          wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
     	  
          //Verificar atendente disponivel
          WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
          String strng2 = element2.getText();
       	  System.out.printf(strng2);
       	  System.out.println();
       	  System.out.println("---------------------------------------");
       	
          //Inclui resposta ao atendente e fecha o chat
      	  driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
      	  driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
     
          driver.close();
          driver.switchTo().window(winHandleBefore);
     	
     	  driver.quit(); 
    }   
   
//---------------------------------------------// 
// Realiza acesso CHAT ORACLE - G3_FSP_50_GPON //
//---------------------------------------------// 	     
 	     
     @And ("acessa pg home Chat G3")
     public void pgHomeChatG3()  throws InterruptedException {	
          driver.navigate().to("https://assine.vivo.com.br/navegantes_SC");

          WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
          	
      	  if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
     		  driver.navigate().refresh();
      		
     		  WebDriverWait wait2 = new WebDriverWait(driver, 200);
         	  wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
     	  }
     }
     
     @And ("seleciona op Compre pelo chat G3")
     public void acesCtaChatG3() throws InterruptedException { 	
          ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
          Thread.sleep(3000);

          Actions act2=new Actions(driver); 	
     	  act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
     }
     
     @And ("na modal informa btao chat Oracle G3")
     public void selChatOracleG3()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
      	
       	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
     }
     
     @When ("na modal chat informa Cep e numero G3")
     public void modalConsultCoberturaChatG3()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
       	
          driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88372-288");
          driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("155");
          
          driver.findElement(By.className("btn-consult")).click();
          Thread.sleep(10000); 
     }
     
     @And ("modal informa dados de acesso ao chat G3")
     public void dadosAcesChatG3() throws InterruptedException {

//         WebDriverWait wait = new WebDriverWait(driver,200);
//         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

  	       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
  	   
  	       driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
           driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
           driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
         
           WebDriverWait wait2 = new WebDriverWait(driver, 200);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
     	
           driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
         
           driver.switchTo().defaultContent();
     }
     
     @Then ("realiza acesso chat oracle G3")
     public void realizaAcessoChatOracleG3() throws IOException {
  	       System.out.println("----------------------------------------");
      	   System.out.println(" Testando acesso Chat Oracle - B2C (G3) ");
           System.out.println("----------------------------------------");
      	
      	   String winHandleBefore = driver.getWindowHandle();

           for(String winHandle : driver.getWindowHandles()){
              driver.switchTo().window(winHandle);
           }
      	         	
           WebDriverWait wait2 = new WebDriverWait(driver, 400);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
      	  
           //Verificar atendente disponivel
           WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
           String strng2 = element2.getText();
    	   System.out.printf(strng2);
    	   System.out.println();
    	   System.out.println("---------------------------------------");
        	
           //Inclui resposta ao atendente e fecha o chat
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//         driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
      
           driver.close();
           driver.switchTo().window(winHandleBefore);
      	
      	   driver.quit(); 
     }       

//------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G2_FSP_3P_50_vdsl //
//------------------------------------------------// 	     
     
   @And ("acessa pg de home Chat G2")
   public void pagHomeChatG2()  throws InterruptedException {	
        driver.navigate().to("https://assine.vivo.com.br/brusque_SC");

        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
        	
   	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
   		driver.navigate().refresh();
    		
   		WebDriverWait wait2 = new WebDriverWait(driver, 200);
       	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
   	}
   }
   
   @And ("seleciona opcao Compre pelo chat G2")
   public void acesCtaChatG2() throws InterruptedException { 	
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
   	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
   }
   
   @And ("na modal informa btao chat Oracle G2")
   public void seleChatOracleG2()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
    	
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
   }
   
   @When ("na modal chat informa Cep e numero G2")
   public void modalConsultCoberturaChatG2()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
     	
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88350-360");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("70");
        
        driver.findElement(By.className("btn-consult")).click();
        Thread.sleep(10000); 
   }
   
   @And ("modal informa dados de acesso ao chat G2")
   public void dadosAcesChatG2() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
	   
	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
         driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
         driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
       
         WebDriverWait wait2 = new WebDriverWait(driver, 200);
         wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
   	
         driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
       
         driver.switchTo().defaultContent();
   }
   
   @Then ("realiza acesso chat oracle G2")
   public void realizaAcessoChatOracleG2() throws IOException {
	     System.out.println("----------------------------------------");
    	 System.out.println(" Testando acesso Chat Oracle - B2C (G2) ");
         System.out.println("----------------------------------------");
    	
    	 String winHandleBefore = driver.getWindowHandle();

         for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
         }
    	         	
         WebDriverWait wait2 = new WebDriverWait(driver, 400);
         wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
    	  
         //Verificar atendente disponivel
         WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
         String strng2 = element2.getText();
  	     System.out.printf(strng2);
  	     System.out.println();
  	     System.out.println("---------------------------------------");
      	
         //Inclui resposta ao atendente e fecha o chat
     	 driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
     	 driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//       driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
    
         driver.close();
         driver.switchTo().window(winHandleBefore);
    	
    	 driver.quit(); 
   }            

//------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G4_FSP_2P_15_vdsl //
//------------------------------------------------// 	     
 	     
     @And ("acessa pg home Chat G4")
     public void pgHomeChatG4()  throws InterruptedException {	
          driver.navigate().to("https://assine.vivo.com.br/rondonopolis_MT");

          WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
          	
      	  if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
     		  driver.navigate().refresh();
      		
     		  WebDriverWait wait2 = new WebDriverWait(driver, 200);
         	  wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
     	  }
     }
     
     @And ("seleciona op Compre pelo chat G4")
     public void acesCtaChatG4() throws InterruptedException { 	
          ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
          Thread.sleep(3000);

          Actions act2=new Actions(driver); 	
     	  act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
     }
     
     @And ("na modal informa btao chat Oracle G4")
     public void selChatOracleG4()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
      	
       	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
     }
     
     @When ("na modal chat informa Cep e numero G4")
     public void modalConsultCoberturaChatG4()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
       	
          driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("78710-720");
          driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("645");
          
          driver.findElement(By.className("btn-consult")).click();
          Thread.sleep(15000); 
     }
     
     @And ("modal informa dados de acesso ao chat G4")
     public void dadosAcesChatG4() throws InterruptedException {

//         WebDriverWait wait = new WebDriverWait(driver,200);
//         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

  	       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
  	   
  	       driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
           driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
           driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
         
           WebDriverWait wait2 = new WebDriverWait(driver, 200);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
     	
           driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
         
           driver.switchTo().defaultContent();
     }
     
     @Then ("realiza acesso chat oracle G4")
     public void realizaAcessoChatOracleG4() throws IOException {
  	       System.out.println("----------------------------------------");
      	   System.out.println(" Testando acesso Chat Oracle - B2C (G4) ");
           System.out.println("----------------------------------------");
      	
      	   String winHandleBefore = driver.getWindowHandle();

           for(String winHandle : driver.getWindowHandles()){
              driver.switchTo().window(winHandle);
           }
      	         	
           WebDriverWait wait2 = new WebDriverWait(driver, 400);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
      	  
           //Verificar atendente disponivel
           WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
           String strng2 = element2.getText();
    	   System.out.printf(strng2);
    	   System.out.println();
    	   System.out.println("---------------------------------------");
        	
           //Inclui resposta ao atendente e fecha o chat
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//         driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
      
           driver.close();
           driver.switchTo().window(winHandleBefore);
      	
      	   driver.quit(); 
     }          

//-----------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G5_FSP_3P_50_vdsl_plus //
//-----------------------------------------------------// 	     
       
     @And ("acessa pg home Chat G5")
     public void pgHomeChatG5()  throws InterruptedException {	
          driver.navigate().to("https://assine.vivo.com.br/curitiba_PR");

          WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
          	
     	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
     		driver.navigate().refresh();
      		
     		WebDriverWait wait2 = new WebDriverWait(driver, 200);
         	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
     	}
     }
     
     @And ("seleciona op Compre pelo chat G5")
     public void aceCtaChatG5() throws InterruptedException { 	
          ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
          Thread.sleep(3000);

          Actions act2=new Actions(driver); 	
     	  act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
     }
     
     @And ("na modal informa btao chat Oracle G5")
     public void seleChatOracleG5()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
      	
          driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
     }
     
     @When ("na modal chat informa Cep e numero G5")
     public void modalConsultCoberturaChatG5()  throws InterruptedException {
  	      WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
       	
          driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82920-100");
          driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("697");
          
          driver.findElement(By.className("btn-consult")).click();
          Thread.sleep(10000); 
     }
     
     @And ("modal informa dados de acesso ao chat G5")
     public void dadosAcesChatG5() throws InterruptedException {

//         WebDriverWait wait = new WebDriverWait(driver,200);
//         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

  	       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
  	   
  	       driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
           driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
           driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
         
           WebDriverWait wait2 = new WebDriverWait(driver, 200);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
     	
           driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
         
           driver.switchTo().defaultContent();
     }
     
     @Then ("realiza acesso chat oracle G5")
     public void realizaAcessoChatOracleG5() throws IOException {
  	       System.out.println("----------------------------------------");
           System.out.println(" Testando acesso Chat Oracle - B2C (G5) ");
           System.out.println("----------------------------------------");
      	
      	   String winHandleBefore = driver.getWindowHandle();

           for(String winHandle : driver.getWindowHandles()){
              driver.switchTo().window(winHandle);
           }
      	         	
           WebDriverWait wait2 = new WebDriverWait(driver, 400);
           wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
      	  
           //Verificar atendente disponivel
           WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
           String strng2 = element2.getText();
    	     System.out.printf(strng2);
    	     System.out.println();
    	     System.out.println("---------------------------------------");
        	
           //Inclui resposta ao atendente e fecha o chat
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
       	   driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//         driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
      
           driver.close();
           driver.switchTo().window(winHandleBefore);
      	
      	 driver.quit(); 
     }     

//------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G6_SP_3P_100_gpon //
//------------------------------------------------// 	     
         
       @And ("acessa pg home Chat G6")
       public void pgHomeChatG6()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/sao-paulo_SP");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat G6")
       public void aceCtaChatG6() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
       }
       
       @And ("na modal informa btao chat Oracle G6")
       public void seleChatOracleG6()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("na modal chat informa Cep e numero G6")
       public void modalConsultCoberturaChatG6()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("01510-001");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("729"); 
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados de acesso ao chat G6")
       public void dadosAcesChatG6() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso chat oracle G6")
       public void realizaAcessoChatOracleG6() throws IOException {
    	     System.out.println("----------------------------------------");
             System.out.println(" Testando acesso Chat Oracle - B2C (G6) ");
             System.out.println("----------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 400);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//           driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }          
 
//------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G7_SP_3P_50_vdsl  //
//------------------------------------------------// 	     
         
       @And ("acessa pg home Chat G7")
       public void pgHomeChatG7()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/aruja_SP");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat G7")
       public void aceCtaChatG7() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
       }
       
       @And ("na modal informa btao chat Oracle G7")
       public void seleChatOracleG7()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("na modal chat informa Cep e numero G7")
       public void modalConsultCoberturaChatG7()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("07400-000");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("630"); 
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados de acesso ao chat G7")
       public void dadosAcesChatG7() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso chat oracle G7")
       public void realizaAcessoChatOracleG7() throws IOException {
    	     System.out.println("----------------------------------------");
             System.out.println(" Testando acesso Chat Oracle - B2C (G7) ");
             System.out.println("----------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 400);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//               driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }          

//--------------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G9_FSP_3P_gpon_lançamento //
//--------------------------------------------------------// 	     
         
       @And ("acessa pg home Chat G9")
       public void pgHomeChatG9()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/teresina_PI");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat G9")
       public void aceCtaChatG9() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
       }
       
       @And ("na modal informa btao chat Oracle G9")
       public void seleChatOracleG9()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("na modal chat informa Cep e numero G9")
       public void modalConsultCoberturaChatG9()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("64001-020");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1860");
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados de acesso ao chat G9")
       public void dadosAcesChatG9() throws InterruptedException {

//               WebDriverWait wait = new WebDriverWait(driver,200);
//               wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso chat oracle G9")
       public void realizaAcessoChatOracleG9() throws IOException {
    	     System.out.println("----------------------------------------");
             System.out.println(" Testando acesso Chat Oracle - B2C (G9) ");
             System.out.println("----------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 400);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//                   driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }                 
     
//--------------------------------------------------// 
// Realiza acesso CHAT ORACLE - G10_FSP_3P_100_GPON //
//--------------------------------------------------// 	     
         
       @And ("acessa pg home Chat G10")
       public void pgHomeChatG10()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/garanhuns_PE");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat G10")
       public void aceCtaChatG10() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
       }
       
       @And ("modal informa btao chat Oracle G10")
       public void selChatOracleG10()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("modal chat informa Cep e numero G10")
       public void modalConsulCoberturaChatG10()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("55292-515");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("269");
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados de acesso chat G10")
       public void dadosAceChatG10() throws InterruptedException {

//                   WebDriverWait wait = new WebDriverWait(driver,200);
//                   wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso no chat oracle G10")
       public void realizaAceChatOracleG10() throws IOException {
    	     System.out.println("---------------------------------------");
             System.out.println("Testando acesso Chat Oracle - B2C (G10)");
             System.out.println("---------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 400);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//                       driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }              

//-------------------------------------// 
// Realiza acesso CHAT ORACLE - OFFNET //
//-------------------------------------// 	     
         
       @And ("acessa pg home Chat OFFNET")
       public void pgHomeChatOFFNET()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/erechim_RS");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat OFFNET")
       public void aceCtaChatOFFNET() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
       }
       
       @And ("modal informa btao chat Oracle OFFNET")
       public void selChatOracleOFFNET()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("modal chat informa Cep e numero OFFNET")
       public void modalConsulCobertChatOFFNET()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("99700-532");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("640");
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados de acesso chat OFFNET")
       public void dadosAceChatOFFNET() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso no chat oracle OFFNET")
       public void realizaAceChatOracleOFFNET() throws IOException {
    	     System.out.println("------------------------------------------");
             System.out.println("Testando acesso Chat Oracle - B2C (OFFNET)");
             System.out.println("------------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 400);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//                           driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }  
       
//-----------------------------------------// 
// Realiza acesso CHAT ORACLE - Massivo SP //
//-----------------------------------------// 	     
         
       @And ("acessa pg home Chat Massivo")
       public void pgHomeChatMassivo()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/aguai_SP");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat Massivo")
       public void aceCtaChatMassivo() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
       }
       
       @And ("modal informa btao chat Oracle Massivo")
       public void seleChatOracleMassivo()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("modal chat informa Cep e numero Massivo")
       public void modalCobertChatMassivo()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("13860-000");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("868");
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados acesso chat Massivo")
       public void dadosAceChatMassivo() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso chat oracle Massivo")
       public void acessoChatOracleMassivo() throws IOException {
    	     System.out.println("-------------------------------------------");
             System.out.println("Testando acesso Chat Oracle - B2C (Massivo)");
             System.out.println("-------------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 500);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//           driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }                 
  
//-----------------------------------------// 
// Realiza acesso CHAT ORACLE - Defaut SP //
//-----------------------------------------// 	     
         
       @And ("acessa pg home Chat Defaut")
       public void pgHomeChatDefaut()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/bocaina_SP");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
	       	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat Defaut")
       public void aceCtaChatDefaut() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
       }
       
       @And ("modal informa btao chat Oracle Defaut")
       public void seleChatOracleDefaut()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("modal chat informa Cep e numero Defaut")
       public void modalCobertChatDefaut()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("17240-000");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("474");
            
            driver.findElement(By.className("btn-consult")).click();
            Thread.sleep(10000); 
       }
       
       @And ("modal informa dados acesso chat Defaut")
       public void dadosAceChatDefaut() throws InterruptedException {

//           WebDriverWait wait = new WebDriverWait(driver,200);
//           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe"))));

    	     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mCSB_17_container\"]/div/chat-oracle-b2c/section/iframe")));
    	   
    	     driver.findElement(By.xpath("html/body/div//div//form/div[2]//input")).sendKeys("Robo Testando Assine Vivo");
             driver.findElement(By.xpath("html/body/div//div//form/div[4]//input")).sendKeys("4125256363");
             driver.findElement(By.xpath("html/body/div//div//form/div[5]//input")).sendKeys("jonathan.teste@telefonca.com");
           
             WebDriverWait wait2 = new WebDriverWait(driver, 200);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div//div//form/div[7]//input"))));
       	
             driver.findElement(By.xpath("html/body/div//div//form/div[7]//input")).click();
           
             driver.switchTo().defaultContent();
       }
       
       @Then ("realiza acesso chat oracle Defaut")
       public void acessoChatOracleDefaut() throws IOException {
    	     System.out.println("-------------------------------------------");
             System.out.println("Testando acesso Chat Oracle - B2C (Massivo)");
             System.out.println("-------------------------------------------");
        	
        	 String winHandleBefore = driver.getWindowHandle();

             for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 500);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("chat-status-connected"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_Roster\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//           driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }             
  
//-------------------------------------------// 
// Realiza acesso CHAT ORACLE - Onnet_sem_tv //
//-------------------------------------------//	     
         
       @And ("acessa pg home Chat Sem tv")
       public void pgHomeChatSemtv()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/cuiaba_MT/empresas/pequenas-e-medias");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wrap-vivo")));
            	
	       	if (driver.findElements(By.className("wrap-vivo")).size() != 0) { 
	       		driver.navigate().refresh();
	        		
	       		WebDriverWait wait2 = new WebDriverWait(driver, 200);
	           	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
	       	}
       }
       
       @And ("seleciona op Compre pelo chat Sem tv")
       public void aceCtaChatSemtv() throws InterruptedException { 	
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
       }
       
       @And ("modal informa btao chat Oracle Sem tv")
       public void seleChatOracleSemtv()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div/div[1]/h2/strong"), "O que você deseja?"));
        	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div/div[3]/div/div/div/atom-button[2]/a")).click();
       }
       
       @When ("modal chat informa Cep e numero Sem tv")
       public void modalCobertChatSemtv()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2"), "Compre pelo Chat"));
         	
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robo Testando Assine Vivo");   
    	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
    	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[3]/input")).sendKeys("jonathan.teste@telefonca.com");
    	   	
            driver.findElement(By.className("btn-consult")).click();
            driver.switchTo().defaultContent();
       }
           
       @Then ("realiza acesso chat oracle Sem tv")
       public void acessoChatOracleSemtv() throws IOException {
    	     System.out.println("------------------------------------------------");
             System.out.println("Testando acesso Chat Oracle - B2C (Onnet_sem_tv)");
             System.out.println("------------------------------------------------");
        	
//        	 String winHandleBefore = driver.getWindowHandle();
//
//             for(String winHandle : driver.getWindowHandles()){
//                driver.switchTo().window(winHandle);
//             }
        	         	
             WebDriverWait wait2 = new WebDriverWait(driver, 500);
             wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("rn_ChatTranscriptView_12"))));
        	  
             //Verificar atendente disponivel
             WebElement element2 = driver.findElement(By.xpath("//*[@id=\"rn_ChatAgentStatusAnimation_6_AgentStatus_1299602\"]"));
             String strng2 = element2.getText();
      	     System.out.printf(strng2);
      	     System.out.println();
      	     System.out.println("---------------------------------------");
          	
             //Inclui resposta ao atendente e fecha o chat
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
             driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//               driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
             driver.close();
//             driver.switchTo().window(winHandleBefore);
        	
        	 driver.quit(); 
       }              
       
}
 

