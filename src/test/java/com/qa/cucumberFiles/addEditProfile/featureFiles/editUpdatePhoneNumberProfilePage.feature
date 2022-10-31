Feature: addEditDeleteCardViaHomePage

  Scenario Outline: editUpdatePhoneNumberViaProfilePage
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    When User opens up the profile page
    When User click on Mobile number Edit button in the  profile page
    Then User update the Mobile number and Verify "<registrationPhonePrefix>"

    #Then User adds card from profile page creditCardNumber "<creditCardNumber>" expiryMonth "<expiryMonth>" expiryYear "<expiryYear>" cvv "<cvv>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|creditCardNumber|expiryMonth|expiryYear|cvv|registrationPhonePrefix|






