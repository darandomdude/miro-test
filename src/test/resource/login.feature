Feature: Miro login

  Scenario: Authorize to miro board using login&password pair
    Given I have login page opened
    When I enter valid login and password
    Then I see board select menu
