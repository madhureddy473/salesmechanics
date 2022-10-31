Feature: addEditDeleteCardViaHomePage

  Scenario Outline: addCardViaHomePage
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"

    When User opens up the profile page
    Then User adds card from profile page creditCardNumber "<creditCardNumber>" expiryMonth "<expiryMonth>" expiryYear "<expiryYear>" cvv "<cvv>"
    Then User edits card from profile page cvv "<cvv>"
    Then User deletes card from profile page via from Home Page
    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | userName | password | creditCardNumber | expiryMonth | expiryYear | cvv |


  Scenario Outline: EditMobileNumber
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"

    When User opens up the profile page
    Then User adds card from profile page creditCardNumber "<creditCardNumber>" expiryMonth "<expiryMonth>" expiryYear "<expiryYear>" cvv "<cvv>"
    Then User edits card from profile page cvv "<cvv>"
    Then User deletes card from profile page
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|creditCardNumber|expiryMonth|expiryYear|cvv|





