Feature: SendTocardTodifferentCardTypes

    Scenario Outline: SendToUStoUSCheckoutCardFail
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with USA checkout card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        And validation message for credit card details

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|



    Scenario Outline: SendToUStoSpainCheckoutCardFail
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with Spain checkout card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        And validation message for credit card details

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|



    Scenario Outline: SendToUKtoUKCheckoutCardPass
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with UK checkout card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        #And A User scrolls down to and clicks next button on Payment Information page
        And User completes fraud warning page
        Then User sends amount and validates confirmation page

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|




    Scenario Outline: SendToUStoUSCybersourceCardPass
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with USA cybersource card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        #And A User scrolls down to and clicks next button on Payment Information page
        And User completes fraud warning page
        Then User sends amount and validates confirmation page

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|




    Scenario Outline: SendToUStoSpainCybersourceCardPass
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with spain cybersource card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        #And A User scrolls down to and clicks next button on Payment Information page
        And User completes fraud warning page
        Then User sends amount and validates confirmation page

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|




    Scenario Outline: SendToUKtoUKCybersourceCardFail
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with UK cybersource card details "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

       #And validation message for credit card details
        And validation message for GB credit card details

        Examples:
            |TestCaseID_TestRails|TestCaseTitle_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|creditCardNumber| expiryMonth|expiryYear|cvv|bankForReceiverOption|receiverCity|requiredInfoIDType|requiredInfoCountryOfIssue|requiredInfoIDNo|requiredInfoExpDateDate|requiredInfoExpDateMonth|requiredInfoExpDateYear|requiredInfoSourceOfFunds|requiredInfoRelationToReceiver|requiredInfoPurposeOfTransaction|requiredInfoOccupation|requiredInfoCountryOfCitizenship|requiredInfoAccountNumberEightDigits|requiredInfoReAccountNumberEightDigits|requiredInfoIBANNo|requiredInfoIFSCCode|requiredInfoBICNumber|requiredInfoBankNameAllCaps|requiredInfoAddressLineOne|requiredInfoCity|requiredInfoStateProvince|requiredInfoPostalCode|requiredInfoReceiverMobileNo|receiverDirection1|addReceiverPhoneNo|requiredInfoPurposeOfFunds|receiverDebitCardNumber|registrationPhonePrefix|receiverPhoneNumberCount|


