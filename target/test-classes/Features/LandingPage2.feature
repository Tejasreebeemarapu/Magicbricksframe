 Feature: Magicbricks Landing
 #Scenario: Validate User navigates to postproperty
  #Given Chrome is opened and MagicBrick app is launched
   #Then User navigates on landing page
   #And Landing page fields are enabled
   #When User clicks on postproperty 
   #Then User navigates to postproperty page
   
   Scenario Outline: validate User enter number with valid data
    Given Chrome is opened and MagicBrick app is launched
    Then User navigates on landing page
    When User clicks on postproperty 
    Then User navigates to postproperty page  
    When User enters valid number "<ownerMobile>"
    Then User navigates to sell and Rent property
    
    Examples:
    |ownerMobile|
    |7675825092 |
    |8897341443|
    
    
    Scenario Outline: validate user enter  number with invalid data
    Given Chrome is opened and MagicBrick app is launched
    Then User navigates on landing page
    When User clicks on postproperty
    Then User navigates to postproperty page   
    When User enters invalid number "<ownerMobile>"
    Then User get error message
    
    Examples:
    |ownerMobile |
    |0000000000 |
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    #(//a[text()='Post Property'])
    #(//*[@for='Owner'])
     #(//a[text()='Post Property'])
    #(//*[@for='Owner'])