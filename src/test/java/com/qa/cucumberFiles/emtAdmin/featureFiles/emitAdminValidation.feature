Feature: EMTAdmin


  Scenario Outline: SendMoneyEMT_TransactionSearch
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
    Then User Get TRAN ID from Database by Reference Number
    Then User Navigate to EMT Admin and Validate fields
    Examples:
      | TestCaseTitle_TestRails | TestCaseID_TestRails | userName | password | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount |




  Scenario Outline: SendMoneyEMT_CancelTransaction
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
    Then User Get TRAN ID from Database by Reference Number
    Then User Navigate to EMT Admin and Cancel Tansaction
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|




  Scenario Outline: SendMoneyEMT_ProfileSearch
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
    Then User Get ReferenceNo and search profile in EMT portal
       # Then User Navigate to EMT Admin and Cancel Tansaction
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|



  Scenario Outline: SendMoneyEMT_CustomerProfileComments
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
    Then User Get ReferenceNo and search profile in EMT portal
    Then User updates comments in EMT portal
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|




  Scenario Outline: SendMoneyEMT_UpdateConsumerstatus
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
    Then User Get ReferenceNo and search profile in EMT portal
    Then User Update Consumer Status profile in EMT portal
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|





  Scenario Outline: SendMoneyEMT_ValidateUserAdmin
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
    Then User Search Admin profile in EMT portal

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|



  Scenario Outline: SendMoneyEMT_ValidateReporting
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
    Then User Get TRAN ID from Database by Reference Number
    Then User Search Reporting-Ad hoc in EMT portal

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|



  Scenario Outline: EMTAdmin_ValidateMetadata
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then Validate Metadata
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_SearchResults
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then Validate Consumer Profile Search Results

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ProfileSearch_CustID
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User search profile in EMT portal with ConsumerID

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_Dashboard
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Consumer Profile Dashboard

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|



  Scenario Outline: EMTAdmin_ValidateConsumerProfile_BankAccounts
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Consumer Bank accounts for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_CreditCardAccounts
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates CreditCard Accounts for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_DebitCardAccounts
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates DebitCard Accounts for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|



  Scenario Outline: EMTAdmin_ValidateConsumerProfile_RecurPayments
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then user validates Recurring Payments for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_InStoreTransactions
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates In-Store Transactions for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_PersonToPersonTransactions
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Person-To-Person Transactions for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_IPHistorySummary
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then user validates IP History Summary for "<userName>"

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateHeaders
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    When User search profile in EMT portal with "<userName>"
    Then Validate Headers

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_Information
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    When User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Consumer Profile Information

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_Comments
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    When  User search profile in EMT portal with "<userName>"
    Then  User navigates to Consumer details
    Then User validates Consumer Profile Comments

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_ActivityLog
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    When  User search profile in EMT portal with "<userName>"
    Then  User navigates to Consumer details
    Then User validates Consumer profile Activity Log

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidateConsumerProfile_LexisNexisActivityLog
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    When  User search profile in EMT portal with "<userName>"
    Then  User navigates to Consumer details
    Then User validate Lexis Nexis Activity Log
    
    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|

  Scenario Outline: EMTAdmin_ValidateConsumerProfile_IDHistory
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates ID History

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|


  Scenario Outline: EMTAdmin_ValidatePersonToPersonTransactionsData_Links
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Person-To-Person Transactions Links

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|

  Scenario Outline: EMTAdmin_ValidateConsumerProfileDashboard_Links
    Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
    Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
    Then User search profile in EMT portal with "<userName>"
    Then User navigates to Consumer details
    Then User validates Consumer Profile Dashboard Links

    Examples:
      |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|

