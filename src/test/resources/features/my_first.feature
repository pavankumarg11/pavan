Feature: Gmail Login
  As a user I should able to login into Gmail.

  Scenario: I login with valid credential
    Given I navigate to "http://apps.zambientsystems.com:8080/POIZON/admin"
    And I enter "12345" into input field having id "userid"
    When I click on element having class "btnstyles"
    Then I wait 5 seconds for element having class "hasDatepicker" to display