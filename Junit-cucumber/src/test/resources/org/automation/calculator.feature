Feature: Addition

  Scenario: adding two integer
    Given I want to test calculator
    When I in insert 5 and 6
    Then I got 11 as result

  Scenario: adding two float
    Given I want to test calculator
    When I in insert 5.5 and 6.5
    Then I got 12 as result
