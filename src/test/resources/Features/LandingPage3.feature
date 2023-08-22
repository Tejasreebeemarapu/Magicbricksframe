Feature: Landing
Scenario Outline: validate User enter number with valid data
    Given Chrome is opened and MagicBrick app is launched
    Then User navigates on landing page
    When User clicks on postproperty 
    Then User navigates to postproperty page
    When User clicks on Owner button 
    When User fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User navigates to sell and Rent property
    
    Examples:
    |  SheetName   |RowNumber|
    |  Sheet1      |    0    |
    |  Sheet1      |    1    |
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    #When User enters valid number "<ownerMobile>"