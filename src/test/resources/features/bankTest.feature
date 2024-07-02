Feature: XYZ Bank Test

  Background: I am On Homepage

  @sanity @regression
  Scenario Outline: Bank Manager should add customer successfully
    Given I click On Bank Manager Login Tab
    And I click On Add Customer Tab
    Then I enter First Name "<fName>"
    And I enter LastName "<lName>"
    And I enter PostCode "<postCode>"
    And I click On Add Customer Button
    And I should verify message Customer added successfully
    Then I click on ok button on popup.
    Examples:
      | fName  | lName   | postCode |
      | Prime  | Testing | CV23 1BY   |

  @smoke @regression
  Scenario: Bank Manager should open account successfully
    Given I click On Bank Manager Login Tab
    And I click On Open Account Tab
    Then I Search customer that is created first
    And I Select currency Pound
    And I click on process button
    And I should verify message Account created successfully
    Then I click on ok button on popup.

  @regression
  Scenario:As a Customer, I should login and log out successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    Then I should verify Logout Tab displayed.
    And I click on Logout
    Then I should verify Name text displayed.

  @regression
  Scenario:As a Customer, I should Deposit money successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    And I click on Deposit Tab
    Then I Enter amount "1000"
    And I click on Deposit Button
    Then I should verify message Deposit Successful


  @regression
  Scenario:As a Customer, I should Withdraw money successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    And I click on Withdrawl Tab
    Then I Enter amount "50"
    And I click on Withdraw Button
    Then I should verify message Transaction successful
