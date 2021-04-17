#Author: Marcelo Koiti Yamamoto - marcelky@hotmail.com

Feature: Test search result in Question page

  @Part_1
  Scenario: Search for a non existent question
    Given user is in the Question page
    And types in the search field "Science: Computers"
    When user clicks the search button
    Then an error message is returned with "No question found."
    
    
  @Part_2
  Scenario: Search question and the results have pagination control
    Given user is in the Question page
    And types in the search field "Science: Computers"
    And select a search option per category
    When user clicks the search button
    Then it is displayed 25 elements in the current page
    Then at bottom of page there are other pages buttons and next button
    
  
  @Part_3
  Scenario: Search question and pagination control does not have previous page '<' 
    Given user is in the Question page
    And types in the search field "Science: Computers"
    And select a search option per category
    When user clicks the search button
    Then it is displayed 25 elements in the current page
    Then current results is presented at page 1
    Then the previous page '<' is not displayed before page 1
    