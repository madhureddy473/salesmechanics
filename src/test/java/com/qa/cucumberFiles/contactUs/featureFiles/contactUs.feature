Feature: ContactUS

  Scenario Outline: GeneralQuestions_Feedback
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User validates the Contact Us page is open "<legalFirstName>", "<legalLastName>", "<emailAddress>", "<serviceType>", "<sendDt>", "<sendCountry>", "<receiveCountry>"

    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | legalFirstName | legalLastName | serviceType | sendDt | sendCountry | receiveCountry | emailAddress |



  Scenario Outline: Complaint
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User validates the Complaint form is open "<legalFirstName>", "<legalLastName>", "<emailAddress>", "<serviceType>", "<sendDt>", "<sendCountry>", "<receiveCountry>"

    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | legalFirstName | legalLastName | serviceType | sendDt | sendCountry | receiveCountry | emailAddress |




  Scenario Outline: Report_Fraud
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User reports the Fraud "<legalFirstName>", "<legalLastName>", "<emailAddress>", "<serviceType>", "<referenceNumber>", "<paymentDt>", "<senderFirstName>", "<senderLastName>"

    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | legalFirstName | legalLastName | serviceType | referenceNumber | paymentDt | senderFirstName | emailAddress | senderLastName |



  Scenario Outline: SSPTrackTransfer_offline
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open and SSP page is open
    And User enters the details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|referenceNumber|sendersLastName|sendersDOB|receiversLastName|





  Scenario Outline: SSPTrackTransfer_Online
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    Then User sends amount and validates confirmation page
    And User validates Online that the home page is open and SSP page is open
    And User enters the Online details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|registrationPhonePrefix|receiverPhoneNumberCount|addReceiverPhoneNo|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|creditCardNumber|expiryMonth|expiryYear|cvv|referenceNumber|sendersLastName|sendersDOB|receiversLastName|




  Scenario Outline: SSPEditTransfer_offline
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And offline User validates that the home page is open and SSP page is open
        #And User enters the details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"
    And User enters the edit offline details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>", "<rcvsecondLastName>", "<emailAddress>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|referenceNumber|sendersLastName|sendersDOB|receiversLastName|rcvsecondLastName|emailAddress|




  Scenario Outline: SSPEditTransfer_Online
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    Then User sends amount and validates confirmation page
    And User validates Online that the home page is open and SSP page is open
    And User enters the Online details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"
        #And User validates that the home page is open and SSP page is open
        #And User validates Online that the home page is open and SSP page is open
    And User edit online the details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>", "<rcvsecondLastName>", "<emailAddress>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|registrationPhonePrefix|receiverPhoneNumberCount|addReceiverPhoneNo|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|creditCardNumber|expiryMonth|expiryYear|cvv|referenceNumber|sendersLastName|sendersDOB|receiversLastName|



  Scenario Outline: SSP_Cancel_Transfer_offline
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And offline User validates that the home page is open and SSP page is open
    And The User enters the details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>", "<emailAddress>"


    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|referenceNumber|sendersLastName|sendersDOB|receiversLastName|emailAddress|




  Scenario Outline: SSPCancelOnlineTransfer
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And User validates that the home page is open but not logged in
    And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
    When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
    And User scrolls down to and clicks next button on fee estimator page
    And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
    Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" saves it and add Additional details
    And User completes fraud warning page
    Then User sends amount and validates confirmation page
    And User validates Online that the home page is open and SSP page is open
    And User enters the Online details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"
        #And User validates that the home page is open and SSP page is open
    And User enters the online transfer details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>"


    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|registrationPhonePrefix|receiverPhoneNumberCount|addReceiverPhoneNo|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|creditCardNumber|expiryMonth|expiryYear|cvv|referenceNumber|sendersLastName|sendersDOB|receiversLastName|





  Scenario Outline: SSPCancelMayBeLater
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    And offline User validates that the home page is open and SSP page is open
    And User enters the online transfer details "<referenceNumber>", "<sendersLastName>", "<sendersDOB>", "<receiversLastName>", "<emailAddress>"


    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|referenceNumber|sendersLastName|sendersDOB|receiversLastName|emailAddress|



