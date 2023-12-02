package com.resolver.web_app.locators;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAppLocators {

	@FindBy(id = "inputEmail")
	private WebElement txt_emailAddressField;

	@FindBy(id = "inputPassword")
	private WebElement txt_passwordField;

	@FindBy(css = ".form-signin .btn-primary")
	private WebElement btn_signInButton;

	@FindBy(xpath = "//ul[@class='list-group']/li")
	private List<WebElement> lst_listGroup;

	@FindBy(xpath = "//button[@id = 'dropdownMenuButton']")
	private WebElement btn_dropDownButton;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary' and text()='Button']")
	private WebElement btn_enabledButton;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-secondary' and text()='Button' and @disabled='']")
	private WebElement btn_disabledButton;

	@FindBy(xpath = "//button[@id='test5-button']")
	private WebElement btn_test5Button;

	@FindBy(xpath = "//div[@id='test5-alert']")
	private WebElement msj_successMessage;

	@FindBy(xpath = "//table[@class='table table-bordered table-dark']")
	private WebElement tbl_grid;

	private String dropDownOptionLocator = "//div[@class='dropdown-menu show']/a[text()='%s']";

	private String placeHolderLocator = "//p[@id='test5-placeholder']";

	private String test5ButtonLocator = "//button[@id='test5-button']";

	private int adjustedRow;

	private int adjustedCol;

	public void setAdjustedRow(int value) {
		this.adjustedRow = value;
	}

	public void setAdjustedCol(int value) {
		this.adjustedCol = value;
	}

	public WebElement getEmailAddressField() {
		return txt_emailAddressField;
	}

	public WebElement getPasswordField() {
		return txt_passwordField;
	}

	public WebElement getSignInButton() {
		return btn_signInButton;
	}

	public List<WebElement> getListGroup() {
		return lst_listGroup;
	}

	public WebElement getDropDownButton() {
		return btn_dropDownButton;
	}

	public WebElement getEnableButton() {
		return btn_enabledButton;
	}

	public WebElement getDisabledButton() {
		return btn_disabledButton;
	}

	public WebElement getTest5Button() {
		return btn_test5Button;
	}

	public WebElement getSuccessMessage() {
		return msj_successMessage;
	}

	public WebElement getTblGrid() {
		return tbl_grid;
	}

	public String getDropDownOptionLocator() {
		return dropDownOptionLocator;
	}

	public String getPlaceHolderLocator() {
		return placeHolderLocator;
	}

	public String getTest5ButtonLocator() {
		return test5ButtonLocator;
	}

	public int getAdjustedRow() {
		return adjustedRow;
	}

	public int getAdjustedCol() {
		return adjustedCol;
	}

	public String getGridFieldLocator() {
		return "//table[@class='table table-bordered table-dark']/tbody/tr[" + getAdjustedRow() + "]/td["
				+ getAdjustedCol() + "]";
	}

}
