package release;

import cucumber.api.java.en.Given;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
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

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestesregressaoSteps {
	
	WebDriver driver;
	
//----------------------------------------------------//
// Carrega o navegador                                //
//----------------------------------------------------//
	
    @Given ("abre uma nova pagina do navegador")
    public void bussolaTG()  throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    	driver = new ChromeDriver();   
    	driver.manage().window().maximize();
    }
    
//-----//
// B2C //
//-----//    
//----------------------------------------------------//
//    Verifica disponibilidade as página de testes    //
//----------------------------------------------------//
 	     	
 	     @And ("acessa pg cb 3P regressao")
 	     public void acessapaginaCombo3PTG()  throws InterruptedException {
 	    	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR/combos");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	 	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"))));
 	    	  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
 	    	String strng = element.getText();
 	    	System.out.println("----------------------------------------------------------------");
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Banda Larga + TV por Assinatura + Telefonia Fixa", strng); 
 	    	System.out.println("Página: " + driver.getTitle());;
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg cb 2P regressao")
 	     public void acessapaginaCombo2PTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/blumenau_SC/combos");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));;
 	    	  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"comb-3in1\"]/div/div/h1/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Banda Larga + TV por Assinatura + Telefonia Fixa", strng); 
 	    	System.out.println("Página: " + driver.getTitle());;
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg Banda Larga regressao")
 	     public void acessapaginaBLTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/salvador_BA/banda-larga");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    		  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[7]/div/div/div[1]/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Experimente a Banda Larga de Ultravelocidade com Vivo Fibra", strng); 
 	    	System.out.println("Página: " + driver.getTitle());;
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg Fixa regressao")
 	     public void acessapaginaFixaTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/niteroi_PR/telefonia?cid=M3");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    		  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/header/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Fixo + Móvel Local", strng); 
 	    	System.out.println("Página: " + driver.getTitle());
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg TV regressao")
 	     public void acessapaginaTVTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/francisco-beltrao_PR/tv-por-assinatura?cid=M4");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    		    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/header/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Ultra HD", strng); 
 	    	System.out.println("Página: " + driver.getTitle());
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg Simulador 3P regressao")
 	     public void acessapaginaSimu3PTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/Florianopolis_SC");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    	  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/footer/section[1]/div/div/div[1]/ul/li/span"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Home", strng); 
 	    	System.out.println("Página: " + driver.getTitle());
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg fixa dois regressao")
 	     public void acessapaginaFixadoisTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/natal_RN/telefonia");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    		    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/header/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Fixo + Móvel Local", strng); 
 	    	System.out.println("Página: " + driver.getTitle());
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	     
 	     @And ("acessa pg Simulador 2P regressao")
 	     public void acessapaginaSimu2PTG()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/Fortaleza_CE");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    		  	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/footer/section[1]/div/div/div[1]/ul/li/span"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Home", strng); 
 	    	System.out.println("Página: " + driver.getTitle());
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	
 	     @And ("acessa pg simu 2P regressao B2B")
 	     public void acessapgSimu2PTGB2B()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/porto-alegre_RS/empresas/pequenas-e-medias/combos");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Internet + Telefone Fixo", strng); 
 	    	System.out.println("Página: " + driver.getTitle());;
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }
 	
 	     @And ("acessa pg cb 3P regressao B2B")
 	     public void acessapgcombo3PTGB2B()  throws InterruptedException {	
 	    	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR/empresas/pequenas-e-medias/combos");
 	    	WebDriverWait wait = new WebDriverWait(driver, 200);
 	    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
 	    	
 	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/header[1]/div/div/h2/strong"));
 	    	System.out.println("----------------------------------------------------------------");
 	    	String strng = element.getText();
 	    	System.out.println(strng);
 	    	Assert.assertEquals("Internet + Telefone Fixo", strng); 
 	    	System.out.println("Página: " + driver.getTitle());;
 	    	System.out.println("----------------------------------------------------------------");
 	    	
 	    	driver.quit();
 	     }     
 	     
//--------------------------//
// Combo 3P - Portal Assine //
//--------------------------// 	     
 	     
    @And ("acessa pagina de combo 3P")
    public void paginaCombo3P()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR/combos");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));
    }
    
    @And ("seleciona opcao de combo 3P")
    public void acessarMenu() throws InterruptedException { 	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button")));
    
    	WebElement element1 = driver.findElement(By.xpath(".//*[@id='comb-3in1']/../section[1]/div/article[2]/div[1]/div[4]/div[2]/div[2]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("na modal de consulta cobertura informa os dados do Cliente")
    public void informaDados()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Armindo Monteiros Tes");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-2636");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("82900-320");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("66");
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\01-Teste-informaDados-3PCombo.jpg"));
    }
    
    @And ("na modal de Identificacao clica em Receber Ligacao")
    public void receberLigacao() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	Thread.sleep(10000);
    }
    
    @And ("na modal de Identificacao clica em Adicionar")
    public void botaoAdicional() throws InterruptedException, IOException {
     	driver.findElement(By.className("btn-consult")).click();
    }
    
    @When ("na tela dados do cliente complete o pedido")
    public void dadosCliente() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtDocumento")));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("80636929930");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\02-Teste-dadosCliente-3PCombo.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("12");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("07");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1960");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Maria Tomazia Marquess");

    }
    
    @And ("na tela dados do cliente clica em Proximo Passo")
    public void botaoProximoPasso1() throws IOException {
    	driver.findElement(By.className("btn-lg")).click();
    	
    }
    
    @And ("na tela Endereco de Instalacao clica em Proximo Passo")
    public void botaoProximoPasso2() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("na tela de Pagamentos informa os dados")
    public void dadosPagamento() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\03-Teste-dadosPagamento-3PCombo.jpg"));

    }
    
    @And ("na tela de Pagamento clica em Finalizar Pedido")
    public void botaoProximoPasso3() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("na tela sera exibida mensagem de sucesso ou erro")
    public void messagemSucessoouErro() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C 3P COMBO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
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
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\04-Teste-messageSucessoouErro-3PCombo.jpg"));
    	
    	driver.quit();
    	
    }

//--------------------------//   
// Combo 2P - Portal Assine //
//--------------------------//   
    
    @And ("acessa pagina de combo 2P")
    public void paginaCombo2P()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/blumenau_SC/combos");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("menu-content"))));       
    }
    
    @And ("seleciona opcao de combo 2P")
    public void acessarMenu2pCombo() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/article[3]/div[1]/div[3]/div[2]/div[2]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("na modal de consulta cobertura dados do Cliente - combo 2P")
    public void informaDados2pCombo()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Guauco Canziani");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-3223");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("89010-904");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("2");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\05-Teste-informaDados-2PCombo.jpg"));
    }
    
    @And ("na modal de Identifica clica em Receber Ligacao - combo 2P")
    public void receberLigacao2pCombo() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    }
    
    
    @When ("cliente complete o pedido - combo 2P")
    public void dadosCliente2pCombo() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtDocumento")));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("22704022860");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\06-Teste-dadosCliente-2PCombo.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("05");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("07");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1960");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Angela Marias Canzian");
    }
    
    @And ("cliente clica em Proximo Passo - combo 2P")
    public void botaoProximoPasso12pCombo() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    }
    
    @And ("na tela Endereco Instalacao clica Proximo Passo - combo 2P")
    public void botaoProximoPasso22pCombo() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("em Pagamentos informa os dados combo 2P")
    public void dadosPagamento2pCombo() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\08-Teste-dadosPagamento-2PCombo.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido combo 2P")
    public void botaoProximoPasso32pCombo() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("na tela mensagem de sucesso ou erro - combo 2P")
    public void messagemSucessoouErro2pCombo() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C 2P COMBO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	
	 	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\08-Teste-messageSucessoouErro-2PCombo.jpg"));
    	
    	driver.quit();
    	
    }

//-----------------------------//   
// Banda larga - Portal Assine //
//-----------------------------//   
    
    @And ("acessa pagina de Avulso BL")
    public void paginaAvulsoBL()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/salvador_BA/banda-larga");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("seleciona card de Avulso BL")
    public void cardAvulsoBL() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/div/ul/li[2]/article[1]/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();      
    }
    
    @When ("na modal de consulta cobertura dados do Cliente - Avulso BL")
    public void consultaAvulsoBL()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Eunice de Amorimi Marquess");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-3200");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("41740-170");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("45");
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\09-Teste-informaDados-BandaLarga.jpg"));
    }
    
    @And ("na modal de Identifica clica em Receber Ligacao - Avulso BL")
    public void receberLigacaoAvulsoBL() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("seleciona botao montar internet avulsa BL")
    public void botaoComprarInternetAvulsoBL() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	
    	Thread.sleep(3000);

        Actions act=new Actions(driver); 	
    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();    	
    }
    
    @When ("cliente complete o pedido - Avulso BL")
    public void dadosClienteAvulsoBL() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("77427739531");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\10-Teste-dadosCliente-BandaLarga.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("25");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("05");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1938");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Nair Viera de Amorim");
    }	
    
    @And ("cliente clica em Proximo Passo - Avulso BL")
    public void botaoProximoPasso1AvulsoBL() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    }
        
    @And ("na tela Endereco Instalacao clica Proximo Passo - Avulso BL")
    public void botaoProximoPasso2AvulsoBL() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("em Pagamentos informa os dados Avulso BL")
    public void dadosPagamentoAvulsoBL() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\11-Teste-dadosPagamento-BandaLarga.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido Avulso BL")
    public void botaoProximoPasso3AvulsoBL() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    
    @Then ("na tela mensagem de sucesso ou erro - Avulso BL")
    public void messagemSucessoouErroAvulsoBL() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C BANDA LARGA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\12-Teste-messageSucessoouErro-BandaLarga.jpg"));
    	
    	driver.quit();
    }

//--------------------------------//
// Telefonia Fixa - Portal Assine //
//--------------------------------//    
    
    @And ("acessa pagina de Avulso Fixa")
    public void paginaAvulsoFixa()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/niteroi_PR/telefonia?cid=M3");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("seleciona opcao de Avulso Fixa")
    public void acessarMenuAvulsoFixa() throws InterruptedException {    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("na modal de consulta cobertura dados do Cliente - Avulso Fixa")
    public void informaDadosAvulsoFixa()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Regina auxiliadora de Amorim marques");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0098");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("24360-022");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("61");
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\13-Teste-informaDados-TelefoniaFixa.jpg"));
    }
    
    @And ("na modal de Identifica clica em Receber Ligacao - Avulso Fixa")
    public void receberLigacaoAvulsoFixa() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("seleciona botao comprar internet avulsa Fixa")
    public void botaoComprarInternetAvulsoFixa() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(3000);
    	
    	Actions act4=new Actions(driver);   	
    	act4.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    }
    
    
    @When ("cliente complete o pedido - Avulso Fixa")
    public void dadosClienteAvulsoFixa() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("98098915042");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinh87@hotmail.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125250020");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\14-Teste-dadosCliente01-TelefoniaFixa.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("31");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("03");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1956");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Eunice de amorim marques");
    }
    
    @And ("cliente clica em Proximo Passo - Avulso Fixa")
    public void botaoProximoPasso1AvulsoFixa() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    }
    
    @And ("na tela Endereco Instalacao clica Proximo Passo - Avulso Fixa")
    public void botaoProximoPasso2AvulsoFixa() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("em Pagamentos informa os dados Avulso Fixa")
    public void dadosPagamentoAvulsoFixa() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\15-Teste-dadosPagamento-TelefoniaFixa.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido Avulso Fixa")
    public void botaoProximoPasso3AvulsoFixa() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    
    @Then ("na tela mensagem de sucesso ou erro - Avulso Fixa")
    public void messagemSucessoouErroAvulsoFixa() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - TELEFONIA FIXA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\16-Teste-messageSucessoouErro-TelefoniaFixa.jpg"));
    	
    	driver.quit();
    	
    }

//-----------------------------------// 
// TV por Assinatura - Portal Assine //
//-----------------------------------//   
    
    @And ("acessa pagina de Avulso TV")
    public void paginaAvulsoTV()  throws InterruptedException {	
    	driver.navigate().to("https://assine.vivo.com.br/francisco-beltrao_PR/tv-por-assinatura?cid=M4");

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"secCards\"]/div/div/div/article[2]/div[1]/div[4]/div[2]/atom-button/button"))));
    }
    
    @And ("seleciona opcao de Avulso TV")
    public void acessarMenuAvulsoTV() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }
    
    @When ("na modal de consulta cobertura dados do Cliente - Avulso TV")
    public void informaDadosAvulsoTV()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input"))));
    	
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Wilson jose lodovico");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0009");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("85605-450");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("980");
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\17-Teste-informaDados-TV.jpg"));
    }
    
    @And ("na modal de Identifica clica em Receber Ligacao - Avulso TV")
    public void receberLigacaoAvulsoTV() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("seleciona botao comprar internet avulsa TV")
    public void botaoComprarInternetAvulsoTV() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }   
    
    @When ("cliente complete o pedido - Avulso TV")
    public void dadosClienteAvulsoTV() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtDocumento"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("18114512849");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125250090");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\18-Teste-dadosCliente01-TV.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("13");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("02");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1960");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Palmira Maiochi ludovico");
    }
    
    @And ("cliente clica em Proximo Passo - Avulso TV")
    public void botaoProximoPasso1AvulsoTV() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    
    }
    
    @And ("na tela Endereco Instalacao clica Proximo Passo - Avulso TV")
    public void botaoProximoPasso2AvulsoTV() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("em Pagamentos informa os dados Avulso TV")
    public void dadosPagamentoAvulsoTV() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\19-Teste-dadosPagamento-TV.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido Avulso TV")
    public void botaoProximoPasso3AvulsoTV() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("na tela mensagem de sucesso ou erro - Avulso TV")
    public void messagemSucessoouErroAvulsoTV() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C TV POR ASSINATURA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
     	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();

    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();

    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng9 = element9.getText();
    	System.out.printf("Plano TV por Assinatura: "+ strng9);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\20-Teste-messageSucessoouErro-TV.jpg"));
    	
    	driver.quit();
    }

//------------------------------//
// Simulador 3P - Portal Assine //
//------------------------------//
    
    @And ("acessa pagina de simulador 3P")
    public void pagina3pSimulador()  throws InterruptedException {  
    	driver.navigate().to("https://assine.vivo.com.br/Florianopolis_SC");
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section[1]/div/div/ul/li[1]/div/div/div/div/div/div[2]/div/atom-button/a"))));
    }
    
    @And ("seleciona opcao de simulador 3P")
    public void acessarMenu3pSimulador() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
        Actions act2=new Actions(driver); 	
    	act2.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a"))).click().build().perform();
    }
    
    @When ("na modal de consulta cobertura dados do Cliente simulador 3P")
    public void informaDados3pSimulador()  throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")));   
  
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Nathalia Lopes Canziani");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-3223");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("88020-300");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("950");
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\21-Teste-informaDados-3pSimulador.jpg"));
    }
    
    @And ("na modal de Identifica clica em Consultar simulador 3P")
    public void receberLigacao3pSimulador() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();

    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"simulador-assine\"]/section/section/header[1]/div/div/h1/strong"))));
    }
    
    @And ("seleciona botao comprar simulador 3P")
    public void botaoComprar3pSimulador() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    }   
    
    @And ("seleciona banda larga simulador 3P")
    public void bandaLarga3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[3]/div/div/div/button"))));
    	
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[3]/div/div/div/button")).click();
    } 
    
    @And ("seleciona TV por Assinatura simulador 3P")
    public void TV3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button"))));
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[1]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button")).click();
    }
    
    @And ("informa pontos adicionais TV simulador 3P")
    public void telefonia3pSimulador() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("btn-outline-gray"))));
    	
    	driver.findElement(By.className("btn-outline-gray")).click();
    }
    
    @And ("informa Telefonia simulador 3P")
    public void telefonia3pSimuladorTD() throws InterruptedException {
    	WebDriverWait wait2 = new WebDriverWait(driver, 200);
    	wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button"))));
    	
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[4]/div/div/section/div/div/div[3]/div/div[2]/div[2]/button")).click();
    	Thread.sleep(3000);
    }
    
    @When ("cliente complete o pedido - simulador 3P")
    public void dadosCliente3pSimulador() throws IOException {
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("txtName"))));
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("41001414837");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\22-Teste-dadosCliente-3pSimulador.jpg"));

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
    
    @And ("cliente clica em Proximo Passo - simulador 3P")
    public void botaoProximoPasso13pSimulador() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();

    }
     
    @And ("na tela Endereco Instalacao clica Proximo Passo simulador 3P")
    public void botaoProximoPasso23pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stepPagamento\"]/div[1]/div/h3"))));
    }
    
    @When ("em Pagamentos informa os dados simulador 3P")
    public void dadosPagamento3pSimulador() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\23-Teste-dadosPagamento-3pSimulador.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido simulador 3P")
    public void botaoProximoPasso33pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 200);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("na tela mensagem de sucesso ou erro - simulador 3P")
    public void messagemSucessoouErro3pSimulador() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C 3P SIMULADOR - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]"));
    	String strng8 = element8.getText();
    	System.out.printf(strng8);
    	System.out.println();
    	
    	WebElement element9 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
    	String strng9 = element9.getText();
    	System.out.printf(strng9);
    	System.out.println();
    	
	 	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[5]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf(strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\24-Teste-messageSucessoouErro-3pSimulador.jpg"));
    	
    	driver.quit();
    	
    }

//-------------------------------------//
// Telefonia Fixa Dois - Portal Assine //
//-------------------------------------//
    
    @And ("acessa pg de Avulso Fixa Dois")
    public void paginaAvulsoFixa2()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/natal_RN/telefonia");
        Thread.sleep(10000); 
    }
    
    @And ("informar op de Avulso Fixa Dois")
    public void acessarMenuAvulsoFixa2() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
//    	WebDriverWait wait = new WebDriverWait(driver, 30);
//    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"secCards\\\"]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button")));   
   
//      	Actions act=new Actions(driver); 	
//    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a"))).click().build().perform();
//      	
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"secCards\"]/div/div/div/article[3]/div[1]/div[4]/div[2]/atom-button/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
        
        Thread.sleep(5000);
    }
    
    @When ("modal consulta cobertura dados do Avulso Fixa Dois")
    public void informaDadosAvulsoFixa2()  throws IOException {
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Angela Maria Canziani");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-0098");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("59015-350");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1700");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\25-Teste-informaDados-TelefoniaFixa2.jpg"));
    }
    
    @And ("modal Identifica clica em consultar Avulso Fixa Dois")
    public void consultarAvulsoFixa2() throws InterruptedException {
    	Thread.sleep(5000);
    	
    	driver.findElement(By.className("btn-consult")).click();
    	Thread.sleep(5000);
    }
    
    @And ("botao comprar internet avulsa Fixa Dois")
    public void comprarInternetAvulsoFixa2() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
//        Actions act3=new Actions(driver); 	
//    	act3.moveToElement(driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"))).click().build().perform();
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[3]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    	
    	Thread.sleep(6000);
    }
    
    
    @When ("completando pedido checkout Avulso Fixa Dois")
    public void dadosClienteAvulsoFixa2() throws IOException {
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("18005912846");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho.ext@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125950020");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\26-Teste-dadosCliente-TelefoniaFixa2.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("31");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("03");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1956");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Anunciata Bonsegno Pratss");

    }
    
    @And ("seleciona Proximo Passo Avulso Fixa Dois")
    public void botaoProximoPasso1AvulsoFixa2() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();
    	
    	Thread.sleep(5000);

    }
    
    @And ("endereco Instalacao clica Proximo Passo Avulso Fixa Dois")
    public void botaoProximoPasso2AvulsoFixa2() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    }
    
    @When ("pagamentos informa dados Avulso Fixa Dois")
    public void dadosPagamentoAvulsoFixa2() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\27-Teste-dadosPagamento-TelefoniaFixa2.jpg"));
    }
     
    @And ("pagamento clica Finalizar Pedido Avulso Fixa Dois")
    public void botaoProximoPasso3AvulsoFixa2() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    
    @Then ("mensagem sucesso ou erro Avulso Fixa Dois")
    public void messagemSucessoouErroAvulsoFixa2() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C - TELEFONIA FIXA AVULSO - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\28-Teste-messageSucessoouErro-TelefoniaFixa2.jpg"));
    	
    	driver.quit();
    	
    }	
    
//------------------------------//
// Simulador 2P - Portal Assine //
//------------------------------//
    
    @And ("acessa pagina de simulador 2P")
    public void pagina2pSimulador()  throws InterruptedException {
    	driver.navigate().to("https://assine.vivo.com.br/Fortaleza_CE");
    	Thread.sleep(6000);
    }
    
    @And ("seleciona opcao de simulador 2P")
    public void acessarMenu2pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/section[3]/div/nav/ul/li[6]/ul/li[3]/a")).click();
//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[3]/div/div/div[1]/div[2]/a"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
//        element1.click();
//        
        Thread.sleep(5000);
    }
    
    @When ("na modal de consulta cobertura dados do Cliente simulador 2P")
    public void informaDados2pSimulador()  throws IOException {
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Walter Canziani");   
    	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2595-3223");
        driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("60150-000");
        driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("1340");
//      Thread.sleep(3000);
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\29-Teste-informaDados-2pSimulador.jpg"));
    }
    
    @And ("na modal de Identifica clica em Consultar simulador 2P")
    public void receberLigacao2pSimulador() throws InterruptedException {
    	driver.findElement(By.className("btn-consult")).click();
    	Thread.sleep(5000);
    }
    
    @And ("seleciona botao comprar simulador 2P")
    public void botaoComprar2pSimulador() throws InterruptedException {
    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    	Thread.sleep(3000);
    	
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
    	
    }   
    
    @And ("seleciona banda larga simulador 2P")
    public void bandaLarga2pSimulador() throws InterruptedException {
    	Thread.sleep(10000);
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section/div/div/section/div/div/div[2]/div/div/div/button")).click();
    } 
     
    @And ("seleciona Telefonia Fixa simulador 2P")
    public void telefoniaFixa2pSimulador() throws InterruptedException {
    	Thread.sleep(10000);
    	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[2]/div/div[2]/div[2]/button")).click();
    	Thread.sleep(5000);
    }
    
    @When ("cliente complete o pedido - simulador 2P")
    public void dadosCliente2pSimulador() throws IOException {
    	
    	driver.findElement(By.id("txtDocumento")).clear();
    	driver.findElement(By.id("txtDocumento")).sendKeys("28411076121");
    	driver.findElement(By.id("txtEmail")).clear();
    	driver.findElement(By.id("txtEmail")).sendKeys("jonathan.sobrinho@telefonica.com");
    	driver.findElement(By.id("txtFone")).clear();
    	driver.findElement(By.id("txtFone")).sendKeys("4125253233");

    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\30-Teste-dadosCliente-2pSimulador.jpg"));

    	driver.findElement(By.xpath(".//*[@id='formCheckoutIdentificacao']/fieldset/div[6]/div[2]/label")).click();
    	driver.findElement(By.id("txtDataDia")).clear();
    	driver.findElement(By.id("txtDataDia")).sendKeys("06");
    	driver.findElement(By.id("txtDataMes")).clear();
    	driver.findElement(By.id("txtDataMes")).sendKeys("05");
    	driver.findElement(By.id("txtDataAno")).clear();
    	driver.findElement(By.id("txtDataAno")).sendKeys("1934");    	
    	Select drpStatus = new Select(driver.findElement(By.id("estCivil")));
        drpStatus.selectByValue("Casado");
        driver.findElement(By.id("txtMae")).sendKeys("Laura Coelho Canziani");
        
    }
    
    @And ("cliente clica em Proximo Passo - simulador 2P")
    public void botaoProximoPasso12pSimulador() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();

    }
     
    @And ("na tela Endereco Instalacao clica Proximo Passo simulador 2P")
    public void botaoProximoPasso22pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
    	
    	Thread.sleep(3000);
    }
    
    @When ("em Pagamentos informa os dados simulador 2P")
    public void dadosPagamento2pSimulador() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[2]/div/label/span")).click();

//       	Thread.sleep(3000);
    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\31-Teste-dadosPagamento-2pSimulador.jpg"));
    }
     
    @And ("em Pagamento clica em Finalizar Pedido simulador 2P")
    public void botaoProximoPasso32pSimulador() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
    }
    
    @Then ("na tela mensagem de sucesso ou erro - simulador 2P")
    public void messagemSucessoouErro2pSimulador() throws IOException {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("B2C 2P SIMULADOR - " + driver.getTitle());
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
    	String strng = element.getText();
    	System.out.println(strng);
    	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
    	System.out.println("----------------------------------------------------------------");
    	    	
    	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
    	String strng2 = element2.getText();
    	System.out.printf("Número Protocolo: "+ strng2);
    	System.out.println();
    	
    	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
    	String strng3 = element3.getText();
    	System.out.printf("Nome Completo: "+ strng3);
    	System.out.println();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
    	String strng4 = element4.getText();
    	System.out.printf("Documento: "+ strng4);
    	System.out.println();
    	
    	WebElement element5 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[7]/span"));
    	String strng5 = element5.getText();
    	System.out.printf("Data de Nascimento: "+ strng5);
    	System.out.println();
    	
    	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
    	String strng6 = element6.getText();
    	System.out.printf("Nome da Mãe: "+ strng6);
    	System.out.println();
    	
    	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
    	String strng7 = element7.getText();
    	System.out.printf("Endereço: "+ strng7);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
    	String strng8 = element8.getText();
    	System.out.printf("Plano Internet: "+ strng8);
    	System.out.println();
    	
     	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
    	String strng10 = element10.getText();
    	System.out.printf("Plano Telefonia Fixa: "+ strng10);
    	System.out.println();
    	System.out.println("----------------------------------------------------------------");

    	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2C\\32-Teste-messageSucessoouErro-2pSimulador.jpg"));
    	
    	driver.quit();
    	
    }

//-----//
// B2B //
//-----//
//-----------------------------------------------------------//
//Realizar pedido de compra simulador 2P - Portal Assine B2B //
//-----------------------------------------------------------//
  
  @And ("acessa pg de simulador 2P B2B")
  public void pg2pSimuladorB2B()  throws InterruptedException {
  	driver.navigate().to("https://assine.vivo.com.br/porto-alegre_RS/empresas/pequenas-e-medias/combos");
    Thread.sleep(10000); 
  }
  
  @And ("seleciona opcao simulador 2P B2B")
  public void acessaMenu2pSimuladorB2B() throws InterruptedException {
  	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
  	Thread.sleep(3000);

    WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[5]/div/div/div[1]/div[2]/a[2]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
    element1.click();

	Thread.sleep(6000);
  }
  
  @When ("modal de consulta dados do Cliente simulador 2P B2B")
  public void validaDados2pSimuladorB2B()  throws IOException {
  	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ME TES NOVO NV");   
  	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2565-3223");
    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("90560-003");
    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("545");
      
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\01-Teste-informaDados-2pSimulador-B2B.jpg"));
  }
  
  @And ("modal Identifica clica em Consultar simulador 2P B2B")
  public void btaoconsulta2pSimuladorB2B() throws InterruptedException {
  	driver.findElement(By.className("btn-consult")).click();
  	Thread.sleep(5000);
  }
  
  @And ("seleciona botao compra simulador 2P B2B")
  public void btaoComprar2pSimuladorB2B() throws InterruptedException {
  	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
  	Thread.sleep(3000);
  	
  	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"simulador-assine\"]/section/section/section[3]/div/div/div[1]/div[2]/a[2]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
    element1.click();
  	
  }   
  
  @And ("seleciona card banda larga simulador 2P B2B")
  public void BL2pSimuladorB2B() throws InterruptedException {
  	Thread.sleep(10000);
  	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section/div/div/section/div/div/div[2]/div/div/div/button")).click();
  } 
   
  @And ("seleciona card Telefonia Fixa simulador 2P B2B")
  public void fixa2pSimuladorB2B() throws InterruptedException {
  	Thread.sleep(10000);
  	driver.findElement(By.xpath("html/body/div/ui-view/ui-view/div/div/div/section[3]/div/div/section/div/div/div[2]/div/div[2]/div[2]/button")).click();
  	Thread.sleep(5000);
  }
  
  @When ("cliente informa dados pedido simulador 2P B2B")
  public void InformaDados2pSimuladorB2B() throws IOException {
  	
  	driver.findElement(By.id("txtBusinessName")).clear();
  	driver.findElement(By.id("txtBusinessName")).sendKeys("Telefonica Vivo Novo Novo NV");
  	driver.findElement(By.id("txtBusinessDocument")).clear();
  	driver.findElement(By.id("txtBusinessDocument")).sendKeys("26261575000151");

  	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\02-Teste-dadosCliente01-2pSimulador-B2B.jpg"));

  	driver.findElement(By.id("txtDataDia")).clear();
  	driver.findElement(By.id("txtDataDia")).sendKeys("09");
  	driver.findElement(By.id("txtDataMes")).clear();
  	driver.findElement(By.id("txtDataMes")).sendKeys("07");
  	driver.findElement(By.id("txtDataAno")).clear();
  	driver.findElement(By.id("txtDataAno")).sendKeys("2002");    
  	
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/fieldset/div[6]/div/label/span")).click();
  	driver.findElement(By.id("txtEmail")).clear();
  	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");

  }
  
  @And ("cliente seleciona Proximo Passo simulador 2P B2B")
  public void btaoProxPasso2pSimuladorB2B() throws IOException {
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/div/button")).click();

  }
   
  @And ("tela Endereco Instalacao seleciona Proximo Passo simulador 2P B2B")
  public void btaoProxPasso22pSimuladorB2B() throws InterruptedException {
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
  	
  	Thread.sleep(3000);
  }
  
  @When ("informa os dados de pagamentos simulador 2P B2B")
  public void dadosPagamento2pSimuladorB2B() throws IOException {
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[3]/div/label/span")).click();

//  Thread.sleep(3000);
  	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\03-Teste-dadosPagamento-2pSimulador-B2B.jpg"));
  }
   
  @And ("seleciona em Finalizar Pedido simulador 2P B2B")
  public void btaoProxPasso32pSimuladorB2B() throws InterruptedException {
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
  	
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
  }
  
  @Then ("valida retorno de mensagem de sucesso ou erro simulador 2P B2B")
  public void msgSucessoouErro2pSimuladorB2B() throws IOException {
  	System.out.println("----------------------------------------------------------------");
  	System.out.println("B2B 2P SIMULADOR - " + driver.getTitle());
  	System.out.println("----------------------------------------------------------------");
  	
  	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
  	String strng = element.getText();
  	System.out.println(strng);
  	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
  	System.out.println("----------------------------------------------------------------");
  	    	
  	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
  	String strng2 = element2.getText();
  	System.out.printf("Número Protocolo: "+ strng2);
  	System.out.println();
  	
  	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
  	String strng3 = element3.getText();
  	System.out.printf("Nome Completo: "+ strng3);
  	System.out.println();
  	
  	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
  	String strng4 = element4.getText();
  	System.out.printf("Documento: "+ strng4);
  	System.out.println();
  	
  	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
  	String strng6 = element6.getText();
  	System.out.printf("Nome da Mãe: "+ strng6);
  	System.out.println();
  	
  	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
  	String strng7 = element7.getText();
  	System.out.printf("Endereço: "+ strng7);
  	System.out.println();
  	System.out.println("----------------------------------------------------------------");
  	
  	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[3]/div[2]/div[1]/ul/li[1]/span"));
  	String strng8 = element8.getText();
  	System.out.printf("Plano Internet: "+ strng8);
  	System.out.println();
  	
   	WebElement element10 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[4]/div[2]/div[1]/ul/li[1]/span"));
  	String strng10 = element10.getText();
  	System.out.printf("Plano Telefonia Fixa: "+ strng10);
  	System.out.println();
  	System.out.println("----------------------------------------------------------------");

  	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\04-Teste-messageSucessoouErro-2pSimulador-B2B.jpg"));
  	
  	driver.quit();
  	
  }
  
//--------------------------//
// Combo 3P - Portal Assine //
//--------------------------// 	     
	     
   @And ("acessa pg de combo 3P B2B")
   public void pgCombo3PB2B()  throws InterruptedException {	
   	driver.navigate().to("https://assine.vivo.com.br/curitiba_PR/empresas/pequenas-e-medias/combos");
   	Thread.sleep(6000);  
   }
   
   @And ("seleciona card combo 3P B2B")
   public void acessaMenuB2B() throws InterruptedException {
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mainView\\\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"))); 
	  	
   	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section[2]/div/div/div/ul/li[1]/article[2]/div/div[4]/div[2]/div[2]/div[2]/atom-button/button"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
    element1.click();

   	Thread.sleep(3000);
   }
   
   @When ("modal informa os dados do Cliente B2B")
   public void informaDadosB2B()  throws IOException {
   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[1]/input")).sendKeys("Materiais para contrucao ltda ME TENV");   
   	driver.findElement(By.xpath("html/body/div[2]/section/section/div[1]/div/div/div/section/form/div/div[1]/div[2]/input")).sendKeys("(41) 2525-2636");
    driver.findElement(By.cssSelector("div.wrap-double > input[name=\"cep\"]")).sendKeys("80010-050");
    driver.findElement(By.xpath(".//*[@class='header-modal']/../form/div/div[1]/div[3]/div[2]/input")).sendKeys("297");
//  Thread.sleep(3000);
       
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\05-Teste-informaDados-3PCombo-B2B.jpg"));
   }
   
   @And ("modal de Identificacao clica em Consulta B2B")
   public void btaoConsultaB2B() throws InterruptedException {
   	driver.findElement(By.className("btn-consult")).click();
   	Thread.sleep(5000);
   }
   
   @When ("informa dados do cliente complete o pedido B2B")
   public void dadosClienteB2B() throws IOException {
  	driver.findElement(By.id("txtBusinessName")).clear();
  	driver.findElement(By.id("txtBusinessName")).sendKeys("Telefonica Testando Vivo Dois NV");
  	driver.findElement(By.id("txtBusinessDocument")).clear();
  	driver.findElement(By.id("txtBusinessDocument")).sendKeys("72396036000147");

  	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\06-Teste-dadosCliente01-3PCombo-B2B.jpg"));

  	driver.findElement(By.id("txtDataDia")).clear();
  	driver.findElement(By.id("txtDataDia")).sendKeys("02");
  	driver.findElement(By.id("txtDataMes")).clear();
  	driver.findElement(By.id("txtDataMes")).sendKeys("04");
  	driver.findElement(By.id("txtDataAno")).clear();
  	driver.findElement(By.id("txtDataAno")).sendKeys("2001");    
	  	
  	driver.findElement(By.xpath("//*[@id=\"formCheckoutIdentificacao\"]/fieldset/div[6]/div/label/span")).click();
  	driver.findElement(By.id("txtEmail")).clear();
  	driver.findElement(By.id("txtEmail")).sendKeys("jsobrinho87@hotmail.com");

   }
   
   @And ("tela dados do cliente clica em Proximo Passo B2B")
   public void btaoProximoPasso1B2B() throws IOException {
   	driver.findElement(By.className("btn-lg")).click();
   	
   }
   
   @And ("tela Endereco de Instalacao clica em Proximo Passo B2B")
   public void btaoProximoPasso2B2B() throws InterruptedException {
   	driver.findElement(By.xpath("//*[@id=\"formCheckoutEndereco\"]/div/button")).click();
   	
   	Thread.sleep(3000);
   }
   
   @When ("pagina de Pagamentos informa os dados B2B")
   public void dadosPagamentoB2B() throws IOException {
   	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[3]/div[2]/div/ul/li[1]/label")).click();
   	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/fieldset[4]/div[3]/div[3]/div/label/span")).click();

//  Thread.sleep(3000);
   	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\07-Teste-dadosPagamento-3PCombo-B2B.jpg"));

   }
   
   @And ("pagina de Pagamento clica em Finalizar Pedido B2B")
   public void btaoProximoPasso3() throws InterruptedException {
   	driver.findElement(By.xpath("//*[@id=\"formCheckoutPagamento\"]/div/button")).click();
   	
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"))));
   }
   
   @Then ("pagina exibida mensagem de sucesso ou erro B2B")
   public void pgmsgSucessoouErroB2B() throws IOException {
   	System.out.println("----------------------------------------------------------------");
   	System.out.println("B2B 3P COMBO - " + driver.getTitle());
   	System.out.println("----------------------------------------------------------------");
   	
   	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[1]/h2"));
   	String strng = element.getText();
   	System.out.println(strng);
   	Assert.assertEquals("Seu pedido foi realizado com sucesso.", strng); 
   	System.out.println("----------------------------------------------------------------");
   	    	
   	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[1]/section/section/div[2]/p/span"));
   	String strng2 = element2.getText();
   	System.out.printf("Número Protocolo: "+ strng2);
   	System.out.println();
   	
   	WebElement element3 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[1]/span"));
   	String strng3 = element3.getText();
   	System.out.printf("Nome Completo: "+ strng3);
   	System.out.println();
   	
   	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[2]/span"));
   	String strng4 = element4.getText();
   	System.out.printf("Documento: "+ strng4);
   	System.out.println();
   	
   	WebElement element6 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[1]/p[9]/span"));
   	String strng6 = element6.getText();
   	System.out.printf("Nome da Mãe: "+ strng6);
   	System.out.println();
   	
   	WebElement element7 = driver.findElement(By.xpath("//*[@id=\"mainView\"]/ui-view/section/div[2]/div[2]/div/article[1]/div[1]/div[2]/p[2]/span"));
   	String strng7 = element7.getText();
   	System.out.printf("Endereço: "+ strng7);
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
   	FileUtils.copyFile(scrFile2, new File("C:\\Users\\80479178\\Downloads\\Release\\Evidências Testes Regressão Release\\Pedidos de compra\\B2B\\08-Teste-messageSucessoouErro-3PCombo-B2B.jpg"));
   	
   	driver.quit();
   	
   }
}