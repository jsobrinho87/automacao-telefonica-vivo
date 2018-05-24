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
   		System.out.println("------------------------------------------------------");
     	System.out.println("|                G5_FSP_3P_50_vdsl_plus              |");
     	System.out.println("------------------------------------------------------");
     	System.out.println("|          B2C - Preços Cards de Banda Larga         |");
     	System.out.println("------------------------------------------------------");
     	
     	driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ol/li[2]/span[1]")).click();
   	
     	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[1]/article[1]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS = elementRS.getText();
 	  	System.out.printf("| " + strngRS);
 	  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng1 = element1.getText();
 	  	System.out.printf(strng1);
 	  	WebElement element1a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[1]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng1a = element1a.getText();
 	  	System.out.printf(strng1a);
 	  	
 	  	WebDriverWait wait2 = new WebDriverWait(driver, 200);
 	  	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[1]/article[2]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS2 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[2]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS2 = elementRS2.getText();
 	  	System.out.printf(" | " + strngRS2);
 	  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng2 = element2.getText();
 	  	System.out.printf(strng2);
 	  	WebElement element2a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng2a = element2a.getText();
 	  	System.out.printf(strng2a);
 	        	
 	  	WebDriverWait wait3 = new WebDriverWait(driver, 200);
 	  	wait3.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[1]/article[3]/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
 	    	
 	  	WebElement elementRS3 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[3]/div[1]/div[4]/div[1]/div/strong[1]"));
 	  	String strngRS3 = elementRS3.getText();
 	  	System.out.printf(" | " + strngRS3);
 	  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/strong[2]"));
 	  	String strng3 = element3.getText();
 	  	System.out.printf(strng3);
 	  	WebElement element3a = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[3]/div[1]/div[4]/div[1]/div/div/strong"));
 	  	String strng3a = element3a.getText();
 	  	System.out.printf(strng3a);
 	  	
 	  	driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ol/li[3]/span[1]")).click();
 	
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
   
   @And ("acessa pg de fixa G5")
   public void paginaAvulsosFixaG5()  throws InterruptedException {	
 	  	driver.get("https://assine.vivo.com.br/telefonia/planos");
 	  	
 	  	WebDriverWait wait1 = new WebDriverWait(driver, 200);
 	  	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
   }
   
   @Then ("valida preco dos cards de Fixa G5")
   public void retornoSucessoouErroAvulsaFixaG5() throws InterruptedException {   	
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
    
}

