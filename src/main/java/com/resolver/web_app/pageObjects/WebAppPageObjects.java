package com.resolver.web_app.pageObjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebAppPageObjects extends PageObjectsBase {

	private WebDriver driver;

	public WebAppPageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, webAppLocators);
	}

	public void assertLoginElementPresent() {
		assertTrue(isElementPresent(webAppLocators.getEmailAddressField()));
		assertTrue(isElementPresent(webAppLocators.getPasswordField()));
		assertTrue(isElementPresent(webAppLocators.getSignInButton()));
	}

	public void setAddressAndPasswordCombination(String emailValue, String passwordValue) {
		setValueField(webAppLocators.getEmailAddressField(), emailValue);
		setValueField(webAppLocators.getPasswordField(), passwordValue);
		assertTrue("The email address field in the login seccion is empty: ",
				isFieldNotEmpty(webAppLocators.getEmailAddressField()));
		assertTrue("The passwork field in the login seccion is empty: ",
				isFieldNotEmpty(webAppLocators.getPasswordField()));
	}

	public void verifyTheListGroup() {
		assertTrue("The list group size is not equal to 3: ", getListSize(webAppLocators.getListGroup()) == 3);
		assertTrue("The expected list value is not correct: ",
				getListItems(webAppLocators.getListGroup(), "value", 2).contains("List Item 2"));
		assertTrue("The expected badge value is not correct: ",
				Integer.parseInt(getListItems(webAppLocators.getListGroup(), "badge", 2)) == 6);

	}

	public void verifyTheOptionIsTheDefaultSelectedValue(String option) {
		String defaultSelectedValue = webAppLocators.getDropDownButton().getText().trim();
		assertTrue("The default option provided doesn't match: ", defaultSelectedValue.equalsIgnoreCase(option.trim()));

	}

	public void select_Option(String option) {
		scrollToElement(webAppLocators.getDropDownButton());
		clickElement(webAppLocators.getDropDownButton());
		selectDropDownListOption(webAppLocators.getDropDownOptionLocator(), option);
		assertTrue("The option selected is not valid: ",
				webAppLocators.getDropDownButton().getText().trim().equalsIgnoreCase(option.trim()));
	}

	public void verifyTheFirstButtonIsEnabledAndTheSecondButtonIsDisabled() {
		scrollToElement(webAppLocators.getEnableButton());
		assertTrue("The button should be enabled: ", isButtonEnabled(webAppLocators.getEnableButton()));
		assertFalse("The button should be disabled: ", isButtonEnabled(webAppLocators.getDisabledButton()));

	}

	public void waitingForButtonUntillDisplayedAndClickingIt() {
		scrollToElement(webAppLocators.getTest5Button());
		waitUntilInvisibility(webAppLocators.getPlaceHolderLocator());
		waitUntiVisibilityOfElementLocated(webAppLocators.getTest5ButtonLocator());
		clickElement(webAppLocators.getTest5Button());
	}

	public void assertSuccessMessageIsDisplayedAndTheButtonIsDisabled() {
		assertTrue("The success message should be disabled: ", isButtonEnabled(webAppLocators.getSuccessMessage()));
		assertFalse("The button5 should be disabled: ", isButtonEnabled(webAppLocators.getTest5Button()));

	}

	public void assertThatTheValueOfTheCellAtCoordinatesIs(String col, String row, String value) {
		scrollToElement(webAppLocators.getTblGrid());
		String cellValue = getCellValue(Integer.parseInt(col), Integer.parseInt(row));
		assertTrue("The cell value don't match: ", cellValue.equalsIgnoreCase(value.trim()));
	}

}
