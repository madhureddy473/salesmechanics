Feature: Send Money Pay With Cash

  Scenario Outline: SendMoney_CreditCard_PayWithCash

    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select PaywithCash payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>" and location "<pwcAddress>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    And User enter Driver License Additional Information Details
    And User completes fraud warning page
    Then User sends amount and validates Ready to Pay confirmation page


    Examples:
      | TestCaseTitle_TestRails           | TestCaseID_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount | pwcAddress                  |



  Scenario Outline: SendMoney_CreditCardPayWithCashGB

    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select PaywithCash payment method GB "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>" and location "<pwcAddress>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    And User enter Driver License Additional Information Details
    And User completes fraud warning page
    Then User sends amount and validates Ready to Pay confirmation page



    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|pwcAddress|


  Scenario Outline: SendMoneyCreditCard_PayWithCashCA

    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select PaywithCash payment method CA "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>" and location "<pwcAddress>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
   # And User enter Driver License Additional Information Details
    And User completes fraud warning page
    Then User sends amount and validates Ready to Pay confirmation page



    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|pwcAddress|
