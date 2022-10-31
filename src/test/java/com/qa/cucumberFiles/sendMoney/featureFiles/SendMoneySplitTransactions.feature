Feature: SendMoneySplitTransactions

    Scenario Outline: SendMoneySplitTransactions
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
        And User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
#        And User fills out first part of required information page if available "<requiredInfoIDType>" "<requiredInfoCountryOfIssue>" "<requiredInfoIDNo>" "<requiredInfoExpDateDate>" "<requiredInfoExpDateMonth>" "<requiredInfoExpDateYear>" "<requiredInfoSourceOfFunds>" "<requiredInfoRelationToReceiver>" "<requiredInfoPurposeOfTransaction>" "<requiredInfoOccupation>" "<requiredInfoCountryOfCitizenship>" "<requiredInfoPurposeOfFunds>"
#        And User fills out second part of required information page "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReAccountNumberEightDigits>" "<requiredInfoIBANNo>" "<requiredInfoIFSCCode>" "<requiredInfoBICNumber>" "<requiredInfoBankNameAllCaps>" "<requiredInfoAddressLineOne>" "<requiredInfoCity>" "<requiredInfoStateProvince>" "<requiredInfoPostalCode>" "<requiredInfoReceiverMobileNo>" "<receiverDirection1>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
        And User completes fraud warning page
#        And User completes moneyGram alert page
        Then User sends amount and validates confirmation page
    Examples:
        |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|

