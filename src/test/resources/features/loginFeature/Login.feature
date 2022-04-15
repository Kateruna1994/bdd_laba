Feature: Login to application

  Scenario: Fill in the registration form
    Given I am on the main page
    When I go to the account registration page
    And I enter First name
    And I enter Last name
    And I enter email
    And I enter Telephone
    And I enter Password
    And I enter Password Confirm
    And I check on check box
    And I click on continue button
    Then The test appeared 'Your Account Has Been Created!'
