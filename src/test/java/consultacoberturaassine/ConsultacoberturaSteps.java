package consultacoberturaassine;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                // 
//----------------------------------------------------//
	
    @Given ("abre pg do navegador cobertura")
    public void paginaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
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
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    	
    }
    
    @And ("seleciona opcao de combo G1")
    public void acessarMenuCoberturaG1() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
     	Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
   	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura G1")
    public void consultaCoberturaG1()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Armindo Monteiros Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("86800-620");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("36");
    }
    
    @And ("seleciona botao consultar G1")
    public void consultaG1() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("valida retorno de sucesso ou erro G1")
    public void retornoSucessoouErroG1() throws InterruptedException {   	
      	System.out.println("----------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G1_FSP_3P_15_vdsl)");
      	System.out.println("----------------------------------------------");
      	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("----------------------------------------------");
          	
     	driver.quit();
    }
    
//----------------------------------------//
// Consulta Cobertura - G2_FSP_3P_50_vdsl //
//----------------------------------------// 	     
  	     
     @And ("acessa pg de cobertura G2")
     public void paginaCobertG2()  throws InterruptedException {
     	driver.get("https://assine.vivo.com.br/brusque_SC");
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
     }
     
     @And ("seleciona opcao de combo G2")
     public void acessarMenuCoberturaG2() throws InterruptedException {
    	 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
      	 Thread.sleep(3000);

         Actions act2=new Actions(driver); 	
    	 act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
     }
     
     @When ("na modal de consulta cobertura G2")
     public void consultaCoberturaG2()  throws IOException {
    	 WebDriverWait wait = new WebDriverWait(driver, 200);
     	 wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
     	
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
      	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("----------------------------------------------");
      	
    	driver.quit();
     }    
     
//-------------------------------------//
// Consulta Cobertura - G3_FSP_50_GPON //
//-------------------------------------// 	     
   	     
      @And ("acessa pg de cobertura G3")
      public void paginaCoberturaG3()  throws InterruptedException {	
      	driver.navigate().to("https://assine.vivo.com.br/navegantes_SC");
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
      }
      
      @And ("seleciona opcao de combo G3")
      public void acessarMenuCoberturaG3() throws InterruptedException {
    	 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       	 Thread.sleep(3000);

         Actions act2=new Actions(driver); 	
     	 act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
      }
      
      @When ("na modal de consulta cobertura G3")
      public void consultaCoberturaG3()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
      	
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Marcio Neto Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88372-288");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("155");
          
      }
      
      @And ("seleciona botao consultar G3")
      public void consultaG3() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
      }
      
      @Then ("valida retorno de sucesso ou erro G3")
      public void retornoSucessoouErroG3() throws IOException {
        	System.out.println("-------------------------------------------");
        	System.out.println("B2C - Consulta Cobertura - (G3_FSP_50_GPON)");
        	System.out.println("-------------------------------------------");
        	     	    	
          	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
          	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

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
        	
        	WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
       }
       
       @And ("seleciona opcao de combo G4")
       public void acessarMenuCoberturaG4() throws InterruptedException { 	
    	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
           Thread.sleep(3000);

           Actions act2=new Actions(driver); 	
       	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
       }
       
       @When ("na modal de consulta cobertura G4")
       public void consultaCoberturaG4()  throws IOException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    	    
         	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Carlos Monteiros Testando");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("78710-720");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("645");
            
       }
       
       @And ("seleciona botao consultar G4")
       public void consultaG4() throws InterruptedException {
         	driver.findElement(By.className("btn-consult")).click();
       	
        	WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
       }
       
       @Then ("valida retorno de sucesso ou erro G4")
       public void retornoSucessoouErroG4() throws IOException {
         	System.out.println("----------------------------------------------");
         	System.out.println("B2C - Consulta Cobertura - (G4_FSP_2P_15_vdsl)");
         	System.out.println("----------------------------------------------");
         	     	    	
          	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
          	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

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
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao de combo G5")
    public void acessarMenuCoberturaG5() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
    	act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura G5")
    public void consultaCoberturaG5()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Santos Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82920-100");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("697");
    }
    
    @And ("seleciona botao consultar G5")
    public void consultaG5() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @Then ("valida retorno de sucesso ou erro G5")
    public void retornoSucessoouErroG5() throws IOException {
    	System.out.println("---------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G5_FSP_3P_50_vdsl_plus)");
      	System.out.println("---------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

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
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao de combo G6")
    public void acessarMenuCoberturaG6() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
    	act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura G6")
    public void consultaCoberturaG6()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Maria Santos Testando");   
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("01510-001");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("729");
    }
    
    @And ("seleciona botao consultar G6")
    public void consultaG6() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
     	    	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
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

            WebDriverWait wait = new WebDriverWait(driver, 200);
     	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
      }
      
      @And ("seleciona opcao de combo G7")
      public void acessarMenuCoberturaG7() throws InterruptedException { 	
    	    ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
            Thread.sleep(3000);

            Actions act2=new Actions(driver);
            act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
      }
      
      @When ("na modal de consulta cobertura G7")
      public void consultaCoberturaG7()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
      	
      	    driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robson Vieira Testando");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("07402-120");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("27");
           
      }
      
      @And ("seleciona botao consultar G7")
      public void consultaG7() throws InterruptedException {
        	driver.findElement(By.className("btn-consult")).click();
      	
        	WebDriverWait wait = new WebDriverWait(driver, 200);
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
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao de combo G9")
    public void acessarMenuCoberturaG9() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
        act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura G9")
    public void consultaCoberturaG9()  throws InterruptedException {
    	  WebDriverWait wait = new WebDriverWait(driver, 200);
          wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
  	
    	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Robson Vieira Testando");   
      	  driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
          driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("64001-020");
          driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1860");
         
    }
    
    @And ("seleciona botao consultar G9")
    public void consultaG9() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	    	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
    }
    
    @Then ("valida retorno de sucesso ou erro G9")
    public void retornoSucessoouErroG9() throws IOException {
      	System.out.println("------------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G9_FSP_3P_gpon_lancamento)");
      	System.out.println("------------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
      	assertTrue(element2.getText().contains("Monte sua oferta"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("------------------------------------------------------");
      	driver.quit();		  	 
}
    
//------------------------------------------//
// Consulta Cobertura - G10_FSP_3P_100_GPON //
//------------------------------------------//
 	     
    @And ("acessa pg grupo G10")
    public void pgCoberturaG10()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/garanhuns_PE");
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao combo G10")
    public void acessarMenuCoberturaG10() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
        act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
    }
    
    @When ("na modal consulta cobertura G10")
    public void consultaCoberturaG10()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Fernando Santos Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("55292-515");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("269");
         
    }
    
    @And ("seleciona botao consulta G10")
    public void consultaG10() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	    	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
    }
    
    @Then ("valida retorno sucesso ou erro G10")
    public void retornoSucessoouErroG10() throws IOException {
      	System.out.println("------------------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (G10_FSP_3P_100_GPON)");
      	System.out.println("------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
      	assertTrue(element2.getText().contains("Monte sua oferta"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("------------------------------------------------");
      	driver.quit();
    	
    }   
    
//------------------------------------------//
// Consulta Cobertura - OFFNET              //
//------------------------------------------// 	     
   	     
      @And ("acessa pg grupo OFFNET")
      public void pgCoberturaOFFNET()  throws InterruptedException {	
       	driver.navigate().to("https://assine.vivo.com.br/erechim_RS");
       	
       	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
      }
      
      @And ("seleciona opcao combo OFFNET")
      public void acessarMenuCoberturaOFFNET() throws InterruptedException { 	
    	  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
          Thread.sleep(3000);

          Actions act2=new Actions(driver); 	
          act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[1]"))).click().build().perform();
      }
      
      @When ("na modal consulta cobertura OFFNET")
      public void consultaCoberturaOFFNET()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
  	
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Vieira Testando");   
            driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("99700-532");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("640");
      }
      	
      @And ("seleciona botao consulta OFFNET")
      public void consultaOFFNET() throws InterruptedException {
        	driver.findElement(By.className("btn-consult")).click();
        	      	
        	WebDriverWait wait = new WebDriverWait(driver, 200);
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
      }
      
      @Then ("valida retorno sucesso ou erro OFFNET")
      public void retornoSucessoouErroOFFNET() throws IOException {
        	System.out.println("-----------------------------------");
        	System.out.println("B2C - Consulta Cobertura - (OFFNET)");
        	System.out.println("-----------------------------------");
        	     	    	
        	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
        	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//        String strng2 = element2.getText();
        	System.out.printf("Resultado: "+ driver.getTitle());
        	System.out.println();
        	System.out.println("------------------------------------------------");
        	driver.quit();
      	
      }  

//----------------------------------------//
//Consulta Cobertura - Massivo SP         //
//----------------------------------------// 	     
 	     
    @And ("acessa pg de cobertura Massivo")
    public void paginaCoberturaMassivo()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/aguai_SP");

     	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao de combo Massivo")
    public void acessarMenuCoberturaMassivo() throws InterruptedException { 	
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);

        Actions act2=new Actions(driver); 	
        act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura Massivo")
    public void consultaCoberturaMassivo()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Marcos Ferreira Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("13860-000");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("868");
         
    }
    
    @And ("seleciona botao consultar Massivo")
    public void consultaMassivo() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      	    	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
    }
    
    @Then ("valida retorno de sucesso ou erro Massivo")
    public void retornoSucessoouErroMassivo() throws IOException {
      	System.out.println("---------------------------------------");
      	System.out.println("B2C - Consulta Cobertura - (Massivo SP)");
      	System.out.println("---------------------------------------");
      	     	    	
      	WebDriverWait wait4 = new WebDriverWait(driver, 200);
      	wait4.until(ExpectedConditions.textToBe(By.id("btnLinkMonte"), "Monte sua oferta"));

//      String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ driver.getTitle());
      	System.out.println();
      	System.out.println("---------------------------------------------");
      	driver.quit(); 	
    }   

//----------------------------------------//
// Consulta Cobertura - Defaut SP         //
//----------------------------------------//
	     
  @And ("acessa pg de cobertura Defaut")
  public void paginaCoberturaDefaut()  throws InterruptedException {	
     	driver.navigate().to("https://assine.vivo.com.br/bocaina_SP");

     	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
  }
  
  @And ("seleciona opcao de combo Defaut")
  public void acessarMenuCoberturaDefaut() throws InterruptedException { 	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
       act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
  }
  
  @When ("na modal de consulta cobertura Defaut")
  public void consultaCoberturaDefaut()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));

  	    driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Neto Testando");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("17240-000");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("474");
       
  }
  
  @And ("seleciona botao consultar Defaut")
  public void consultaDefaut() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	  	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
  }
  
  @Then ("valida retorno de sucesso ou erro Defaut")
  public void retornoSucessoouErroDefaut() throws IOException {
    	System.out.println("---------------------------------------");
    	System.out.println("B2C - Consulta Cobertura - (Defaut SP)");
    	System.out.println("---------------------------------------");
    	     	    	
     	WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
    	assertTrue(element2.getText().contains("Monte sua oferta"));

//      String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ driver.getTitle());
    	System.out.println();
    	System.out.println("---------------------------------------------");
    	driver.quit(); 	
  }   
  
//-----//
// B2B //
//-----//    
//----------------------------------------//
// Consulta Cobertura - onnet_padrao      //
//----------------------------------------// 	     
	     
   @And ("acessa pg de cobertura Onnet")
   public void paginaCoberturaOnnet()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/apucarana_PR/empresas/pequenas-e-medias/combos");
   	
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao de combo Onnet")
   public void acessarMenuCoberturaOnnet() throws InterruptedException { 	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
       act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("na modal de consulta cobertura Onnet")
   public void consultaCoberturaOnnet()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
	
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda ME TENV");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("86800-620");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("36");       
   }
   
   @And ("seleciona botao consultar Onnet")
   public void consultaOnnet() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
   }
   
   @Then ("valida retorno de sucesso ou erro Onnet")
   public void retornoSucessoouErroOnnet() throws InterruptedException {   	
     	System.out.println("-----------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (Onnet_padrao)");
     	System.out.println("-----------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
     	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("-----------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_padrao");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
//      report.endTest(logger);
//     	report.flush();
     	
     	driver.quit();
   }
   
   
//----------------------------------------//
// Consulta Cobertura - Onnet_sem_tv      //
//----------------------------------------// 	     
	     
   @And ("acessa pg de cobertura Sem TV")
   public void paginaCoberturaSemTV()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/cuiaba_MT/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao de combo Sem TV")
   public void acessarMenuCoberturaSemTV() throws InterruptedException { 	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
       act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("na modal de consulta cobertura Sem TV")
   public void consultaCoberturaSemTV()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
	
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("78045-250");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("150");       
   }
   
   @And ("seleciona botao consultar Sem TV")
   public void consultaSemTV() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
   }
   
   @Then ("valida retorno de sucesso ou erro Sem TV")
   public void retornoSucessoouErroSemTV() throws InterruptedException {   	
     	System.out.println("-----------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (Onnet_Sem_TV)");
     	System.out.println("-----------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
     	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("-----------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_Sem_TV");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
////      report.endTest(logger);
//     	report.flush();
     	
     	driver.quit();
   }
  
//--------------------------------------//
// Consulta Cobertura - Onnet_plus      //
//--------------------------------------// 	     
	     
   @And ("acessa pg de cobertura Plus")
   public void paginaCoberturaPlus()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/curitiba_PR/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao de combo Plus")
   public void acessarMenuCoberturaPlus() throws InterruptedException {	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
     	Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
   	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("na modal de consulta cobertura Plus")
   public void consultaCoberturaPlus()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")))); 
	   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82900320");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("66");       
   }
   
   @And ("seleciona botao consultar Plus")
   public void consultaPlus() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
   }
   
   @Then ("valida retorno de sucesso ou erro Plus")
   public void retornoSucessoouPlus() throws InterruptedException {   	
     	System.out.println("---------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (Onnet_Plus)");
     	System.out.println("---------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
     	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("---------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_Sem_TV");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
////      report.endTest(logger);
//     	report.flush();
     	
     	driver.quit();
   }
   
//---------------------------------------------//
// Consulta Cobertura - G7_SP_3P_50_vdsl - B2B //
//---------------------------------------------// 	     
	     
   @And ("acessa pg do grupo G7 B2B")
   public void paginaCoberturaG7B2B()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/votorantim_SP/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao barra G7 B2B")
   public void acessarMenuCoberturaG7B2B() throws InterruptedException {	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
   	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("valida de consulta cobertura G7 B2B")
   public void consultaCoberturaG7B2B()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[1]/input")))); 
	   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("18110210");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div[1]/div[3]/div[2]/input")).sendKeys("432");       
   }
   
   @And ("valida botao consultar G7 B2B")
   public void consultaG7B2B() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/section[1]/div/div[2]/div[3]/div[1]/h4/span"))));
   }
   
   @Then ("valida retorno sucesso ou erro G7 B2B")
   public void retornoSucessoouErroG7B2B() throws InterruptedException {   	
     	System.out.println("---------------------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (G7_SP_3P_50_vdsl - B2B)");
     	System.out.println("---------------------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div[3]/div[1]/h4/span"));
     	assertTrue(element2.getText().contains("Internet"));

//      String strng2 = element2.getText();
     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("---------------------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_Sem_TV");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
//      report.endTest(logger);
//     	report.flush();
     	
     	driver.quit();
   }
  
//-----------------------------------------------------//
// Consulta Cobertura - G9_FSP_3P_gpon_lançamento      //
//-----------------------------------------------------// 	     
	     
   @And ("acessa pg de G9 B2B")
   public void paginaCoberturaG9B2B()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/teresina_PI/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao de G9 B2B")
   public void acessarMenuCoberturaG9B2B() throws InterruptedException {	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
     	Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
   	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("valida consulta cobertura G9 B2B")
   public void consultaCoberturaG9B2B()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")))); 
	   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("64001-020");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1860");       
   }
   
   @And ("preciona botao consultar G9 B2B")
   public void consultaG9B2B() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
   }
   
   @Then ("valida retorno sucesso ou erro G9 B2B")
   public void retornoSucessoouG9B2B() throws InterruptedException {   	
     	System.out.println("------------------------------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (G9_FSP_3P_gpon_lançamento) - B2B");
     	System.out.println("------------------------------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
     	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

//      String strng2 = element2.getText();
     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("------------------------------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_Sem_TV");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
////      report.endTest(logger);
//     	report.flush();
     	
     	driver.quit();
   }
   
//--------------------------------------//
// Consulta Cobertura - OFFNET B2B      //
//--------------------------------------// 	     
	     
   @And ("acessa pg de Offnet B2B")
   public void paginaCoberturaOffnetB2B()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/paranagua_PR/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao de Offnet B2B")
   public void acessarMenuCoberturaOffnetB2B() throws InterruptedException {	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
     	Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
   	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("valida consulta cobertura Offnet B2B")
   public void consultaCoberturaOffnetB2B()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")))); 
	    
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("83206-200");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1615");       
   }
   
   @And ("preciona botao consultar Offnet B2B")
   public void consultaOffnetB2B() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
   }
   
   @Then ("valida retorno sucesso ou erro Offnet B2B")
   public void retornoErroSucessoOffnetB2B() throws InterruptedException {   	
     	System.out.println("---------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (Offnet B2B)");
     	System.out.println("-----------------------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
     	assertTrue(element2.getText().contains("Selecionamos produtos disponíveis para sua região"));

     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("-----------------------------------------------------");
   
//     	logger.log(LogStatus.PASS, "Onnet_Sem_TV");
//     	logger.addScreenCapture("C:\\Users\\80479178\\Downloads\\BUG-01.jpg");
//     	report.flush();
//     	
     	driver.quit();
   }   
   
//--------------------------------------------//
// Consulta Cobertura - Default_SP_soft - B2B //
//--------------------------------------------// 	     
	     
   @And ("acessa pg do grupo Default SP B2B")
   public void paginaCoberturaDefaultSPB2B()  throws InterruptedException {	
	    driver.navigate().to("https://assine.vivo.com.br/aguai_SP/empresas/pequenas-e-medias/combos");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("wrap-vivo"))));
   }
   
   @And ("seleciona opcao barra Default SP B2B")
   public void acessarMenuCoberturaDefaultSPB2B() throws InterruptedException {	
	   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
       Thread.sleep(3000);

       Actions act2=new Actions(driver); 	
   	   act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"))).click().build().perform();
   }
   
   @When ("valida de consulta cobertura Default SP B2B")
   public void consultaCoberturaDefaultSPB2B()  throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[1]/input")))); 
	   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda Testando");   
	   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
	    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("13860-000");
	    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div[1]/div[3]/div[2]/input")).sendKeys("868");       
   }
   
   @And ("valida botao consultar Default SP B2B")
   public void consultaDefaultSPB2B() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
   	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/section[1]/div/div[1]/h4"))));
   }
   
   @Then ("valida retorno sucesso ou erro Default SP B2B")
   public void retornoSucessoouDefaultSPB2B() throws InterruptedException {   	
     	System.out.println("--------------------------------------------------");
     	System.out.println("B2C - Consulta Cobertura - (Default_SP_soft - B2B)");
     	System.out.println("--------------------------------------------------");
     	     	    	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	    wait4.until(ExpectedConditions.textToBe(By.xpath("/html/body/section[1]/div/div[1]/h4"), "Materiais, a tecnologia fibra ainda não chegou na sua região."));

     	System.out.printf("Resultado: "+ driver.getTitle());
     	System.out.println();
     	System.out.println("--------------------------------------------------");
     	
     	driver.quit();
   }
   
}

