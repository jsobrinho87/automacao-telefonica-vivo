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
}