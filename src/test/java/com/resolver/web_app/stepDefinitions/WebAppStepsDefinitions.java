package com.resolver.web_app.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import com.resolver.web_app.WebDriverHooks.WebAppDriverHooks;
import com.resolver.web_app.pageObjects.WebAppPageObjects;

public class WebAppStepsDefinitions {

	WebDriver driver;
	WebAppPageObjects webAppPageObjects;

	public WebAppStepsDefinitions() {
		this.driver = WebAppDriverHooks.getDriver();
		System.out.println("**** Steps:: " + this.driver);
		this.webAppPageObjects = new WebAppPageObjects(driver);
	}

	@Given("^login elements are visible$")
	public void login_elements_are_visible() {
		webAppPageObjects.assertLoginElementPresent();
	}

	@Then("^the user sets the  address \"([^\"]*)\" and password \"([^\"]*)\" combination$")
	public void the_user_sets_the_address_and_password_combination(String emailValue, String passwordValue) {
		webAppPageObjects.setAddressAndPasswordCombination(emailValue, passwordValue);
	}

	@Then("^verify the list group$")
	public void verify_the_list_group() {
		webAppPageObjects.verifyTheListGroup();
	}

	@Then("^verify the option \"([^\"]*)\" is the default selected value$")
	public void verify_the_option_is_the_default_selected_value(String option) {
		webAppPageObjects.verifyTheOptionIsTheDefaultSelectedValue(option);
	}

	@Then("^select Option \"([^\"]*)\"$")
	public void select_Option(String option) {
		webAppPageObjects.select_Option(option);
	}

	@Then("^verify the first button is enabled and the second button is disabled$")
	public void verify_the_first_button_is_enabled_and_the_second_button_is_disabled() {
		webAppPageObjects.verifyTheFirstButtonIsEnabledAndTheSecondButtonIsDisabled();
	}

	@When("^waiting for a button to be displayed and clicking it$")
	public void waiting_for_a_button_to_be_displayed_and_clicking_it() {
		webAppPageObjects.waitingForButtonUntillDisplayedAndClickingIt();
	}

	@Then("^assert that a success message is displayed and the button is disabled$")
	public void assert_that_a_success_message_is_displayed_and_the_button_is_disabled() {
		webAppPageObjects.assertSuccessMessageIsDisplayedAndTheButtonIsDisabled();
	}

	@Then("^assert that the value of the cell at coordinates \"([^\"]*)\" \"([^\"]*)\" is \"([^\"]*)\"$")
	public void assert_that_the_value_of_the_cell_at_coordinates_is(String col, String row, String value) {
		webAppPageObjects.assertThatTheValueOfTheCellAtCoordinatesIs(col, row, value);

	}

}
