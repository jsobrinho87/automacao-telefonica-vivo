package testesdiarios;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestediariosSteps {
	
	private WebDriver driver;
//	private utils util;
	public static final int TIMEOUT_SEGUNDO = 15;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador TD")
    public void bussolaTD()  throws InterruptedException { 
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	driver = new ChromeDriver(); 
    	driver.manage().window().maximize();
    }	
  
//----------------------------------------------------//
// Realizar pedido de compra combo 3P - Portal Assine //
//----------------------------------------------------//
    	
    @And ("acessa pagina combo 3P TD")
        public void acessapaginaCombo3P()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/porto-alegre_RS/combos");
    	
//    	util.util.logPrint("Carrega pagina Combos");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"))));
    	
    	if (driver.findElements(By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"))));   
     	} 
    }
    
    @And ("informa opcao de combo 3P TD")
    public void menucomboTD() throws InterruptedException {
//    	util.util.logPrint("Seleciona card Combo");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button")));
    	
    	WebElement element1 = driver.findElement(By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("modal de consulta cobertura informa os dados TD")
    public void informaDadoscomboTD()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("MARIO DA SILVA TESTANDO");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-2636");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("90660-120");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("390");
        
//        util.util.logPrint("Valida Consulta Cobertura");
    }
    
    @SuppressWarnings("unlikely-arg-type")
	@And ("modal de Identificacao clica em Receber Ligacao TD")
    public void receberLigacaocomboTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	Thread.sleep(6000);
    	
     	if(!driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong")).equals(driver)){
     		WebDriverWait wait1 = new WebDriverWait(driver, 200);
        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
        	
        	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
            element1.click();
            
            WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
        	
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("MARIO DA SILVA TESTANDO");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-2636");
        	driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("90660-120");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("390");
        	
        	driver.findElement(By.className("btn-consult")).click();
     	} 
    }
    
    @And ("modal de Identificacao clica em Adicionar TD")
    public void btaoAdicionalcomboTD() throws InterruptedException, IOException {
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div/div//div/section/form/div/div/div/load/div[2]/strong"), "Grátis"));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div/div//div//section/form/div/div/button")).click();
    }
    
    @When ("tela dados do cliente complete o pedido TD")
    public void dadosClientecomboTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtDocumento")));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("04");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("03");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1978");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Mae Maria Testando");
    }
    
    @And ("dados do cliente clica em Proximo Passo TD")
    public void btaoProximoPasso1comboTD() throws IOException {
    	driver.findElement(By.className("btn-lg")).click();
    }
    
    @And ("tela Endereco de Instalacao clica em Proximo Passo TD")
    public void btaoProximoPasso2comboTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("tela de Pagamentos informa os dados TD")
    public void dadosPagamentocomboTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();
    }
    
    @And ("tela de Pagamento clica em Finalizar Pedido TD")
    public void btaoProximoPasso3CBTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("tela exibi mensagem de sucesso ou erro TD")
    public void sucessoouErrocomboTD() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - 3P COMBO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	driver.quit();
    }

//-------------------------------------------------------------//
//Realizar pedido de compra avulso Banda Larga - Portal Assine //
//-------------------------------------------------------------//
    
    @And ("acessa pg de Avulso BL TD")
    public void pgAvulsoBLTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/salvador_BA/banda-larga/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
    
    	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong"), "Planos Vivo Internet"));
     	} 
    }
    
    @And ("informa opcao de Avulso BL TD")
    public void menuAvulsoBLTD() throws InterruptedException {
//    	driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ol/li[2]/span")).click();
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div/div[1]/div[4]/div[2]/atom-button/a"), "Assine já"));
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/div/ul/li[1]/article[2]/div/div[1]/div[4]/div[2]/atom-button/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
   }
    
    @When ("modal de consulta cobertura dados do Cliente Avulso BL TD")
    public void dadosAvulsoBLTD()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
  
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Wilson jose Testando Novo");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0000");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("40024-081");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("111");
    }
    
    @And ("modal de Identifica clica Receber Ligacao Avulso BL TD")
    public void receberLigacaoAvulsoBLTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("informa botao comprar internet avulsa BL TD")
    public void btaoComprarInternetAvulsoBLTD() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	
    	Thread.sleep(3000);
    	
    	Actions act4=new Actions(driver);   	
    	act4.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    @When ("completa o pedido Avulso BL TD")
    public void dadosClienteAvulsoBLTD() throws IOException { 
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("04");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("03");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1990");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Mae Maria Testando Nov");
    }
    
    @And ("clica em Proximo Passo Avulso BL TD")
    public void btaoAvulsoBLTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    	
    }
        
    @And ("tela Endereco Instalacao clica Proximo Passo Avulso BL TD")
    public void btaoProximoPasso2AvulsoBLTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("pagamentos informa os dados Avulso BL TD")
    public void dadosPagamentoAvulsoBLTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();
    }
     
    @And ("pagamento clica em Finalizar Pedido Avulso BL TD")
    public void btaoProximoPasso3AvulsoBLTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("mensagem de sucesso ou erro Avulso BL TD")
    public void sucessoouErroAvulsoBLTD() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - BANDA LARGA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	driver.quit();
    }

//----------------------------------------------------------------//
// Realiza pedido de compra Avulso Telefonia Fixa - Portal Assine //
//----------------------------------------------------------------//
    
    @And ("acessa pg de Avulso Fixa TD")
    public void pgAvulsoFixaTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/francisco-beltrao_PR/telefonia/planos");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
    
    	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Planos de Telefonia"));
     	} 
    }
    
    @And ("informa opcao de Avulso Fixa TD")
    public void avulsoFixaTD() throws InterruptedException {
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div/div[1]/div[4]/div[2]/atom-button/button"), "Assine já"));
    	
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div/article[2]/div/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("modal de consulta cobertura dados do Cliente Avulso Fixa TD")
    public void dadosAvulsoFixaTD()  throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Wilson jose lodovico Novo");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0098");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("85605-450");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("980");
    }
    
    @And ("modal de Identifica clica em Receber Ligacao Avulso Fixa TD")
    public void receberLigacaoAvulsoFixaTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("informa botao comprar internet avulsa Fixa TD")
    public void btaoComprarInternetAvulsoFixaTD() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	
    	Thread.sleep(3000);
    	
    	Actions act4=new Actions(driver);   	
    	act4.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }  
    
    @When ("completa o pedido Avulso Fixa TD")
    public void dadosClienteAvulsoFixaTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125250020");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("31");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("03");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1956");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Palmira Maiochi ludovico");
    }
    
    @And ("clica em Proximo Passo Avulso Fixa TD")
    public void btaoProximoPasso1AvulsoFixaTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();

    }
    
    @And ("tela Endereco Instalacao clica Proximo Passo Avulso Fixa TD")
    public void botaoProximoPasso2AvulsoFixaTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));

    }
    
    @When ("pagamentos informa os dados Avulso Fixa TD")
    public void dadosPagamentoAvulsoFixaTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();
    }
     
    @And ("pagamento clica em Finalizar Pedido Avulso Fixa TD")
    public void botaoProximoPasso3AvulsoFixaTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    
    @Then ("mensagem de sucesso ou erro Avulso Fixa TD")
    public void messagemAvulsoFixaTD() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - TELEFONIA FIXA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	driver.quit();
    }
    
//-------------------------------------------------------------------//
// Realiza pedido de compra Avulso TV por assinatura - Portal Assine //
//-------------------------------------------------------------------//
    
    @And ("acessa pg de Avulso TV TD")
    public void pgAvulsoTVTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/Paranavai_PR/tv-por-assinatura/planos");

    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
    
    	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
        	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/header/div/div/h1/strong"), "Vivo TV"));
     	}
    }
    
    @And ("acessa opcao de Avulso TV TD")
    public void acessaMenuAvulsoTVTD() throws InterruptedException {
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div[1]/div/article[2]/div/footer/div[2]/div[2]/atom-button/button"), "Assine já"));
    	
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/div[1]/div/article[2]/div/footer/div[2]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("modal de consulta cobertura dados do Cliente Avulso TV TD")
    public void dadosAvulsoTVTD()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Regina Testando de Amorim");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0009");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("87701-000");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("720");
    }
    
    @And ("modal de Identifica clica em Receber Ligacao Avulso TV TD")
    public void receberLigacaoAvulsoTVTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("informa botao comprar internet avulsa TV TD")
    public void btaoComprarInternetAvulsoTVTD() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("completa o pedido Avulso TV TD")
    public void dadosClienteAvulsoTVTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125250090");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("13");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("08");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1960");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Eunice de amorim marque");
    }
    
    @And ("clica em Proximo Passo Avulso TV TD")
    public void btaoProximoPasso1AvulsoTVTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    }
    
    @And ("tela Endereco Instalacao clica Proximo Passo Avulso TV TD")
    public void btaoProximoPasso2AvulsoTVTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("pagamentos informa os dados Avulso TV TD")
    public void dadosPagamentoAvulsoTVTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    }
     
    @And ("pagamento clica em Finalizar Pedido Avulso TV TD")
    public void btaoAvulsoTVTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("mensagem de sucesso ou erro Avulso TV TD")
    public void sucessoouErroAvulsoTVTD() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - TV POR ASSINATURA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
      	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	driver.quit();
    }
 
//--------------------------------------------------------//
// Realizar pedido de compra simulador 3P - Portal Assine //
//--------------------------------------------------------//    
    
    @And ("acessa pg simulador 3P TD")
    public void pg3pSimuladorTD()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/Florianopolis_SC");
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
      	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div[1]/div/header/span/h2/strong"), "Combos"));
    
      	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div[1]/div/header/span/h2/strong")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
          	wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div[1]/div/header/span/h2/strong"), "Combos"));
     	}
    }
    
    @And ("confirma consulta simulador 3P TD")
    public void acessarMenu3pSimulador() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a"))));

        Actions act2=new Actions(driver); 	
    	act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a"))).click().build().perform();
    }
    
    @When ("modal de consulta cobertura informa dados simulador 3P TD")
    public void informaDados3pSimuladorTD()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));

    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Nathalia Lopes Canziani");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-3223");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88020-300");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("950");
    }
    
    @And ("na modal clica em Consultar simulador 3P TD")
    public void receberLigacao3pSimuladorTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("valida botao simulador 3P TD")
    public void compra3pSimuladorTD() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[1]"))));
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }   
    
    @And ("informa banda larga simulador 3P TD")
    public void bandaLarga3pSimuladorTD() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[3]/div/div/div/button"))));
    	
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[3]/div/div/div/button")).click();
    } 
    
    @And ("informa TV simulador 3P TD")
    public void TV3pSimulador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 200);
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button"))));
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button")).click();
    }
    
    @And ("informa adicionais TV simulador 3P TD")
    public void Adicionais3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("btn-outline-gray"))));
    	
    	driver.findElement(By.className("btn-outline-gray")).click();
    }
    
    @And ("informa Fixa simulador 3P TD")
    public void telefonia3pSimuladorTD() throws InterruptedException {
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[1]/div/div[2]/div[2]/button"))));

    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[1]/div/div[2]/div[2]/button")).click();
    	Thread.sleep(3000);
    }
    
    @When ("cliente informa o pedido simulador 3P TD")
    public void dadosCliente3pSimuladorTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtName"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("06");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("07");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1992");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Lilian Lopes Cazian");

    }
    
    @And ("cliente clica Proximo Passo simulador 3P TD")
    public void botaoProximoPasso13pSimuladorTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    }
     
    @And ("tela Endereco Instalacao clica Proximo Passo simulador 3P TP")
    public void botaoProximoPasso23pSimuladorTD() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("pagamentos informa dados simulador 3P TD")
    public void dadosPagamento3pSimuladorTD() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();
    }
     
    @And ("pagamento clica Finalizar Pedido simulador 3P TD")
    public void botaoProximoPasso33pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("mensagem de sucesso ou erro simulador 3P TD")
    public void messagemSucessoouErro3pSimuladorTD() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C 3P SIMULADOR - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	driver.quit();
    	
    }
    
//-------------------------------------------------//
// COMPRA - LP Oferta Internet Banda Larga - COMBO //
//-------------------------------------------------//
 	
     @And ("acessa pagina LP Oferta BL TD")
     public void acessapaginaLPOfertaBL()  throws InterruptedException {
     	driver.get("https://assine.vivo.com.br/Salvador_BA/oferta/tv-por-assinatura");
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	
     	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
            wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
     	}
     }
     
     @And ("informa botao Assine ja LP Oferta BL TD")
     public void assineJaLPOfertaBL() throws InterruptedException {
     	driver.findElement(By.xpath(".//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button")).click();        	
     }
     
     @When ("modal consulta cobertura informa dados LP Oferta BL TD")
     public void informaDadosLPOfertaBL()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
     	
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("TESTANDO MKT TELEFONICA NOVO");   
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
     	driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("40024-081");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("111");
     }
     
//     @SuppressWarnings("unlikely-arg-type")
     @And ("modal clica em Consultar LP Oferta BL TD")
     public void consultarLPOfertaBL() throws InterruptedException {
     	driver.findElement(By.className("btn-consult")).click();
     	
//     	Thread.sleep(3000);
//    	
//     	if(!driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h1/strong")).equals(driver)){
//     		WebDriverWait wait1 = new WebDriverWait(driver, 200);
//        	wait1.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"), "Assine já"));
//        	
//        	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/article[1]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
//            element1.click();
//            
//            WebDriverWait wait2 = new WebDriverWait(driver, 200);
//        	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
//        	
//        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("TESTANDO MKT COMPRA VIVO");   
//         	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0097");
//        	
//        	driver.findElement(By.className("btn-consult")).click();
//     	} 

     }
          
     @And ("modal pontos adicionais clica em Adicionar LP Oferta BL TD")
     public void btaoAdicionalLPOfertaBL() throws InterruptedException, IOException {
    	 WebDriverWait wait2 = new WebDriverWait(driver, 200);
     	wait2.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div/div//div/section/form/div/div/div/load/div[2]/strong"), "Grátis"));

     	driver.findElement(By.className("btn-consult")).click();
     }
     
     @When ("complete dados do cliente de pedido LP Oferta BL TD")
     public void dadosClienteLPOfertaBL() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
      	
     	driver.findElement(By.id("txtDocumento")).clear();
     	driver.findElement(By.id("txtDocumento")).sendKeys(util.util.gerarCPF());
     	driver.findElement(By.id("txtEmail")).clear();
     	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
     	driver.findElement(By.id("txtFone")).clear();
     	driver.findElement(By.id("txtFone")).sendKeys("4125253233");
     	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
     	driver.findElement(By.id("txtDataDia")).clear();
     	driver.findElement(By.id("txtDataDia")).sendKeys("10");
     	driver.findElement(By.id("txtDataMes")).clear();
     	driver.findElement(By.id("txtDataMes")).sendKeys("12");
     	driver.findElement(By.id("txtDataAno")).clear();
     	driver.findElement(By.id("txtDataAno")).sendKeys("1990");   	
     	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Mae Nova Testando");
     }
     
     @And ("clica em Proximo Passo LP Oferta BL TD")
     public void btaoProximoPasso1LPOfertaBL() throws InterruptedException {
     	driver.findElement(By.className("btn-lg")).click();
     }
     
     @And ("endereco de Instalacao clica em Proximo Passo LP Oferta BL TD")
     public void btaoProximoPasso2LPOfertaBL() throws InterruptedException {
     	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
     	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
     }
     
     @When ("em Pagamentos informa os dados LP Oferta BL TD")
     public void dadosPagamentoLPOfertaBL() throws IOException {
     	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
     	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

     }
     
     @And ("em Pagamento clica em Finalizar Pedido LP Oferta BL TD")
     public void btaoProximoPasso3LPOfertaBL() throws InterruptedException {
     	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
     	
     	Thread.sleep(3000);
     	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
     }
     
     @Then ("mensagem de sucesso ou erro LP Oferta BL TD")
     public void sucessoouErroLPOfertaBL() throws IOException {
     	System.out.println("----------------------------------------------------------------");
     	System.out.println("B2C - LP Oferta Internet Banda Larga - " + driver.getTitle());
     	System.out.println("----------------------------------------------------------------");
     	     	    	
     	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
     	String strng2 = element2.getText();
     	System.out.printf("Número Protocolo: "+ strng2);
     	System.out.println();
     	System.out.println("----------------------------------------------------------------");

    	driver.quit();
     }
 
//---------------------------------------------------------------//
// Realizar C2RC "Nós ligamos para você" - (FSP) - Portal Assine //
//---------------------------------------------------------------//
      	
      @And ("acessa pagina teste C2RC FSP")
      public void acessapagC2RCFSP()  throws InterruptedException {
      	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR");
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a"))));      
      	
      	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
          	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a"))));      
     	}
      }
      
      @And ("valida botao C2RC FSP")
      public void cliquebotaoC2RCFSP() throws InterruptedException {
      	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
      	Thread.sleep(3000);
      	
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
      } 
      
      @When ("modal de consulta cobertura C2RC FSP")
      public void informaDadosC2RCFSP()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
      	
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Jonathan Sobrinho Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41)99623-3696");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("80050-540");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("39");
      }
      
      @And ("clica em Receber Ligacao C2RC FSP")
      public void clicaC2RCFSP() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();
      
      	Thread.sleep(3000);
      }
      
      @Then ("retorno da msg da pag C2RC FSP")
      public void paginaOKC2RCFSP() throws IOException {
      	System.out.println("----------------------------------------------------------------");
      	System.out.println("B2C - Valida C2RC FSP - " + driver.getTitle());
      	System.out.println("----------------------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.className("header-modal"));
      	assertTrue(element2.getText().contains("Obrigado pelo contato"));
      	String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ strng2); 
      	System.out.println();
      	System.out.println("----------------------------------------------------------------");
      		
      	driver.quit();
      }
      
//--------------------------------------------------------------------------//
// Realizar C2RC "Nós ligamos para você" - Teste dois (FSP) - Portal Assine //
//--------------------------------------------------------------------------//      
      
      @And ("acessa pagina teste dois C2RC FSP")
      public void acessapagdoisC2RCFSP()  throws InterruptedException {	
      	driver.navigate().to("https://assine.vivo.com.br/apucarana_PR/combos");
      	
      	WebDriverWait wait = new WebDriverWait(driver, 100);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a"))));      
      	
      	if (driver.findElements(By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a")).size() != 0) { 
      		driver.navigate().refresh();
      		
      		WebDriverWait wait2 = new WebDriverWait(driver, 200);
          	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a"))));      
     	} 
      	
      }
      
      @And ("valida botao dois C2RC FSP")
      public void cliquebotaodoisC2RCFSP() throws InterruptedException {
      	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
      	Thread.sleep(3000);
      	
      	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
      } 
      
      @When ("modal consulta cobertura dois C2RC")
      public void informaDadosdoisC2RCFSP()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));      
        	
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Jonathan Sobrinho Testando");   
      	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41)99623-3696");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("86800-620");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("36");

      }
      
      @And ("clica Receber Ligacao dois C2RC FSP")
      public void clicadoisC2RCFSP() throws InterruptedException {
      	driver.findElement(By.className("btn-consult")).click();

      	WebDriverWait wait1 = new WebDriverWait(driver, 200);
    	wait1.until(ExpectedConditions.textToBe(By.className("header-modal"), "Obrigado pelo contato"));
      }
      
      @Then ("retorno msg da pag dois C2RC FSP")
      public void paginaOKdoisC2RCFSP() throws IOException {
      	System.out.println("----------------------------------------------------------------");
      	System.out.println("B2C - Valida C2RC FSP - " + driver.getTitle());
      	System.out.println("----------------------------------------------------------------");
      	     	    	
      	WebElement element2 = driver.findElement(By.className("header-modal"));
      	assertTrue(element2.getText().contains("Obrigado pelo contato"));

      	String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ strng2);
      	System.out.println();
      	System.out.println("----------------------------------------------------------------");
      		
      	driver.quit();
      }        

//------Valida Consulta Cobertura SP------//   
        
//----------------------------------------//
//Consulta Cobertura - G6_SP_3P_100_gpon  //
//----------------------------------------// 	     
     	     
        @And ("acessa pg de cobertura SP G6")
        public void paginaCoberturaG6()  throws InterruptedException {	
         	driver.navigate().to("https://assine.vivo.com.br/sao-paulo_SP");
         	
         	WebDriverWait wait = new WebDriverWait(driver, 200);
          	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[3]"))));
        
          	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[3]")).size() != 0) { 
          		driver.navigate().refresh();
          		
          		WebDriverWait wait2 = new WebDriverWait(driver, 200);
              	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[3]"))));
         	}
        }
        
        @And ("seleciona opcao de combo SP G6")
        public void acessarMenuCoberturaG6() throws InterruptedException { 	
        	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        	Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
        	act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
        }
        
        @When ("na modal de consulta cobertura SP G6")
        public void consultaCoberturaG6()  throws IOException {
        	WebDriverWait wait = new WebDriverWait(driver, 200);
          	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
        	
          	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Maria Santos Testando");   
         	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("01510-001");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("729");
        }
        
        @And ("seleciona botao consultar SP G6")
        public void consultaG6() throws InterruptedException {
          	driver.findElement(By.className("btn-consult")).click();
        	
         	WebDriverWait wait = new WebDriverWait(driver, 200);
         	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
        }
        
        @Then ("valida retorno de sucesso ou erro SP G6")
        public void retornoSucessoouErroG6() throws IOException {
        	System.out.println("----------------------------------------------");
          	System.out.println("B2C - Consulta Cobertura - (G6_SP_3P_100_gpon)");
          	System.out.println("----------------------------------------------");
          	     	    	
       	    WebElement element2 = driver.findElement(By.id("btnLinkMonte"));
        	assertTrue(element2.getText().contains("Monte sua oferta"));

        	System.out.printf("Resultado: "+ driver.getTitle());
        	System.out.println();
        	System.out.println("----------------------------------------------");
        	
//          	util.util.logPrint("Valida Consulta Cobertura SP G6");
        	
        	driver.quit();
        }   
      
//----------------------------------------//
// Consulta Cobertura - Defaut SP         //
//----------------------------------------//
   	     
     @And ("acessa pg de cobertura SP Defaut")
     public void paginaCoberturaDefaut()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/bocaina_SP");

            WebDriverWait wait = new WebDriverWait(driver, 200);
          	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[3]"))));
          	
          	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[3]")).size() != 0) { 
          		driver.navigate().refresh();
          		
          		WebDriverWait wait2 = new WebDriverWait(driver, 200);
              	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[3]"))));
         	}
     }
     
     @And ("seleciona opcao de combo SP Defaut")
     public void acessarMenuCoberturaDefaut() throws InterruptedException { 	
         	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        	Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
     	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
     }
     
     @When ("na modal de consulta cobertura SP Defaut")
     public void consultaCoberturaDefaut()  throws InterruptedException {
        	WebDriverWait wait = new WebDriverWait(driver, 200);
          	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
       	
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Mario Neto Testando");   
        	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0001");
            driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("17240-000");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("474");     
     }
     
     @And ("seleciona botao consultar SP Defaut")
     public void consultaDefaut() throws InterruptedException {
       	driver.findElement(By.className("btn-consult")).click();
       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	Thread.sleep(3000);
     	
       	WebDriverWait wait = new WebDriverWait(driver, 200);
       	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("btnLinkMonte"))));
     }
     
     @Then ("valida retorno de sucesso ou erro SP Defaut")
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
     

//----------------------------------//
// Realiza acesso CHAT ORACLE - B2C //
//---- -----------------------------//
     	     
       @And ("acessa pg de home FSP Chat")
       public void paginaHomeChat()  throws InterruptedException {	
            driver.navigate().to("https://assine.vivo.com.br/curitiba_PR");

            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            	
           	if (driver.findElements(By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img")).size() != 0) { 
           		driver.navigate().refresh();
            		
           		WebDriverWait wait2 = new WebDriverWait(driver, 200);
               	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"header\"]/div/section[2]/div/div[2]/a/picture/img"))));
            }
       }
       
       @And ("seleciona opcao de Compre pelo chat")
       public void acessarCtaChat() throws InterruptedException { 	
           	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
          	Thread.sleep(3000);

            Actions act2=new Actions(driver); 	
       	    act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
       }
       
       @And ("na modal seleciona chat Oracle")
       public void selecionaChatOracle()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/div/div[1]/h2/strong"), "O que você deseja?"));
        	
         	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/section/div/div[2]/atom-button[1]/a")).click();
       }
       
       @When ("na modal informa Cep e numero chat")
       public void modalConsultaCoberturaChat()  throws InterruptedException {
    	    WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div[2]/section/section/div[1]/div//div/section/header/h2/strong"), "Onde você está?"));
         	
          	driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82900320");
            driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("66");     
       }
       
       @And ("seleciona botao consultar Chat")
       public void consultaChat() throws InterruptedException {
         	driver.findElement(By.className("btn-consult")).click();
         	
     	    Thread.sleep(10000);         	
       }
       
       @And ("modal informa dados para acesso ao chat")
       public void dadosAcessoChat() throws InterruptedException {

//    	   WebDriverWait wait = new WebDriverWait(driver,200);
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
       
       @Then ("valida acesso chat oracle")
       public void validaAcessoChatOracle() throws IOException {
    	    System.out.println("---------------------------------------");
        	System.out.println("      Testando acesso Chat Oracle      ");
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
	       	
	        //Inclui resposta ao atendente e fechao chat
        	driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys("Olá! Estamos realizando alguns testes pelo canal MKT Digital da Vivo. Obrigado pela atenção!");
        	driver.findElement(By.id("rn_ChatPostMessageCustom_14_Input")).sendKeys(Keys.ENTER);
//       	driver.findElement(By.id("rn_ChatSendButton_11_Button")).click();
        
            driver.close();
            driver.switchTo().window(winHandleBefore);
        	
        	driver.quit(); 
       }        
     
}