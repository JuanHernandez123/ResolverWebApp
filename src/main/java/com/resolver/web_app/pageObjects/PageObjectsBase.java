package com.resolver.web_app.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resolver.web_app.locators.WebAppLocators;

public class PageObjectsBase {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected WebAppLocators webAppLocators;

	public PageObjectsBase(WebDriver driver) {
		this.driver = driver;
		this.webAppLocators = new WebAppLocators();
		this.wait = new WebDriverWait(driver, 20);
	}

	protected void waitForElementVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected boolean isElementPresent(WebElement element) {
		waitForElementVisibility(element);
		return element.isDisplayed();
	}

	public void setValueField(WebElement element, String text) {
		waitForElementVisibility(element);
		element.clear();
		element.sendKeys(text);
	}

	public boolean isFieldNotEmpty(WebElement element) {
		waitForElementVisibility(element);
		return !element.getAttribute("value").trim().isEmpty();
	}

	public void clickElement(WebElement element) {
		waitForElementVisibility(element);
		element.click();
	}

	protected int getListSize(List<WebElement> elements) {
		return elements.size();
	}

	protected String getListItems(List<WebElement> elements, String option, int targetIndex) {
		if (targetIndex < 0 || targetIndex > elements.size()) {
			return null;
		}

		WebElement targetItem = elements.get(targetIndex - 1);

		if (option.equalsIgnoreCase("badge")) {
			List<WebElement> spanElements = targetItem.findElements(By.tagName("span"));
			for (WebElement spanElement : spanElements) {
				return spanElement.getText().trim();
			}
		} else if (option.equalsIgnoreCase("value")) {
			return targetItem.getText().trim();
		}

		return null;

	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void selectDropDownListOption(String elementLocator, String option) {
		String optionXPath = String.format(elementLocator, option.trim());
		WebElement optionElement = driver.findElement(By.xpath(optionXPath));
		clickElement(optionElement);
	}

	public boolean isButtonEnabled(WebElement element) {
		waitForElementVisibility(element);
		return element.isEnabled();
	}

	public void waitUntiVisibilityOfElementLocated(String elementLocator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementLocator)));
	}

	public WebElement waitUntilInvisibility(String elementLocator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementLocator)));
	}

	public String getCellValue(int row, int col) {
		int adjustedRow = row + 1;
		int adjustedCol = col + 1;
		
		webAppLocators.setAdjustedRow(adjustedRow);
		webAppLocators.setAdjustedCol(adjustedCol);
		
		String cellLocator = webAppLocators.getGridFieldLocator();
		WebElement cellElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cellLocator)));

		return cellElement.getText().trim();
	}

}
