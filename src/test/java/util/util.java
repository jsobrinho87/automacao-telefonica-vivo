package util;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class util {
	private WebDriver webDriver;

	public static float formatar(float d) {
		BigDecimal bd = new BigDecimal(Float.toString(d));
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}

	public util(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public boolean isElementPresentCSS(String cssSelector) {
		return isElementPresent(By.cssSelector(cssSelector));
	}

	public boolean isElementPresentXPATH(String xpathSelector) {
		return isElementPresent(By.xpath(xpathSelector));
	}

	public boolean isElementPresent(By locatorKey) {
		try {
			webDriver.findElement(locatorKey);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementPresentCSS(WebElement webElement, String cssSelector) {
		return isElementPresent(webElement, By.cssSelector(cssSelector));
	}

	public boolean isElementPresentXPATH(WebElement webElement, String xpathSelector) {
		return isElementPresent(webElement, By.xpath(xpathSelector));
	}

	public boolean isElementPresent(WebElement webElement, By locatorKey) {
		try {
			webElement.findElement(locatorKey);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementVisible(String cssLocator) {
		return webDriver.findElement(By.cssSelector(cssLocator)).isDisplayed();
	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return foo;
	};

	public void sendKeysCSS(String cssSelector, String keysToSend) {
		sendKeys(webDriver.findElement(By.cssSelector(cssSelector)), keysToSend);
	}

	public void sendKeysXPATH(String xpathSelector, String keysToSend) {
		sendKeys(webDriver.findElement(By.xpath(xpathSelector)), keysToSend);
	}

	private void sendKeys(WebElement webElement, String keysToSend) {
		webElement.clear();
		webElement.sendKeys(keysToSend);
	}

	public void selectRadioBoxCSS(String cssSelector, String value) {
		selectRadioBox(webDriver.findElements(By.cssSelector(cssSelector)), value, cssSelector);
	}

	public void selectRadioBoxXPATH(String xpathSelector, String value) {
		selectRadioBox(webDriver.findElements(By.xpath(xpathSelector)), value, xpathSelector);
	}

	private void selectRadioBox(List<WebElement> WebElementsRadioBox, String value, String selector) {
		int iSize = WebElementsRadioBox.size();
		for (int i = 0; i < iSize; i++) {
			String sValue = WebElementsRadioBox.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase(value)) {
				if (WebElementsRadioBox.get(i).isDisplayed()) {
					WebElementsRadioBox.get(i).click();
				} else {
					String id = WebElementsRadioBox.get(i).getAttribute("id");
					WebElement webElementLabel = webDriver.findElement(By.cssSelector("label[for='" + id + "'"));
					if (webElementLabel != null) {
						webElementLabel.click();
					} else {
						throw new ElementNotVisibleException("Element radio box is not visible. (" + selector + ")");
					}

				}
				break;

			}

		}
	}

	public void selectComboBoxCSS(String cssSelector, String value) {
		selectComboBox(webDriver.findElement(By.cssSelector(cssSelector)),
				webDriver.findElements(By.cssSelector(cssSelector + " option")), value, cssSelector);
	}

	public void selectComboBoxXPATH(String xpathSelector, String value) {
		selectComboBox(webDriver.findElement(By.xpath(xpathSelector)),
				webDriver.findElements(By.xpath(xpathSelector + "//option")), value, xpathSelector);
	}

	private void selectComboBox(WebElement WebElementSelect, List<WebElement> WebElementsOptions, String value,
			String selector) {
		WebElementSelect.click();
		int iSize = WebElementsOptions.size();
		for (int i = 0; i < iSize; i++) {
			String sValue = WebElementsOptions.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase(value)) {
				WebElementsOptions.get(i).click();
				break;

			}
		}
	}

	public void fullScreemShot() {
		int width = Integer.parseInt(((JavascriptExecutor) webDriver)
				.executeScript(
						"return Math.max(document.body.scrollWidth, document.body.offsetWidth, document.documentElement.clientWidth, document.documentElement.scrollWidth, document.documentElement.offsetWidth);")
				.toString());
		int height = Integer.parseInt(((JavascriptExecutor) webDriver)
				.executeScript(
						"return Math.max(document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight);")
				.toString());

		Dimension atualDimension = webDriver.manage().window().getSize();
		Dimension printDimension = new Dimension(width, height);
		webDriver.manage().window().setSize(printDimension);
		File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		webDriver.manage().window().setSize(atualDimension);
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void waitForRequests(long beforeDelay, int minutes) {
		waitForRequests(beforeDelay, 0, minutes);
	}

	public void waitForRequests(long beforeDelay, long afterDelay, int seconde) {
		if (beforeDelay > 0) {
			try {
				Thread.sleep(beforeDelay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		WebDriverWait wait = new WebDriverWait(webDriver, seconde, 100);
		wait.until(AdditionalConditions.angularHasFinishedProcessing());
		if (afterDelay > 0) {
			try {
				Thread.sleep(afterDelay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void clickCSS(String cssSelector) {
		click(webDriver.findElement(By.cssSelector(cssSelector)));
	}

	public void clickXPATH(String xpathSelector) {
		click(webDriver.findElement(By.xpath(xpathSelector)));
	}

	private void click(WebElement webElement) {
		webElement.click();
	}

	public String extractPriceFromText(String text) {
		return StringUtils.substringBefore(StringUtils.substringAfter(text, "R$"), " ").replace(",", ".");
	}
	
	public static String gerarCPF() {

		String iniciais = "";// contém os 9 primeiros números do cpf
		int numero;// número gerado randomicamente
		int primDig, segDig;// recebem o primeiro e o segundo digitos calculados
		int soma = 0, peso = 10; // utilizados nos calculos dos digitos
		// verificadores
		String num; // receberá o valor contido em iniciais

		// gera randomicamente os 9 primeiros números do cpf
		for (int i = 0; i < 9; i++) {

		numero = (int) (Math.random() * 10);
		if (numero > 9)// pois o número deve ser de 0 a 9
		numero = 9;
		iniciais += Integer.toString(numero);
		}

		// armazena em num o valor de iniciais
		num = iniciais;

		for (int i = 0; i < iniciais.length(); i++) {
		soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
		}

		if (soma % 11 == 0 | soma % 11 == 1)
		primDig = 0;
		else
		primDig = 11 - (soma % 11);

		soma = 0;
		peso = 11;

		for (int i = 0; i < num.length(); i++) {
		soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
		}

		soma += primDig * 2;
		if (soma % 11 == 0 | soma % 11 == 1)
		segDig = 0;
		else
		segDig = 11 - (soma % 11);

		// retorna o cpf gerado
		return iniciais + primDig + segDig;
		}
	
	public static String gerarCNPJ() {
		String iniciais = "";// contém os 8 primeiros números do cnpj
		int numero;// número gerado randomicamente
		int primDig, segDig;// recebem o primeiro e o segundo digitos calculados
		String num; // receberá o valor contido em iniciais
		int intRestoDivisao; // recebe o resto de uma divisão

		// gera randomicamente os 8 primeiros números do cnpj
		for (int i = 0; i < 8; i++) {
		numero = (int) (Math.random() * 10);
		if (numero > 9)// pois o número deve ser de 0 a 9
		numero = 9;
		iniciais += Integer.toString(numero);
		}
		iniciais += "0001";
		// armazena em num o valor de iniciais
		num = iniciais;

		// 5 4 3 2 9 8 7 6 5 4 3 2
		// calculando o primeiro dígito:
		int soma = 0;
		soma += 5 * Integer.parseInt((num.substring(0, 1)));
		soma += 4 * Integer.parseInt((num.substring(1, 2)));
		soma += 3 * Integer.parseInt((num.substring(2, 3)));
		soma += 2 * Integer.parseInt((num.substring(3, 4)));
		soma += 9 * Integer.parseInt((num.substring(4, 5)));
		soma += 8 * Integer.parseInt((num.substring(5, 6)));
		soma += 7 * Integer.parseInt((num.substring(6, 7)));
		soma += 6 * Integer.parseInt((num.substring(7, 8)));
		soma += 5 * Integer.parseInt((num.substring(8, 9)));
		soma += 4 * Integer.parseInt((num.substring(9, 10)));
		soma += 3 * Integer.parseInt((num.substring(10, 11)));
		soma += 2 * Integer.parseInt((num.substring(11, 12)));

		intRestoDivisao = soma % 11;
		// Caso o resto da divisão seja menor que 2,
		// o nosso primeiro dígito verificador se torna 0 (zero),
		// caso contrário subtrai-se o valor obtido de 11
		if (intRestoDivisao < 2) {
		primDig = 0;
		} else {
		primDig = 11 - intRestoDivisao;
		}

		// 6 5 4 3 2 9 8 7 6 5 4 3 2
		// calculando o segundo dígito:
		soma = 0;
		soma += 6 * Integer.parseInt((num.substring(0, 1)));
		soma += 5 * Integer.parseInt((num.substring(1, 2)));
		soma += 4 * Integer.parseInt((num.substring(2, 3)));
		soma += 3 * Integer.parseInt((num.substring(3, 4)));
		soma += 2 * Integer.parseInt((num.substring(4, 5)));
		soma += 9 * Integer.parseInt((num.substring(5, 6)));
		soma += 8 * Integer.parseInt((num.substring(6, 7)));
		soma += 7 * Integer.parseInt((num.substring(7, 8)));
		soma += 6 * Integer.parseInt((num.substring(8, 9)));
		soma += 5 * Integer.parseInt((num.substring(9, 10)));
		soma += 4 * Integer.parseInt((num.substring(10, 11)));
		soma += 3 * Integer.parseInt((num.substring(11, 12)));
		soma += 2 * primDig;

		intRestoDivisao = soma % 11;
		// Caso o resto da divisão seja menor que 2,
		// o nosso primeiro dígito verificador se torna 0 (zero),
		// caso contrário subtrai-se o valor obtido de 11
		if (intRestoDivisao < 2) {
		segDig = 0;
		} else {
		segDig = 11 - intRestoDivisao;
		}

		// retorna o cnpj gerado
		return iniciais + primDig + segDig;

		}
}