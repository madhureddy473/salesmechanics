Feature: receiveRedirect_Test

  Scenario Outline: TreceiveRedirects_normal
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks fastsend next button on fee estimator page
    And User enter FS UStoUS receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    And User completes fastsend reveiew and send
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform Fast send and  perform logout
    And User logs as Receiver with credentials "<emailAddress>", "<password>"
    And User perform Transaction via Deposit Money "<receiverDebitCardNumber>"

    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | userName                       | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount | receiverDebitCardNumber | emailAddress                       |



  Scenario Outline: FSreceiveRedirects1_UStoSpain_FastSend
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks fastsend next button on fee estimator page
    And User enter FS UStoES receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    And User completes fastsend reveiew and send
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform Fast send and  perform logout

    Then Create Receiver profile by using the receiver details US to Spain by using existing login
    And User perform Spain Transaction via Deposit Money "<receiverDebitCardNumber>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|



  Scenario Outline: receiveRedirectsFS_UStoSpain_FastSend_CyberSourcePass
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks fastsend next button on fee estimator page
    And User enter FS UStoES receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    And User completes fastsend reveiew and send
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform Fast send and  perform logout
    Then Create Receiver profile by using the receiver details US to Spain by using existing login
    And User perform Spain Transaction via Deposit Money "<receiverDebitCardNumber>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|



  Scenario Outline: FSreceiveRedirects2_UStoSpain_FastSend_CheckOutFail
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks fastsend next button on fee estimator page
    And User enter FS UStoES receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    And User completes fastsend reveiew and send
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform Fast send and  perform logout
    Then Create Receiver profile by using the receiver details US to Spain by using existing login
    #And User perform Spain Transaction via Deposit Money "<receiverDebitCardNumber>"

    #Then Create Receiver profile by using the receiver details US to Spain by using existing login
    And User perform Spain Transaction via Deposit Money checkout fail "<receiverDebitCardNumber>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|



  Scenario Outline: receive_FS_Redirects_UStoSpain_FastSend_BankDeposit
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks fastsend next button on fee estimator page
    And User enter FS UStoES receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    And User completes fastsend reveiew and send
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform Fast send and  perform logout
    Then Create Receiver profile by using the receiver details US to Spain by using existing login
   # Then Create Receiver profile by using the receiver details US to Spain by using existing login
    And User perform Spain Transaction via Deposit Money Bank Account "<receiverDebitCardNumber>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|





  Scenario Outline: receiveRedirects_UStoSpain_FastSend_CyberSourcePass
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in

    And User logs in with credentials "<userName>", "<password>"
    And User opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    And User attempts to select following payment method "<feeEstimatorPaymentMethodOption>" "<feeEstimatorReceiveMethodOption>" "<bankForReceiverOption>"
    And A User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details for receive Redirect "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    Then User sends amount and validates confirmation page via Receive Redirect
    Then User perform logout
    #Then Create Receiver profile by using the receiver details US to Spain by using existing login
   # And User perform Spain Transaction via Deposit Money "<receiverDebitCardNumber>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|receiverDebitCardNumber|













