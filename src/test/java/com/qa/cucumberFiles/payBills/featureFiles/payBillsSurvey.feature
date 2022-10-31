Feature: payBills

    Scenario Outline: PayBills_payBillsSurvey
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"

        And User search for Survey Biller Name and PayBills "<feeEstimatorPaymentMethodOption>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it from the PayBills
        And User Adds Additional Details in the PayBills
        And User completes PayBills fraud warning page

        Then User Submit Pay Bills amount and validates confirmation page
        Then User views Pay bills Survey page and validate and perform survey

     Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|billerName|
