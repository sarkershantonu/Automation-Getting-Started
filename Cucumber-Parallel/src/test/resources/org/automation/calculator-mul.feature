Feature: Multiplication

  Scenario: Multiplying two float
    Given I want to test calculator
    When I insert 5.5 and 6.5 for multiplication
    Then I got 35.75 as result

  Scenario Outline: Multiplying two integer
    Given I want to test calculator
    When I insert <a> and <b> for multiplication
    Then I got <c> as result
    Examples:
      | a | b | c |
      | 5 | 6 | 30 |
      | 12| 9 | 108 |

