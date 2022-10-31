Feature: payBills

    Scenario Outline: payBillsPayAgain
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"

        And User search for Survey Biller Name and PayBills "<feeEstimatorPaymentMethodOption>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it from the PayBills
        And User Adds Additional Details in the PayBills
        And User completes PayBills fraud warning page
        Then User sends amount and validates Pay Bills confirmation page

        And User select Pay again and completes PayBills "<feeEstimatorPaymentMethodOption>"
        And User completes PayBills fraud warning page
        Then User sends amount and validates Pay Bills confirmation page


        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|billerName|





