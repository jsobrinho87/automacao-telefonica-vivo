package testesdiarios;

import cucumber.api.java.en.Given;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import util.util;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestediariosSteps {
	
	private WebDriver driver;
//	private util util;
	public static final int TIMEOUT_SEGUNDO = 15;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre pg do navegador TD")
    public void bussolaTD()  throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
//    	util.waitForRequests(100,TIMEOUT_SEGUNDO);
    }	

//----------------------------------------------------//
// Apresenta as página de testes                      //
//----------------------------------------------------//
     	
     @And ("acessa pagina cb 3P")
     public void acessapaginaCombo3()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/porto-alegre_RS/combos");
    	
//    	util.waitForRequests(100,TIMEOUT_SEGUNDO);

    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
     
     @And ("acessa pagina Banda Larga")
     public void acessapaginaBL()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/salvador_BA/banda-larga");
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
     
     @And ("acessa pagina Fixa")
     public void acessapaginaFixa()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/francisco-beltrao_PR/telefonia");
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
     
     @And ("acessa pagina TV")
     public void acessapaginaTV()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/Paranavai_PR/tv-por-assinatura");
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
     
     @And ("acessa pagina Simulador 3P")
     public void acessapaginaSimu3()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/Florianopolis_SC");
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
     
     @And ("acessa pagina LP BL")
     public void acessapgLPBL()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/jaragua-do-sul_PR/oferta/internet-banda-larga");
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	driver.quit();
     }
    
//----------------------------------------------------//
// Realizar pedido de compra combo 3P - Portal Assine //
//----------------------------------------------------//
    	
    @And ("acessa pagina combo 3P TD")
        public void acessapaginaCombo3P()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/porto-alegre_RS/combos");
    }
    
    @And ("informa opcao de combo 3P TD")
    public void menucomboTD() throws InterruptedException {
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

    }
    
    @And ("modal de Identificacao clica em Receber Ligacao TD")
    public void receberLigacaocomboTD() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
     	Thread.sleep(8000);
    }
    
    @And ("modal de Identificacao clica em Adicionar TD")
    public void btaoAdicionalcomboTD() throws InterruptedException, IOException {
//    	WebDriverWait wait1 = new WebDriverWait(driver, 200);
//    	wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("spinner")));
    	    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div/div//div//section/form/div//button")).click();

    }
    
    @When ("tela dados do cliente complete o pedido TD")
    public void dadosClientecomboTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtDocumento")));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("27243069290");
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
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	
    	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
    	String strng9 = element9.getText();
    	System.out.printf("Plano TV por Assinatura: "+ strng9);
    	System.out.println();
    	
    	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[5]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\01-Teste-messageSucessoouErro-3PCombo.jpg"));
    	
    	driver.quit();
    	
    }

//-------------------------------------------------------------//
//Realizar pedido de compra avulso Banda Larga - Portal Assine //
//-------------------------------------------------------------//
    
    @And ("acessa pg de Avulso BL TD")
    public void pgAvulsoBLTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/salvador_BA/banda-larga");
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("informa opcao de Avulso BL TD")
    public void menuAvulsoBLTD() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"));
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
    	
    	Actions act=new Actions(driver);   	
    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    @When ("completa o pedido Avulso BL TD")
    public void dadosClienteAvulsoBLTD() throws IOException { 
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("79235273005");
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
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\02-Teste-messageSucessoouErro-2PCombo.jpg"));
    	
    	driver.quit();
    }

//----------------------------------------------------------------//
// Realiza pedido de compra Avulso Telefonia Fixa - Portal Assine //
//----------------------------------------------------------------//
    
    @And ("acessa pg de Avulso Fixa TD")
    public void pgAvulsoFixaTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/francisco-beltrao_PR/telefonia?cid=M3");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("informa opcao de Avulso Fixa TD")
    public void avulsoFixaTD() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"));
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
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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
    	driver.findElement(By.id("txtDocumento")).sendKeys("45412883893");
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
    	
    	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\03-Teste-messageSucessoouErro-2PCombo.jpg"));
    	
    	driver.quit();
    	
    }
    
//-------------------------------------------------------------------//
// Realiza pedido de compra Avulso TV por assinatura - Portal Assine //
//-------------------------------------------------------------------//
    
    @And ("acessa pg de Avulso TV TD")
    public void pgAvulsoTVTD()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/Paranavai_PR/tv-por-assinatura");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("acessa opcao de Avulso TV TD")
    public void acessaMenuAvulsoTVTD() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("modal de consulta cobertura dados do Cliente Avulso TV TD")
    public void dadosAvulsoTVTD()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Regina auxiliadora de Amorim");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0098");
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
    	driver.findElement(By.id("txtDocumento")).sendKeys("24015299000");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125250090");
    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("13");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("02");
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
    	
    	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng9 = element9.getText();
    	System.out.printf("Plano TV por Assinatura: "+ strng9);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\04-Teste-messageSucessoouErro-2PCombo.jpg"));
    	
    	driver.quit();
    }
 
//--------------------------------------------------------//
// Realizar pedido de compra simulador 3P - Portal Assine //
//--------------------------------------------------------//    
    
    @And ("acessa pg simulador 3P TD")
    public void pg3pSimuladorTD()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/Florianopolis_SC");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[1]/div/div/div/div/div/div[2]/div/atom-button/a"))));
    }
    
    @And ("confirma consulta simulador 3P TD")
    public void acessarMenu3pSimulador() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);

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
    	Thread.sleep(3000);
    	
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
    
    @And ("informa TV por Assinatura simulador 3P TD")
    public void TV3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button"))));
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button")).click();
    }
    
    @And ("informa pontos adicionais TV simulador 3P TD")
    public void Adicionais3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("btn-outline-gray"))));
    	driver.findElement(By.className("btn-outline-gray")).click();
    }
    
    @And ("informa Telefonia simulador 3P TD")
    public void telefonia3pSimuladorTD() throws InterruptedException {
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button"))));
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button")).click();
    }
    
    @When ("cliente informa o pedido simulador 3P TD")
    public void dadosCliente3pSimuladorTD() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("16739755345");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
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
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	
    	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
    	String strng9 = element9.getText();
    	System.out.printf("Plano TV por Assinatura: "+ strng9);
    	System.out.println();
    	
	 	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[5]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\05-Teste-messageSucessoouErro-3pSimulador.jpg"));
    	
    	driver.quit();
    	
    }
    
//----------------------------------------//
// LP Oferta Internet Banda Larga - COMBO //
//----------------------------------------//
 	
     @And ("acessa pagina LP Oferta BL TD")
     public void acessapaginaLPOfertaBL()  throws InterruptedException {
     	driver.navigate().to("https://assine.vivo.com.br/jaragua-do-sul_PR/oferta/internet-banda-larga");
     	
     	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"))));
     }
     
     @And ("informa botao Assine ja LP Oferta BL TD")
     public void assineJaLPOfertaBL() throws InterruptedException {
     	driver.findElement(By.xpath(".//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[2]/atom-button/button")).click();        	
     }
     
     @When ("modal consulta cobertura informa dados LP Oferta BL TD")
     public void informaDadosLPOfertaBL()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
     	
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("TESTANDO MKT DA VIVO NOVO");   
     	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-2636");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("89251-010");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("117");
     }
     
     @And ("modal clica em Consultar LP Oferta BL TD")
     public void consultarLPOfertaBL() throws InterruptedException {
     	driver.findElement(By.className("btn-consult")).click();
//     	Thread.sleep(6000);
     }
          
     @And ("modal pontos adicionais clica em Adicionar LP Oferta BL TD")
     public void btaoAdicionalLPOfertaBL() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
       	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("btn-consult")))); 
    	 
     	driver.findElement(By.className("btn-consult")).click();
     }
     
     @When ("complete dados do cliente de pedido LP Oferta BL TD")
     public void dadosClienteLPOfertaBL() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
      	
     	driver.findElement(By.id("txtDocumento")).clear();
     	driver.findElement(By.id("txtDocumento")).sendKeys("52896048049");
     	driver.findElement(By.id("txtEmail")).clear();
     	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
     	driver.findElement(By.id("txtFone")).clear();
     	driver.findElement(By.id("txtFone")).sendKeys("4125253233");
     	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
     	driver.findElement(By.id("txtDataDia")).clear();
     	driver.findElement(By.id("txtDataDia")).sendKeys("07");
     	driver.findElement(By.id("txtDataMes")).clear();
     	driver.findElement(By.id("txtDataMes")).sendKeys("12");
     	driver.findElement(By.id("txtDataAno")).clear();
     	driver.findElement(By.id("txtDataAno")).sendKeys("1999");   	
     	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Mae Maria Testando Novo");

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
     	
     	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
     	String strng8 = element8.getText();
     	System.out.printf("Plano Internet: "+ strng8);
     	System.out.println();
     	
     	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
     	String strng9 = element9.getText();
     	System.out.printf("Plano TV por Assinatura: "+ strng9);
     	System.out.println();
     	
     	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[5]/div[2]/div[1]/ul/li[1]/span"));
     	String strng10 = element10.getText();
     	System.out.printf("Plano Telefonia Fixa: "+ strng10);
     	System.out.println();
     	System.out.println("----------------------------------------------------------------");

     	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Testes\\06-Teste-messageSucessoouErro-3PCombo.jpg"));
     	
     	driver.quit();
     }

//---------------------------------------------------------------------------//
// Verifica disponibilidade de páginas se estão disponiveis no Portal Assine //
//---------------------------------------------------------------------------//

//==> LP Oferta Banda Larga - Nova Iguaçu
     
  @And ("acessa nova pagina LP BL Nova Iguacu")
  public void acessapagnovoLPBLNovaIguacu()  throws InterruptedException {
  	driver.navigate().to("https://assine.vivo.com.br/nova-iguacu_RJ/oferta/internet-banda-larga");
  	
  	WebDriverWait wait = new WebDriverWait(driver, 200);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[4]/div[2]/div[2]/div[1]/div/strong[2]"))));
  }
  
  @Then ("retorno da msg de LP Oferta BL Nova Iguacu")
  public void paginaOKLPOfertaBLNovaIguacu() throws IOException {
  	System.out.println("----------------------------------------------------------------");
  	System.out.println("B2C - Nova Iguaçu RJ - LP " + driver.getTitle());
  	System.out.println("----------------------------------------------------------------");
  	     	    	
  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[1]/div[2]/div/div[1]/h5"));
  	String strng2 = element2.getText();
  	System.out.printf("Resultado: "+ strng2);
  	System.out.println();
  	
  	WebElement element15 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[2]/div[3]/div/div[1]/h4/strong"));
  	String strng3 = element15.getText();
  	System.out.printf("Resultado: "+ strng3);
  	System.out.println();
  	
  	WebElement element16 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[3]/div[2]/div/div[1]/h4/strong"));
  	String strng4 = element16.getText();
  	System.out.printf("Resultado: "+ strng4);
  	System.out.println();
  	System.out.println("----------------------------------------------------------------");
  		
  	driver.quit();
  	
  }

//==> LP Oferta Banda Larga - Palhoça
  
  @And ("acessa nova pagina LP BL Palhoca")
  public void acessapagnovoLPBLpalhoca()  throws InterruptedException {
  	driver.navigate().to("https://assine.vivo.com.br/palhoca_SC/oferta/internet-banda-larga?s_cid=saz_CA_pesq_goo_SZ000479_GVT-Power_BL_saz_cpc");

  	WebDriverWait wait = new WebDriverWait(driver, 200);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li/div/picture/img"))));
  }
  
  @Then ("retorno da msg de LP Oferta BL Palhoca")
  public void paginaOKLPOfertaBLpalhoca() throws IOException {
  	System.out.println("----------------------------------------------------------------");
  	System.out.println("B2C - Palhoça SC - LP " + driver.getTitle());
  	System.out.println("----------------------------------------------------------------");
  	     	    	
  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[6]/div/article[1]/div/div[1]/div[2]/div/div[1]/h5"));
  	String strng2 = element2.getText();
  	System.out.printf("Resultado: "+ strng2);
  	System.out.println();
  	
  	WebElement element15 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[6]/div/article[1]/div/div[2]/div[2]/div/div[1]/h4/strong"));
  	String strng3 = element15.getText();
  	System.out.printf("Resultado: "+ strng3);
  	System.out.println();
  	
  	WebElement element16 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[6]/div/article[1]/div/div[3]/div[2]/div/div[1]/h4/strong"));
  	String strng4 = element16.getText();
  	System.out.printf("Resultado: "+ strng4);
  	System.out.println();
  	System.out.println("----------------------------------------------------------------");
  	
  	driver.quit();
  	
    }
  	
//==> LP Oferta Banda Larga - Paranavai
    
    @And ("acessa nova pagina LP BL Paranavai")
    public void acessapagnovoLPBLParanavai()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/paranavai_PR/oferta/internet-banda-larga?gclid=CLSlmb628dECFQgGkQodf90IyA&utm_source=google&utm_medium=paid-search&utm_campaign=vivo-fibra-fsp:performance:cadastra&utm_content=ros:prospect:none:text-link:cpc:bl:desktop&utm_term=internetvivoamplag7&ef_id=WJMiVAAAACfy3alp:20170202123551:s");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li/div/div/div/div/div/div[2]/div/atom-button/a"))));
    }
    
    @Then ("retorno da msg de LP Oferta BL Paranavai")
    public void paginaOKLPOfertaBLParanavai() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - Paranavai SC - LP " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	     	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[1]/div[2]/div/div[1]/h5"));
    	String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ strng2);
    	System.out.println();	
    	
    	WebElement element15 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[2]/div[3]/div/div[1]/h4/strong"));
    	String strng3 = element15.getText();
    	System.out.printf("Resultado: "+ strng3);
    	System.out.println();
    	
    	WebElement element16 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[4]/div/article/div/div[3]/div[2]/div/div[1]/h4/strong"));
    	String strng4 = element16.getText();
    	System.out.printf("Resultado: "+ strng4);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	driver.quit();	
  }
    
//==> Página Promo 100 Mega - Institucional GVT Localidades Exata
    
    @And ("acessa nova pagina promo mobile 100 mega")
    public void acessapagpromomobile100mega()  throws InterruptedException {
    	driver.navigate().to("http://www.promo.vivofibra.com.br/oferta100mega/promo100mega/mobile.html?utm_source=google&utm_medium=paid-search&utm_campaign=vivo-fibra-sp%3Aperformance%3Acadastra&utm_content=ros%3Aprospect%3Asp%3Atext-link%3Acpc%3Ainst%3Amobile&utm_term=CA_B2C-Fixa_SP-Premium_Search_Mobile_Institucional_GVT_Performance:Institucional_GVT_Localidades_Exata");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"internet_fibra\"]/div[2]/div/div/a/span"))));
    }
    
    @Then ("retorno da msg da promo mobile 100 mega")
    public void paginaOKpromomobile100mega() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - Promo 100 mega Institucional GVT Localidades Exata - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	     	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[1]/div[2]/p[1]"));
    	String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ strng2);
    	System.out.println();
    	
    	WebElement element15 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[2]/div[2]/div/p[1]"));
    	String strng3 = element15.getText();
    	System.out.printf("Resultado: "+ strng3);
    	System.out.println();
    	
    	WebElement element16 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[3]/div[2]/p"));
    	String strng4 = element16.getText();
    	System.out.printf("Resultado: "+ strng4);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    		
    	driver.quit();
    }    
    
//==> Página Promo TV fibra
    
    @And ("acessa nova pagina promo TV fibra")
    public void acessapagpromovivofibra()  throws InterruptedException {
    	driver.navigate().to("http://www.promo.vivofibra.com.br/tv-fibra/mobile/mobile.html?utm_source=google&utm_medium=paid-search&utm_campaign=vivo-fibra-sp%3Aperformance%3Acadastra&utm_content=ros%3Aprospect%3Asp%3Atext-link%3Acpc%3Atv%3Amobile&utm_term=CA_B2C-Fixa_SP-Premium_Search_Mobile_TV_Sem-Marca_Performance:TV-por-Assinatura_Ampla-Modificada");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"internet_fibra\"]/div[3]/div/a/span"))));
    }
    
    @Then ("retorno da msg da promo TV fibra")
    public void paginaOKpromoTVfibra() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - Promo TV por Assinatura - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	     	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[1]/div[2]/p[1]"));
    	String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ strng2);
    	System.out.println();
    	
    	WebElement element15 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[2]/div[2]/div/p[1]"));
    	String strng3 = element15.getText();
    	System.out.printf("Resultado: "+ strng3);
    	System.out.println();
    	
    	WebElement element16 = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div[2]/div[1]/div[3]/div[2]/p"));
    	String strng4 = element16.getText();
    	System.out.printf("Resultado: "+ strng4);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    		
    	driver.quit();
    }   
    
//==> Página Promo 100 mega - Internet Contratar Exata
    
    @And ("acessa nova pag promo inter contratar exata")
    public void acessapaginternetcontratarexata()  throws InterruptedException {
    	driver.navigate().to("http://www.promo.vivofibra.com.br/oferta100mega/?utm_source=google&utm_medium=paid-search&utm_campaign=vivo-fibra-sp%3Aperformance%3Acadastra&utm_content=ros%3Aprospect%3Asp%3Atext-link%3Acpc%3Abl%3Adesktop&utm_term=CA_B2C-Fixa_SP-Premium_Search_Desktop_Banda-Larga-Internet_Sem-Marca_Performance:Internet_Contratar_Exata");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"tab3\"]/div[1]/div[3]/div/a"))));
    }
    
    @Then ("retorno da msg da promo inter contratar exata")
    public void paginaOKinternetcontratarexata() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - Promo 100 mega Internet Contratar Exata - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	     	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"section-cards\"]/div/h2"));
    	String strng2 = element2.getText();
    	System.out.printf("Resultado: "+ strng2);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    		
    	driver.quit();
    }   
    
//==> Acessa Página Vivo TV
    
    @And ("acessa nova pag Vivo TV")
    public void acessapagvivoTV()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR");
    	Thread.sleep(3000);
    	driver.navigate().to("http://www.vivotv.com.br/assine");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("modal-cep-name"))));
    }
    
    @When ("modal de consulta cobertura Vivo TV")
    public void dadosvivoTV()  throws IOException {
    	driver.findElement(By.id("modal-cep-name")).sendKeys("Jonathan Sobrinho Testando");   
    	driver.findElement(By.id("modal-cep-phone")).sendKeys("(41)2525-3200");
        driver.findElement(By.id("cep")).sendKeys("80050-540");
        driver.findElement(By.id("numero")).sendKeys("39");

    }
    
    @And ("clique de Identificacao modal Vivo TV")
    public void cliquemodalvivoTV() throws InterruptedException {
    	driver.findElement(By.className("ico-cep-enviar")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @Then ("retorno da msg da pag simulador Vivo TV")
    public void paginaOKvivoTV() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - Página Vivo TV - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	     	    	
    	WebElement element2 = driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/section/section/header[1]/div/div/h1/strong"));
      	assertTrue(element2.getText().contains("Escolha um combo ou monte o seu!"));

      	String strng2 = element2.getText();
      	System.out.printf("Resultado: "+ strng2);
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

      	WebDriverWait wait = new WebDriverWait(driver, 200);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("modal-wrapper-content"))));
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
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
      	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[2]/div/div/div/div/div/div[2]/div/atom-button/a"))));      
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
      	
      	WebDriverWait wait = new WebDriverWait(driver, 200);
     	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("modal-wrapper-content"))));
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
}