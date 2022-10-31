Feature: sendAgain

    Scenario Outline: sendAgainCCFastsend
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks fastsend next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"

        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        And User completes fraud warning page
        And User completes fastsend Confirm
        #And User completes fastsend reveiew and send
        Then User sends amount and validates confirmation  FastSend page

        Then User perform fast send send again
        And User completes fraud warning page
        Then User Fast sends Again amount and validates confirmation page

        Examples:
            | TestCaseTitle_TestRails | TestCaseID_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount |



