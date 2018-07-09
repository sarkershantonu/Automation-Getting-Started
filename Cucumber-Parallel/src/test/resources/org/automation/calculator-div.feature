Feature: Division

  Scenario: Dividing two float
    Given I want to test calculator
    When I insert 5.5 and 0.5 for division
    Then I got 11 as result

  Scenario: Dividing a number with ZERO
    Given I want to test calculator
    When I insert 5.5 and 0.0 for division
    Then I got Exception ArithmeticException

  Scenario Outline: Dividing two integer
    Given I want to test calculator
    When I insert <a> and <b> for division
    Then I got <c> as result
    Examples:
      | a | b | c |
      | 2000 | 200 | 10.0 |
      | 5000| 250 | 20.0 |

