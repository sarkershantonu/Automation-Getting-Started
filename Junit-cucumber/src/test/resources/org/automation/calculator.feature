Feature: Addition

  Scenario: adding two float
    Given I want to test calculator
    When I in insert 5.5 and 6.5
    Then I got 12 as result

  Scenario Outline: adding two integer
    Given I want to test calculator
    When I in insert <a> and <b>
    Then I got <c> as result
    Examples:
      | a | b | c |
      | 5 | 6 | 11 |
      | 12| 9 | 21 |

