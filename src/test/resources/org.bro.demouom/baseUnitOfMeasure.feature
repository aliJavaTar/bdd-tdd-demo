Feature: Base unit of measure
  In order to convert unit of measure to each other without defining the conversion rate
  for every single unit of measure
  As a procurement manager
  I want to be abele to define a base unit of measure for a dimension

  Scenario: Defining a base unit of measure
    Given  I have already defined the 'Mass' as dimension
    When   I define the following unit of measure
      | name | symbol |
      | gram | gr     |
    And Assign it to 'Mass' dimension
    Then 'Gram' is the base unit of measure 'Mass'

  Scenario: Defining more than one base unit of measure for a dimension
    Given  I have already defined the 'Mass' as dimension
    And I have already defined the 'gram' as base unit of mesure for 'Mass'
    When   I define the following unit of measure
      | name     | symbol |
      | Kilogram | kg     |
    And Assign it to 'Mass' dimension
    Then I should get and error saying that 'the dimension already has a base unit of measure'

