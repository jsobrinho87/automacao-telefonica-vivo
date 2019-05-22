package precoscardsavulsos;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PrecoCardsAvulsosSteps {
	
	static WebDriver _driver;
	
	ExtentReports report;
	ExtentTest    logger;
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador preco cards avulsos")
    public void paginaG1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	
        report = new ExtentReports("C:\\Users\\80479178\\Downloads\\Release\\ReportPrecoCardsAvulsos.html"); 
    	logger = report.startTest("Valida Consulta Cobertura");
        
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }
    
//-----//
// B2C //
//-----//    
//-------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G1_FSP_3P_15_vdsl //
//-------------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
    
    @And ("acessa pg de banda larga G1")
    public void paginaAvulsosBLG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/apucarana_PR/banda-larga/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
    }
   
    @Then ("valida preco dos cards de banda larga G1")
    public void retornoSucessoouErroAvulsosBLG1() throws InterruptedException { 
    	System.out.println("------------------------------------------");
      	System.out.println("|           G1_FSP_3P_15_vdsl            |");
    	System.out.println("------------------------------------------");
      	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
      	System.out.println("------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a);

    	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS4 = elementRS4.getText();
    	System.out.printf(" | " + strngRS4);
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng4 = element4.getText();
    	System.out.printf(strng4);
    	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng4a = element4a.getText();
    	System.out.printf(strng4a + " |");
    	System.out.println();    	
    }

// Valida os preços dos cards avulsos de Telefonia Fixa    
    
    @And ("acessa pg de fixa G1")
    public void paginaAvulsosFixaG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/telefonia/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
    }
    
    @Then ("valida preco dos cards de Fixa G1")
    public void retornoSucessoouErroAvulsaFixaG1() throws InterruptedException {   	
    	System.out.println("------------------------------------------");
      	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
      	System.out.println("------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a + " |");
    	System.out.println();
    }

// Valida os preços dos cards avulsos de TV por Assinatura   
    
    @And ("acessa pg de TV G1")
    public void paginaAvulsosTVG1()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
    }
    
    @Then ("valida preco dos cards de TV G1")
    public void retornoSucessoouErroAvulsaTVG1() throws InterruptedException {   	
    	System.out.println("------------------------------------------");
      	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
      	System.out.println("------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a);
    	
    	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS4 = elementRS4.getText();
    	System.out.printf(" | " + strngRS4);
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng4 = element4.getText();
    	System.out.printf(strng4);
    	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng4a = element4a.getText();
    	System.out.printf(strng4a + " |");
    	System.out.println();    
    	System.out.println("------------------------------------------");   
    	
     	driver.quit();
    }    
  
//-------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G2_FSP_3P_50_vdsl //
//-------------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
     
     @And ("acessa pg de banda larga G2")
     public void paginaAvulsosBLG2()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/brusque_SC/banda-larga/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
     }
    
     @Then ("valida preco dos cards de banda larga G2")
     public void retornoSucessoouErroAvulsosBLG2() throws InterruptedException { 
     	System.out.println("------------------------------------------");
       	System.out.println("|           G2_FSP_3P_50_vdsl            |");
     	System.out.println("------------------------------------------");
       	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a);

     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf(" | " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a + " |");
     	System.out.println();    	
     }

 // Valida os preços dos cards avulsos de Telefonia Fixa    
     
     @And ("acessa pg de fixa G2")
     public void paginaAvulsosFixaG2()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/telefonia/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
     }
     
     @Then ("valida preco dos cards de Fixa G2")
     public void retornoSucessoouErroAvulsaFixaG2() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a + " |");
     	System.out.println();
     }

// Valida os preços dos cards avulsos de TV por Assinatura   
     
     @And ("acessa pg de TV G2")
     public void paginaAvulsosTVG2()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
     }
     
     @Then ("valida preco dos cards de TV G2")
     public void retornoSucessoouErroAvulsaTVG2() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a);
     	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
       	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf(" | " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a + " |");
     	System.out.println();    
     	System.out.println("------------------------------------------");   
     	
      	driver.quit();
     } 

//----------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G3_FSP_50_GPON //
//----------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
  
  @And ("acessa pg de banda larga G3")
  public void paginaAvulsosBLG3()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/navegantes_SC/banda-larga/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
  }
 
  @Then ("valida preco dos cards de banda larga G3")
  public void retornoSucessoouErroAvulsosBLG3() throws InterruptedException {
  		System.out.println("------------------------------------------------------");
    	System.out.println("|                   G3_FSP_50_GPON                   |");
    	System.out.println("------------------------------------------------------");
    	System.out.println("|          B2C - Preços Cards de Banda Larga         |");
    	System.out.println("------------------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a);    
	  	
	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS5 = elementRS5.getText();
	  	System.out.printf(" | " + strngRS5);
	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng5 = element5.getText();
	  	System.out.printf(strng5);
	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng5a = element5a.getText();
	  	System.out.printf(strng5a + " |");
	  	System.out.println();
  }

// Valida os preços dos cards avulsos de Telefonia Fixa    
  
  @And ("acessa pg de fixa G3")
  public void paginaAvulsosFixaG3()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
  }
  
  @Then ("valida preco dos cards de Fixa G3")
  public void retornoSucessoouErroAvulsaFixaG3() throws InterruptedException {   	
	    System.out.println("------------------------------------------------------");
    	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
    	System.out.println("------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a + " |");
	  	System.out.println();
  }

//Valida os preços dos cards avulsos de TV por Assinatura   
  
  @And ("acessa pg de TV G3")
  public void paginaAvulsosTVG3()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
  }
  
  @Then ("valida preco dos cards de TV G3")
  public void retornoSucessoouErroAvulsaTVG3() throws InterruptedException {   	
  		System.out.println("------------------------------------------");
    	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
    	System.out.println("------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	  	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a + " |");
	  	System.out.println();    
	  	System.out.println("------------------------------------------");   
	  	
	   	driver.quit();
  }
  
//-------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G4_FSP_2P_15_vdsl //
//-------------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
    
    @And ("acessa pg de banda larga G4")
    public void paginaAvulsosBLG4()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/rondonopolis_MT/banda-larga/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
    }
   
    @Then ("valida preco dos cards de banda larga G4")
    public void retornoSucessoouErroAvulsosBLG4() throws InterruptedException { 
    	System.out.println("------------------------------------------");
      	System.out.println("|           G4_FSP_2P_15_vdsl            |");
    	System.out.println("------------------------------------------");
      	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
      	System.out.println("------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a);

    	WebDriverWait wait4 = new WebDriverWait(driver, 200);
    	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS4 = elementRS4.getText();
    	System.out.printf(" | " + strngRS4);
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng4 = element4.getText();
    	System.out.printf(strng4);
    	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng4a = element4a.getText();
    	System.out.printf(strng4a + " |");
    	System.out.println();    	
    }

// Valida os preços dos cards avulsos de Telefonia Fixa    
    
    @And ("acessa pg de fixa G4")
    public void paginaAvulsosFixaG4()  throws InterruptedException {	
    	driver.get("https://assine.vivo.com.br/telefonia/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
    }
    
    @Then ("valida preco dos cards de Fixa G4")
    public void retornoSucessoouErroAvulsaFixaG4() throws InterruptedException {   	
    	System.out.println("------------------------------------------");
      	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
      	System.out.println("------------------------------------------");
    	
      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS = elementRS.getText();
    	System.out.printf("| " + strngRS);
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng1 = element1.getText();
    	System.out.printf(strng1);
    	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng1a = element1a.getText();
    	System.out.printf(strng1a);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS2 = elementRS2.getText();
    	System.out.printf(" | " + strngRS2);
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng2 = element2.getText();
    	System.out.printf(strng2);
    	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng2a = element2a.getText();
    	System.out.printf(strng2a);
          	
    	WebDriverWait wait3 = new WebDriverWait(driver, 200);
    	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
      	
    	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
    	String strngRS3 = elementRS3.getText();
    	System.out.printf(" | " + strngRS3);
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
    	String strng3 = element3.getText();
    	System.out.printf(strng3);
    	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
    	String strng3a = element3a.getText();
    	System.out.printf(strng3a + " |");
    	System.out.println();
    	System.out.println("-------------------------------");   
    	
    	driver.quit();
    }   
  
//------------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G5_FSP_3P_50_vdsl_plus //
//------------------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
   
   @And ("acessa pg de banda larga G5")
   public void paginaAvulsosBLG5()  throws InterruptedException {	
 	  	driver.get("https://assine.vivo.com.br/curitiba_PR/banda-larga/planos");
 	  	
 	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
   }
  
   @Then ("valida preco dos cards de banda larga G5")
   public void retornoSucessoouErroAvulsosBLG5() throws InterruptedException {
   		System.out.println("--------------------------------------------------------------");
     	System.out.println("|                    G5_FSP_3P_50_vdsl_plus                  |");
     	System.out.println("--------------------------------------------------------------");
     	System.out.println("|              B2C - Preços Cards de Banda Larga             |");
     	System.out.println("--------------------------------------------------------------");
     	
     	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ol/li[2]/span")).click();
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS = elementRS.getText();
 	  	System.out.printf("| " + strngRS);
 	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng1 = element1.getText();
 	  	System.out.printf(strng1);
 	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng1a = element1a.getText();
 	  	System.out.printf(strng1a);
 	  	
 	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
 	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS2 = elementRS2.getText();
 	  	System.out.printf(" | " + strngRS2);
 	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng2 = element2.getText();
 	  	System.out.printf(strng2);
 	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng2a = element2a.getText();
 	  	System.out.printf(strng2a);
 	        	
 	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
 	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS3 = elementRS3.getText();
 	  	System.out.printf(" | " + strngRS3);
 	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng3 = element3.getText();
 	  	System.out.printf(strng3);
 	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng3a = element3a.getText();
 	  	System.out.printf(strng3a);
 	  	
 	  	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ol/li[3]/span[1]")).click();
 	
 	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
 	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS4 = elementRS4.getText();
 	  	System.out.printf(" | " + strngRS4);
 	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng4 = element4.getText();
 	  	System.out.printf(strng4);
 	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng4a = element4a.getText();
 	  	System.out.printf(strng4a);    
 	  	
 	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
 	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS5 = elementRS5.getText();
 	  	System.out.printf(" | " + strngRS5);
 	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng5 = element5.getText();
 	  	System.out.printf(strng5);
 	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng5a = element5a.getText();
 	  	System.out.printf(strng5a);
 	  	
 	  	WebDriverWait wait6 = new WebDriverWait(driver, 200);
 	  	wait6.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS6 = elementRS6.getText();
 	  	System.out.printf(" | " + strngRS6);
 	  	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng6 = element6.getText();
 	  	System.out.printf(strng6);
 	  	WebElement element6a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng6a = element6a.getText();
 	  	System.out.printf(strng6a + " |");
 	  	System.out.println();
   }

 // Valida os preços dos cards avulsos de Telefonia Fixa    
   
   @And ("acessa pg de fixa G5")
   public void paginaAvulsosFixaG5()  throws InterruptedException {	
 	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
 	  	
 	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
   }
   
   @Then ("valida preco dos cards de Fixa G5")
   public void retornoSucessoouErroAvulsaFixaG5() throws InterruptedException {   	
	    System.out.println("--------------------------------------------------------------");
     	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS = elementRS.getText();
 	  	System.out.printf("| " + strngRS);
 	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng1 = element1.getText();
 	  	System.out.printf(strng1);
 	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng1a = element1a.getText();
 	  	System.out.printf(strng1a);
 	  	
 	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
 	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS2 = elementRS2.getText();
 	  	System.out.printf(" | " + strngRS2);
 	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng2 = element2.getText();
 	  	System.out.printf(strng2);
 	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng2a = element2a.getText();
 	  	System.out.printf(strng2a);
 	        	
 	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
 	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS3 = elementRS3.getText();
 	  	System.out.printf(" | " + strngRS3);
 	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng3 = element3.getText();
 	  	System.out.printf(strng3);
 	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng3a = element3a.getText();
 	  	System.out.printf(strng3a + " |");
 	  	System.out.println();
   }

 //Valida os preços dos cards avulsos de TV por Assinatura   
   
   @And ("acessa pg de TV G5")
   public void paginaAvulsosTVG5()  throws InterruptedException {	
 	  	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
 	  	
 	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
   }
   
   @Then ("valida preco dos cards de TV G5")
   public void retornoSucessoouErroAvulsaTVG5() throws InterruptedException {   	
   		System.out.println("------------------------------------------");
     	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS = elementRS.getText();
 	  	System.out.printf("| " + strngRS);
 	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng1 = element1.getText();
 	  	System.out.printf(strng1);
 	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng1a = element1a.getText();
 	  	System.out.printf(strng1a);
 	  	
 	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
 	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS2 = elementRS2.getText();
 	  	System.out.printf(" | " + strngRS2);
 	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng2 = element2.getText();
 	  	System.out.printf(strng2);
 	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng2a = element2a.getText();
 	  	System.out.printf(strng2a);
 	        	
 	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
 	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS3 = elementRS3.getText();
 	  	System.out.printf(" | " + strngRS3);
 	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng3 = element3.getText();
 	  	System.out.printf(strng3);
 	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng3a = element3a.getText();
 	  	System.out.printf(strng3a);
 	  	
 	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
 	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS4 = elementRS4.getText();
 	  	System.out.printf(" | " + strngRS4);
 	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng4 = element4.getText();
 	  	System.out.printf(strng4);
 	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng4a = element4a.getText();
 	  	System.out.printf(strng4a + " |");
 	  	System.out.println();    
 	  	System.out.println("------------------------------------------");   
 	  	
 	   	driver.quit();
   }    

//-------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G6_SP_3P_100_gpon //
//-------------------------------------------------------------// 	     

 // Valida os preços dos cards avulsos de Banda Larga
     
     @And ("acessa pg de banda larga G6")
     public void paginaAvulsosBLG6()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/sao-paulo_SP/banda-larga/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Fibra"));
     }
    
     @Then ("valida preco dos cards de banda larga G6")
     public void retornoSucessoouErroAvulsosBLG6() throws InterruptedException { 
     	System.out.println("-------------------------------------------");
       	System.out.println("|            G6_SP_3P_100_gpon            |");
     	System.out.println("-------------------------------------------");
       	System.out.println("|    B2C - Preços Cards de Banda Larga    |");
       	System.out.println("-------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a);
     	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf(" | " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a + " |");
     	System.out.println();   
     }

 // Valida os preços dos cards avulsos de Telefonia Fixa    
     
     @And ("acessa pg de fixa G6")
     public void paginaAvulsosFixaG6()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/telefonia/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
     }
     
     @Then ("valida preco dos cards de Fixa G6")
     public void retornoSucessoouErroAvulsaFixaG6() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a + " |");
     	System.out.println();
     }

// Valida os preços dos cards avulsos de TV por Assinatura   
     
     @And ("acessa pg de TV G6")
     public void paginaAvulsosTVG6()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
     }
     
     @Then ("valida preco dos cards de TV G6")
     public void retornoSucessoouErroAvulsaTVG6() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a);
     	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf(" | " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a + " |");
     	System.out.println();    
     	System.out.println("------------------------------------------");   
     	
      	driver.quit();
     }    
   
//------------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - G7_SP_3P_50_vdsl //
//------------------------------------------------------------// 	     

// Valida os preços dos cards avulsos de Banda Larga
     
     @And ("acessa pg de banda larga G7")
     public void paginaAvulsosBLG7()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/aruja_SP/banda-larga/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Fibra"));
     }
    
     @Then ("valida preco dos cards de banda larga G7")
     public void retornoSucessoouErroAvulsosBLG7() throws InterruptedException { 
     	System.out.println("------------------------------------------");
       	System.out.println("|            G7_SP_3P_50_vdsl            |");
     	System.out.println("------------------------------------------");
       	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a + " |");
     	System.out.println(); 
     	
     }

// Valida os preços dos cards avulsos de Telefonia Fixa    
     
     @And ("acessa pg de fixa G7")
     public void paginaAvulsosFixaG7()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/telefonia/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
     }
     
     @Then ("valida preco dos cards de Fixa G7")
     public void retornoSucessoouErroAvulsaFixaG7() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a + " |");
     	System.out.println();
     }

// Valida os preços dos cards avulsos de TV por Assinatura   
     
     @And ("acessa pg de TV G7")
     public void paginaAvulsosTVG7()  throws InterruptedException {	
     	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
     	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
     }
     
     @Then ("valida preco dos cards de TV G7")
     public void retornoSucessoouErroAvulsaTVG7() throws InterruptedException {   	
     	System.out.println("------------------------------------------");
       	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
       	System.out.println("------------------------------------------");
     	
       	WebDriverWait wait1 = new WebDriverWait(driver, 200);
     	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS = elementRS.getText();
     	System.out.printf("| " + strngRS);
     	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng1 = element1.getText();
     	System.out.printf(strng1);
     	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng1a = element1a.getText();
     	System.out.printf(strng1a);
     	
     	WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS2 = elementRS2.getText();
     	System.out.printf(" | " + strngRS2);
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng2 = element2.getText();
     	System.out.printf(strng2);
     	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng2a = element2a.getText();
     	System.out.printf(strng2a);
           	
     	WebDriverWait wait3 = new WebDriverWait(driver, 200);
     	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS3 = elementRS3.getText();
     	System.out.printf(" | " + strngRS3);
     	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng3 = element3.getText();
     	System.out.printf(strng3);
     	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng3a = element3a.getText();
     	System.out.printf(strng3a);
     	
     	WebDriverWait wait4 = new WebDriverWait(driver, 200);
     	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
       	
     	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
     	String strngRS4 = elementRS4.getText();
     	System.out.printf(" | " + strngRS4);
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
     	String strng4 = element4.getText();
     	System.out.printf(strng4);
     	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
     	String strng4a = element4a.getText();
     	System.out.printf(strng4a + " |");
     	System.out.println();    
     	System.out.println("------------------------------------------");   
     	
      	driver.quit();
     } 

//--------------------------------------------------------------------// 
//Precificação preço dos Cards de Avulsos - G9_FSP_3P_gpon_lançamento //
//--------------------------------------------------------------------// 	     

//Valida os preços dos cards avulsos de Banda Larga
  
  @And ("acessa pg de banda larga G9")
  public void paginaAvulsosBLG9()  throws InterruptedException {	
  	driver.get("https://assine.vivo.com.br/teresina_PI/banda-larga/planos");
  	
  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
  }
 
  @Then ("valida preco dos cards de banda larga G9")
  public void retornoSucessoouErroAvulsosBLG9() throws InterruptedException { 
  		System.out.println("------------------------------------------");
    	System.out.println("|       G9_FSP_3P_gpon_lançamento        |");
    	System.out.println("------------------------------------------");
    	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
    	System.out.println("------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a + " |");
	  	System.out.println();    	
  }

// Valida os preços dos cards avulsos de Telefonia Fixa    
  
  @And ("acessa pg de fixa G9")
  public void paginaAvulsosFixaG9()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
  }
  
  @Then ("valida preco dos cards de Fixa G9")
  public void retornoSucessoouErroAvulsaFixaG9() throws InterruptedException {   	
  		System.out.println("------------------------------------------");
    	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
    	System.out.println("------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a + " |");
	  	System.out.println();
  }

//Valida os preços dos cards avulsos de TV por Assinatura   
  
  @And ("acessa pg de TV G9")
  public void paginaAvulsosTVG9()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
  }
  
  @Then ("valida preco dos cards de TV G9")
  public void retornoSucessoouErroAvulsaTVG9() throws InterruptedException {   	
  		System.out.println("------------------------------------------");
    	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
    	System.out.println("------------------------------------------");
  	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	  	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a + " |");
	  	System.out.println();    
	  	System.out.println("------------------------------------------");   
	  	
	   	driver.quit();
  } 
  
//--------------------------------------------------------------// 
//Precificação preço dos Cards de Avulsos - G10_FSP_3P_100_GPON //
//--------------------------------------------------------------// 	     

//Valida os preços dos cards avulsos de Banda Larga
 
 @And ("acessa pg de BL G10")
 public void paginaAvulsosBLG10()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/garanhuns_PE/banda-larga/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
 }

 @Then ("valida preco dos cards de BL G10")
 public void retornoSucessoouErroAvulsosBLG10() throws InterruptedException {
 		System.out.println("------------------------------------------------------");
	   	System.out.println("|                G10_FSP_3P_100_GPON                 |");
	   	System.out.println("------------------------------------------------------");
	   	System.out.println("|          B2C - Preços Cards de Banda Larga         |");
	   	System.out.println("------------------------------------------------------");
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a);    
	  	
	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS5 = elementRS5.getText();
	  	System.out.printf(" | " + strngRS5);
	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng5 = element5.getText();
	  	System.out.printf(strng5);
	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[5]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng5a = element5a.getText();
	  	System.out.printf(strng5a + " |");
	  	System.out.println();
 }

//Valida os preços dos cards avulsos de Telefonia Fixa    
 
 @And ("acessa pg de telefonia G10")
 public void paginaAvulsosFixaG10()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
 }
 
 @Then ("valida preco dos cards de telefonia G10")
 public void retornoSucessoouErroAvulsaFixaG10() throws InterruptedException {   	
	    System.out.println("------------------------------------------------------");
	   	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
	   	System.out.println("------------------------------------------");
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a + " |");
	  	System.out.println();
 }

//Valida os preços dos cards avulsos de TV por Assinatura   
 
 @And ("acessa pg de TV Assinatura G10")
 public void paginaAvulsosTVG10()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
 }
 
 @Then ("valida preco dos cards de TV Assinatura G10")
 public void retornoSucessoouErroAvulsaTVG10() throws InterruptedException {   	
 		System.out.println("------------------------------------------");
	   	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
	   	System.out.println("------------------------------------------");
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	  	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a + " |");
	  	System.out.println();    
	  	System.out.println("------------------------------------------");   
	  	
	   	driver.quit();
 }  
 
//-----------------------------------------------------// 
//Precificação preço dos Cards de Avulsos - OFFNET B2C //
//-----------------------------------------------------// 	     

//Valida os preços dos cards avulsos de Banda Larga
 
 @And ("acessa pg de BL OFFNET")
 public void paginaAvulsosBLOFFNET()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/erechim_RS/banda-larga/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
 }

 @Then ("valida preco dos cards de BL OFFNET")
 public void retornoSucessoouErroAvulsosBLOFFNET() throws InterruptedException {
 		System.out.println("--------------------------------------------------------------");
	   	System.out.println("|                         OFFNET - B2C                       |");
	   	System.out.println("--------------------------------------------------------------");
	   	System.out.println("|              B2C - Preços Cards de Banda Larga             |");
	   	System.out.println("--------------------------------------------------------------");
	   	
	   	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ol/li[2]/span")).click();
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a);
	        	
	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS3 = elementRS3.getText();
	  	System.out.printf(" | " + strngRS3);
	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng3 = element3.getText();
	  	System.out.printf(strng3);
	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng3a = element3a.getText();
	  	System.out.printf(strng3a);
	  	
	  	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ol/li[3]/span[1]")).click();
	
	  	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	  	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS4 = elementRS4.getText();
	  	System.out.printf(" | " + strngRS4);
	  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng4 = element4.getText();
	  	System.out.printf(strng4);
	  	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng4a = element4a.getText();
	  	System.out.printf(strng4a);    
	  	
	  	WebDriverWait wait5 = new WebDriverWait(driver, 200);
	  	wait5.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS5 = elementRS5.getText();
	  	System.out.printf(" | " + strngRS5);
	  	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng5 = element5.getText();
	  	System.out.printf(strng5);
	  	WebElement element5a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng5a = element5a.getText();
	  	System.out.printf(strng5a + " |");
	  	System.out.println();
 }

// Valida os preços dos cards avulsos de Telefonia Fixa    
 
 @And ("acessa pg de telefonia OFFNET")
 public void paginaAvulsosFixaOFFNET()  throws InterruptedException {	
	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
	  	
	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
 }
 
 @Then ("valida preco dos cards de Fixa OFFNET")
 public void retornoSucessoouErroAvulsaFixaOFFNET() throws InterruptedException {   	
	    System.out.println("-------------------------------------------------------");
	   	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
	   	System.out.println("------------------------------------------");
	 	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS = elementRS.getText();
	  	System.out.printf("| " + strngRS);
	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng1 = element1.getText();
	  	System.out.printf(strng1);
	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng1a = element1a.getText();
	  	System.out.printf(strng1a);
	  	
	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
	    	
	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	  	String strngRS2 = elementRS2.getText();
	  	System.out.printf(" | " + strngRS2);
	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	  	String strng2 = element2.getText();
	  	System.out.printf(strng2);
	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	  	String strng2a = element2a.getText();
	  	System.out.printf(strng2a + " |");
	    System.out.println();
	    System.out.println("---------------------");
	   	driver.quit();
 }

//-----------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - Defaut SP //
//-----------------------------------------------------// 	     

//Valida os preços dos cards avulsos de Banda Larga
   
   @And ("acessa pg de BL Defaut SP")
   public void paginaAvulsosBLDefautSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/bocaina_SP/banda-larga/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
   }
  
   @Then ("valida preco dos cards de BL Defaut SP")
   public void retornoSucessoouErroAvulsosBLDefautSP() throws InterruptedException { 
   		System.out.println("------------------------------------------");
     	System.out.println("|                 Defaut SP              |");
     	System.out.println("------------------------------------------");
     	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a);
	         	
	   	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	   	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS3 = elementRS3.getText();
	   	System.out.printf(" | " + strngRS3);
	   	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng3 = element3.getText();
	   	System.out.printf(strng3);
	   	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng3a = element3a.getText();
	   	System.out.printf(strng3a + " |");
	   	System.out.println(); 
   	
   }

//Valida os preços dos cards avulsos de Telefonia Fixa    
   
   @And ("acessa pg de fixa Defaut SP")
   public void paginaAvulsosFixaDefautSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/telefonia/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
   }
   
   @Then ("valida preco dos cards de Fixa Defaut SP")
   public void retornoSucessoouErroAvulsaFixaDefautSP() throws InterruptedException {   	
   		System.out.println("------------------------------------------");
     	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a + " |");
	    System.out.println();
   }

//Valida os preços dos cards avulsos de TV por Assinatura   
   
   @And ("acessa pg de TV Defaut SP")
   public void paginaAvulsosTVDefautSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
   }
   
   @Then ("valida preco dos cards de TV Defaut SP")
   public void retornoSucessoouErroAvulsaTVDefautSP() throws InterruptedException {   	
   		System.out.println("------------------------------------------");
     	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a);
	         	
	   	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	   	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS3 = elementRS3.getText();
	   	System.out.printf(" | " + strngRS3);
	   	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng3 = element3.getText();
	   	System.out.printf(strng3);
	   	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng3a = element3a.getText();
	   	System.out.printf(strng3a);
	   	
	   	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	   	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS4 = elementRS4.getText();
	   	System.out.printf(" | " + strngRS4);
	   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng4 = element4.getText();
	   	System.out.printf(strng4);
	   	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng4a = element4a.getText();
	   	System.out.printf(strng4a + " |");
	   	System.out.println();    
	   	System.out.println("------------------------------------------");   
   	
    	driver.quit();
   }  
 
 //------------------------------------------------------// 
// Precificação preço dos Cards de Avulsos - Massivo SP //
//------------------------------------------------------// 	     

//Valida os preços dos cards avulsos de Banda Larga
   
   @And ("acessa pg de banda larga Massivo SP")
   public void paginaAvulsosBLMassivoSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/aruja_SP/banda-larga/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Fibra"));
   }
  
   @Then ("valida preco dos cards de banda larga Massivo SP")
   public void retornoSucessoouErroAvulsosBLMassivoSP() throws InterruptedException { 
   		System.out.println("------------------------------------------");
     	System.out.println("|                Massivo SP              |");
     	System.out.println("------------------------------------------");
     	System.out.println("|   B2C - Preços Cards de Banda Larga    |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a);
	         	
	   	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	   	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS3 = elementRS3.getText();
	   	System.out.printf(" | " + strngRS3);
	   	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng3 = element3.getText();
	   	System.out.printf(strng3);
	   	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng3a = element3a.getText();
	   	System.out.printf(strng3a + " |");
	   	System.out.println(); 
   	
   }

//Valida os preços dos cards avulsos de Telefonia Fixa    
   
   @And ("acessa pg de fixa Massivo SP")
   public void paginaAvulsosFixaMassivoSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/telefonia/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
   }
   
   @Then ("valida preco dos cards de Fixa Massivo SP")
   public void retornoSucessoouErroAvulsaFixaMassivoSP() throws InterruptedException {   	
   		System.out.println("------------------------------------------");
     	System.out.println("|  B2C - Preços Cards de Telefonia Fixa  |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a + " |");
	    System.out.println();
   }

//Valida os preços dos cards avulsos de TV por Assinatura   
   
   @And ("acessa pg de TV Massivo SP")
   public void paginaAvulsosTVMassivoSP()  throws InterruptedException {	
	   	driver.get("https://assine.vivo.com.br/tv-por-assinatura/planos");
	   	
	   	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
   }
   
   @Then ("valida preco dos cards de TV Massivo SP")
   public void retornoSucessoouErroAvulsaTVMassivoSP() throws InterruptedException {   	
   		System.out.println("------------------------------------------");
     	System.out.println("|B2C - Preços Cards de TV por Assinatura |");
     	System.out.println("------------------------------------------");
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS = elementRS.getText();
	   	System.out.printf("| " + strngRS);
	   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng1 = element1.getText();
	   	System.out.printf(strng1);
	   	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng1a = element1a.getText();
	   	System.out.printf(strng1a);
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, 200);
	   	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS2 = elementRS2.getText();
	   	System.out.printf(" | " + strngRS2);
	   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng2 = element2.getText();
	   	System.out.printf(strng2);
	   	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng2a = element2a.getText();
	   	System.out.printf(strng2a);
	         	
	   	WebDriverWait wait3 = new WebDriverWait(driver, 200);
	   	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS3 = elementRS3.getText();
	   	System.out.printf(" | " + strngRS3);
	   	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng3 = element3.getText();
	   	System.out.printf(strng3);
	   	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng3a = element3a.getText();
	   	System.out.printf(strng3a);
	   	
	   	WebDriverWait wait4 = new WebDriverWait(driver, 200);
	   	wait4.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
	     	
	   	WebElement elementRS4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[1]"));
	   	String strngRS4 = elementRS4.getText();
	   	System.out.printf(" | " + strngRS4);
	   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/strong[2]"));
	   	String strng4 = element4.getText();
	   	System.out.printf(strng4);
	   	WebElement element4a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/article[4]/div[1]/div[4]/div[1]/div/div/strong"));
	   	String strng4a = element4a.getText();
	   	System.out.printf(strng4a + " |");
	   	System.out.println();    
	   	System.out.println("------------------------------------------");   
   	
    	driver.quit();
   }     
   
}
 

