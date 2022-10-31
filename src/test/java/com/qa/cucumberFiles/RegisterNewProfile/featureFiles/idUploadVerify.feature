Feature: RegistrationIDUploadVerify

  Scenario Outline: idUploadVerify
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And Create a new Customer by using Sign Up process "<password>" "<registrationPhonePrefix>" "<registrationDateOfBirth>" "<registrationAddressline>" "<registrationCity>" "<registrationPostalCode>"
    And User validates the Passport ID upload and Validate Passport ID Upload Option


 Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|addReceiverPhoneNo|requiredInfoPurposeOfFunds|registrationPhonePrefix|registrationDateOfBirth|registrationAddressline|registrationCity|registrationPostalCode|



