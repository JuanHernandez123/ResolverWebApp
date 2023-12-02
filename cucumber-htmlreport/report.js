$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebAppTestsCases.feature");
formatter.feature({
  "line": 1,
  "name": "Interact with the elements displayed in the Web App",
  "description": "As a user I want to validate that the elements displayed in the Web App work as expected.",
  "id": "interact-with-the-elements-displayed-in-the-web-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Successful login elements display and data entry",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;successful-login-elements-display-and-data-entry",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "login elements are visible",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user sets the  address \"user1@resolver.com\" and password \"resolver-2023\" combination",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppStepsDefinitions.login_elements_are_visible()"
});
formatter.result({
  "duration": 4494117600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1@resolver.com",
      "offset": 28
    },
    {
      "val": "resolver-2023",
      "offset": 62
    }
  ],
  "location": "WebAppStepsDefinitions.the_user_sets_the_address_and_password_combination(String,String)"
});
formatter.result({
  "duration": 887862400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify List Group in Test 2 Div",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;verify-list-group-in-test-2-div",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "verify the list group",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppStepsDefinitions.verify_the_list_group()"
});
formatter.result({
  "duration": 227386200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Dropdown Selection in Test 3 Div",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;verify-dropdown-selection-in-test-3-div",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "verify the option \"Option 1\" is the default selected value",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "select Option \"Option 3\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Option 1",
      "offset": 19
    }
  ],
  "location": "WebAppStepsDefinitions.verify_the_option_is_the_default_selected_value(String)"
});
formatter.result({
  "duration": 44347300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Option 3",
      "offset": 15
    }
  ],
  "location": "WebAppStepsDefinitions.select_Option(String)"
});
formatter.result({
  "duration": 330276400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify Button States in Test 4 Div",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;verify-button-states-in-test-4-div",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "verify the first button is enabled and the second button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppStepsDefinitions.verify_the_first_button_is_enabled_and_the_second_button_is_disabled()"
});
formatter.result({
  "duration": 206771100,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Interact with a Button in Test 5 Div",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;interact-with-a-button-in-test-5-div",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "waiting for a button to be displayed and clicking it",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "assert that a success message is displayed and the button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppStepsDefinitions.waiting_for_a_button_to_be_displayed_and_clicking_it()"
});
formatter.result({
  "duration": 853385800,
  "status": "passed"
});
formatter.match({
  "location": "WebAppStepsDefinitions.assert_that_a_success_message_is_displayed_and_the_button_is_disabled()"
});
formatter.result({
  "duration": 230882700,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Retrieve Value from a Grid Cell",
  "description": "",
  "id": "interact-with-the-elements-displayed-in-the-web-app;retrieve-value-from-a-grid-cell",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "assert that the value of the cell at coordinates \"2\" \"2\" is \"Ventosanzap\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 50
    },
    {
      "val": "2",
      "offset": 54
    },
    {
      "val": "Ventosanzap",
      "offset": 61
    }
  ],
  "location": "WebAppStepsDefinitions.assert_that_the_value_of_the_cell_at_coordinates_is(String,String,String)"
});
formatter.result({
  "duration": 145369800,
  "status": "passed"
});
});