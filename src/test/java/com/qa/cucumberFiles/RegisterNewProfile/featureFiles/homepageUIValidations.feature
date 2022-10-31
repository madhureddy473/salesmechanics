Feature: RegistrationWithLoyaltyEnrollment

  Scenario Outline: Homepage_summaryContent
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And user verifies summary content



 Examples:
   | TestCaseID_TestRails | TestCaseTitle_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | creditCardNumber | expiryMonth | expiryYear | cvv | bankForReceiverOption | receiverCity | requiredInfoIDType | requiredInfoCountryOfIssue | requiredInfoIDNo | requiredInfoExpDateDate | requiredInfoExpDateMonth | requiredInfoExpDateYear | requiredInfoSourceOfFunds | requiredInfoRelationToReceiver | requiredInfoPurposeOfTransaction | requiredInfoOccupation | requiredInfoCountryOfCitizenship | requiredInfoAccountNumberEightDigits | requiredInfoReAccountNumberEightDigits | requiredInfoIBANNo | requiredInfoIFSCCode | requiredInfoBICNumber | requiredInfoBankNameAllCaps | requiredInfoAddressLineOne | requiredInfoCity | requiredInfoStateProvince | requiredInfoPostalCode | requiredInfoReceiverMobileNo | receiverDirection1 | addReceiverPhoneNo | requiredInfoPurposeOfFunds |









  Scenario Outline: Homepage_WhatsnewContent
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And user verifies Whatsnew content


    Examples:
      |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|











