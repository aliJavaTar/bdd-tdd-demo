Feature: Managing Measurement Dimensions
  In order to categorize unit of measure and convert them to each other only  in their dimensions
  As a procurement manager
  I want to be able to define measurement dimension



  Scenario: Defining dimensions
    Given I have  enteres as procument manager
    When I difine the following dimensions
    | Name | Symbol |
    | Mass | m      |
    Then  I should be able to see the dimensions in the list of  dimensoins
