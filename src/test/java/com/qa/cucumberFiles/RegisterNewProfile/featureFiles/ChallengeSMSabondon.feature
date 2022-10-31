Feature: ChallengeSMSabondon

  Scenario Outline: ChallengeSMSabondon
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentialss "<userName>", "<password>"
    And User validates the ID upload warning message is showing or not

    Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|addReceiverPhoneNo|requiredInfoPurposeOfFunds|registrationPhonePrefix|registrationDateOfBirth|registrationAddressline|registrationCity|registrationPostalCode|

  Scenario Outline: ChallengeSMSabondon_CA
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentialss "<userName>", "<password>"
    And User validates the ID upload warning message is showing or not

    Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|addReceiverPhoneNo|requiredInfoPurposeOfFunds|registrationPhonePrefix|registrationDateOfBirth|registrationAddressline|registrationCity|registrationPostalCode|

  Scenario Outline: AUSMSAbondonchallenge
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentialss "<userName>", "<password>"
    And User validates the ID upload warning message is showing or not

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|
