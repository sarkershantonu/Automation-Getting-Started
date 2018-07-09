Feature: Subtraction

  Scenario: Subtracting two float
    Given I want to test calculator
    When I insert 5.5 and 6.5 for subtraction
    Then I got -1.0 as result

  Scenario Outline: Subtracting two integer
    Given I want to test calculator
    When I insert <a> and <b> for subtraction
    Then I got <c> as result
    Examples:
      | a | b | c |
      | 200 | 50 | 150 |
      | 300| 90 | 210 |

