Feature: This feature is about logging out of the system

  Scenario: Successful logout
    Given I have opened homepage
    When I select My account menu
    And I select Logout
    Then I have logged out