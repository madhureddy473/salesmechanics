Feature: Registration with Plus Signin Profile Email

  Scenario Outline: RegistrationwithPlusSigninProfileEmail
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And Create a new Customer with email address and contains plus Sign in email address "<password>" "<registrationPhonePrefix>" "<registrationDateOfBirth>" "<registrationAddressline>" "<registrationCity>" "<registrationPostalCode>"
    And User Join MoneyGram With Enrolling Plus Rewards program


 Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|addReceiverPhoneNo|requiredInfoPurposeOfFunds|registrationPhonePrefix|registrationDateOfBirth|registrationAddressline|registrationCity|registrationPostalCode|



















