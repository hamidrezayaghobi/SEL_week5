@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5  	|
      | 2     | 2      | 4	    |




  Scenario: calculate square root of a divided by b
    Given Two input values, 8 and 2
    When I calculate the square root of a divided by b
    Then I expect the return 2

  Scenario Outline: calculate square root of a divided by b
    Given Two input values, <a> and <b>
    When I calculate the square root of a divided by b
    Then I expect the return <result>

    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 12 | 3 | 2      |
      | 16 | 2 | 2      |
      | 12 | 0 | -1     |
      | 13 | -1| -1     |