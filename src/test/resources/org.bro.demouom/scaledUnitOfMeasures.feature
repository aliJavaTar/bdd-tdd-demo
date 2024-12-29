Feature: Managing Measurement Dimensions
  In order to convert unit of measure that are convertable to bass with a conversion rate
  As a procurement manager
  I want to be able to define scaled unit of measurement

  Background:
    Given  I have defined the 'Mass' as dimension

  Scenario: Defining a scaled unit of measure
    Given  I have defined the 'Gram' as base unit of mesure for 'Mass'
    When   I define the following scaled unit of measure
      | name     |  | symbol | Dimension | ConversionRate |
      | Kilogram |  | kg     | mass      | 1000           |

    Then I should be able to see 'kilogram' in the list of unit of mesure of 'Mass'


  Scenario: Converting a scaled unit of measure

    Given  I have defined the 'Gram' as base unit of mesure for 'Mass'
    And    I have defined the Following scaled unit of measure
      | name     |  | symbol | Dimension | ConversionRate |
      | Kilogram |  | kg     | mass      | 1000           |
    When  I convert the '20KG' to 'Gram'
    Then  the result should be '20000'


  Scenario: Converting a scaled unit of measure

    Given I have defined the 'Gram' as base unit of mesure for 'Mass'
    And   I have defined the Following scaled unit of measure

      | name     |  | symbol | Dimension | ConversionRate |
      | Kilogram |  | kg     | mass      | 1000           |

    And  I have defined the Following scaled unit of measure
      | name  |  | symbol | Dimension | ConversionRate |
      | Tonne |  | TN     | mass      | 1000000        |
    When  I convert the '20T' to 'Kilogram'
    Then  the result should be '10000'





