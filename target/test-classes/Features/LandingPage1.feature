Feature: MagicBricks Landing
 
  Scenario: Validate that user navigates to landing page
    Given Chrome is opened and MagicBrick app is launched
    Then User navigates on landing page

 Scenario: Validate Landing page UI
   Given Chrome is opened and MagicBrick app is launched
   Then User navigates on landing page
   And Landing page fields are enabled 
    
    
    Scenario: Validate Landing Page  Fields(login button is clickable)
    Given Chrome is opened and MagicBrick app is launched
    Then User navigates on landing page
    When User clicks on login button
    Then User navigates to login page

 
 

