Feature: LoyaltyEnrollment_send_Trans

    Scenario Outline: LoyaltyEnrollment_send

        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
       # And Create a new Customer by using Sign Up process "<password>" "<registrationPhonePrefix>" "<registrationDateOfBirth>" "<registrationAddressline>" "<registrationCity>" "<registrationPostalCode>"
        And Create a new Customer by using Sign Up processs "<password>" "<registrationPhonePrefix>" "<registrationDateOfBirth>" "<registrationAddressline>" "<registrationCity>" "<registrationPostalCode>"


        And User Join MoneyGram With Enrolling Plus Rewards program
        And User Verify Member Plus Reward Number on Dashboard Page
        And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
        And A User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
        #Then A User enters Bank Account Information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
        And User completes fraud warning page
        Then User sends amount and validates confirmation page

        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|


