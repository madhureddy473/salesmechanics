Feature: SendMoneyCC_SendToCard


    Scenario Outline: SendMoneyCreditCardSendToCard
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        #And A User scrolls down to and clicks next button on Payment Information page
        And User completes fraud warning page
        Then User sends amount and validates confirmation page

        Examples:
            | TestCaseID_TestRails | TestCaseTitle_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | creditCardNumber | expiryMonth | expiryYear | cvv | bankForReceiverOption | receiverCity | requiredInfoIDType | requiredInfoCountryOfIssue | requiredInfoIDNo | requiredInfoExpDateDate | requiredInfoExpDateMonth | requiredInfoExpDateYear | requiredInfoSourceOfFunds | requiredInfoRelationToReceiver | requiredInfoPurposeOfTransaction | requiredInfoOccupation | requiredInfoCountryOfCitizenship | requiredInfoAccountNumberEightDigits | requiredInfoReAccountNumberEightDigits | requiredInfoIBANNo | requiredInfoIFSCCode | requiredInfoBICNumber | requiredInfoBankNameAllCaps | requiredInfoAddressLineOne | requiredInfoCity | requiredInfoStateProvince | requiredInfoPostalCode | requiredInfoReceiverMobileNo | receiverDirection1 | addReceiverPhoneNo | requiredInfoPurposeOfFunds | receiverDebitCardNumber | registrationPhonePrefix | receiverPhoneNumberCount |



    Scenario Outline: sendMoneySTCPakistan
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with test datasheet "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>" "<receiverDebitCardNumber>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        #And A User scrolls down to and clicks next button on Payment Information page
        And User completes fraud warning page
        Then User sends amount and validates confirmation page
        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|




