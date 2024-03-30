Feature: Checking Registration Page

Scenario: Verifying last name is required for the registration or not
 	When User fills the entire form excluding last name
  And Click on submit button
 	Then User should get error message about last name
 	
Scenario: Verifying first name is required for the registration or not
 	When User fills the entire form excluding first name
  And Click on submit button
 	Then User should get error message about first name
 	
Scenario: Verifying email id is required for the registration or not
 	When User fills the entire form excluding email id
  And Click on submit button
 	Then User should get error message about email id
 	
Scenario: Verifying email follows the required format
 	When User fills the entire form with email id without following format
  And Click on submit button
 	Then User should get error message about format of email id
 	
Scenario: Verifying phone number is required for the registration or not 
 	When User fills the entire form excluding phone number
  And Click on submit button
 	Then User should get error message about phone number
 	
Scenario: Verifying phone number accept character for the registration or not 
 	When User fills the entire form with character in phone number
  And Click on submit button
 	Then User should get error message about format of phone number
 	
 Scenario: Verifying phone number follows the format for the registration or not 
 	When User fills the entire form with phone number not following format:
 		|123654789|
 		|12365478901|
  And Click on submit button
 	Then User should get error message about format of phone number
 	
Scenario: Verifying selection of gender is required for the registration or not
 	When User fills the entire form excluding selection of gender
  And Click on submit button
 	Then User should get error message about gender selection
 	
Scenario: Verifying selection of country is required for the registration or not
 	When User fills the entire form excluding selction of country
  And Click on submit button
 	Then User should get error message about country selection
 	
 	
 	