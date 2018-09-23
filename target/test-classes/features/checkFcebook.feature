Feature: Check Facebook functional
  Scenario: Check current url
    Given I have open the browser
    When I open https://www.facebook.com/ website
    Then Check current url is https://www.facebook.com/

