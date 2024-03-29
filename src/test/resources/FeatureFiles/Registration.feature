Feature: Checking Registration Page

Scenario: Verifying last name is required for the registration or not
  And Application is launched successfully in browser 
 	When User fills the entire form excluding last name
  And Click on submit button
 	Then User should get error message about last name
 	
 