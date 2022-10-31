Feature: RegistrationWithLoyaltyEnrollmentnonUS

  Scenario Outline: RegistrationWithLoyaltyEnrollment_nonUS
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And Create a new Customer by using Sign Up process "<password>" "<registrationPhonePrefix>" "<registrationDateOfBirth>" "<registrationAddressline>" "<registrationCity>" "<registrationPostalCode>"
    And User Join MoneyGram With Enrolling Plus Rewards program
    And User validates the Passport ID upload and Validate the EMT Admin flow
    And User Verify Member Plus Reward Number on Dashboard Page

 Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|addReceiverPhoneNo|requiredInfoPurposeOfFunds|registrationPhonePrefix|registrationDateOfBirth|registrationAddressline|registrationCity|registrationPostalCode|


