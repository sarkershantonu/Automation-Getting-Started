Feature: search

  Scenario: Going to Opencart and search an item
    Given I open firefox browser
    When I type http://demo.opencart.com/ and press enter
    Then I can see page loaded with title "Your Store"
    And I type Iphone in search box  And I click search button
    Then I can see search results with title "Search - Iphone"
    And I can see the search should not take more than 3 second
    #Then I can see search results with title "invalid check to prove tests "
    Then I quit browser
