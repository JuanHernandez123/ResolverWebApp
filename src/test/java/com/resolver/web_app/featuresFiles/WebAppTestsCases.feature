Feature: Interact with the elements displayed in the Web App 
	As a user I want to validate that the elements displayed in the Web App work as expected.
	
@smoke
Scenario: Successful login elements display and data entry 
	Given login elements are visible 
	Then the user sets the  address "user1@resolver.com" and password "resolver-2023" combination
	
@smoke
Scenario: Verify List Group in Test 2 Div 
	Then  verify the list group 
	
@smoke
Scenario: Verify Dropdown Selection in Test 3 Div 
	Then  verify the option "Option 1" is the default selected value 
	And   select Option "Option 3" 
	
@smoke
Scenario: Verify Button States in Test 4 Div 
	Then  verify the first button is enabled and the second button is disabled 

@smoke
Scenario: Interact with a Button in Test 5 Div 
	When waiting for a button to be displayed and clicking it 
	Then assert that a success message is displayed and the button is disabled 
	
@smoke
Scenario: Retrieve Value from a Grid Cell 
	Then  assert that the value of the cell at coordinates "2" "2" is "Ventosanzap"