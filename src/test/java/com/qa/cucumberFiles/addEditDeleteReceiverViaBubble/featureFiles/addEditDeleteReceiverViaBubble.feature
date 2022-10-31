Feature: addEditDeleteReceiverViaBubble

    Scenario Outline: Addingreceiver_bubble
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
        And User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        And User completes fraud warning page
        Then User sends amount and validates confirmation page
        And User Click on new Add Bubble button and enter receiver details with "<receiverCountry>"

        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|


    Scenario Outline: MorethanfiveBubbles
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>"
        And User validates there are more than 5 bubbles


        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|





    Scenario Outline: ReceiverEdit_ViaBubble
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
        And User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        And User completes fraud warning page
        Then User sends amount and validates confirmation page
        And User Click on new Add Bubble button and enter receiver details with "<receiverCountry>"
        Then User validates newly added receiver Bubble and click for edit

        Examples:
            |TestCaseTitle_TestRails|TestCaseID_TestRails|userName|password|receiverCountry|receiverState|sendMoney|feeEstimatorPaymentMethodOption|feeEstimatorReceiveMethodOption|bankForReceiverOption|receiverCity|addReceiverPhoneNo|creditCardNumber|expiryMonth|expiryYear|cvv|requiredInfoAccountNumberEightDigits|requiredInfoReceiverMobileNo|requiredInfoIFSCCode|registrationPhonePrefix|receiverPhoneNumberCount|

    Scenario Outline: Deleting_Receiver_ViaBubble
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
        And User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        And User completes fraud warning page
        Then User sends amount and validates confirmation page
        And User Click on new Add Bubble button and enter receiver details with "<receiverCountry>"
        Then User verify the newly added receiver Bubble and click for edit and then Delete

        Examples:
            | TestCaseTitle_TestRails     | TestCaseID_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount |





    Scenario Outline: Viabubble_Edit_Receiver
        Given Execution solution is started and driver is initialized for the test case "<TestCaseTitle_TestRails>"
        Given Current test scenario is supported by application "<TestCaseTitle_TestRails>" "<TestCaseID_TestRails>"
        And User validates that the home page is open but not logged in
        And User logs in with credentials "<userName>", "<password>", opens fee estimator page, selects "<receiverCountry>", "<receiverState>", and sends specified amount "<sendMoney>"
        When User attempts to select following payment method "<feeEstimatorPaymentMethodOption>",  following receiving method "<feeEstimatorReceiveMethodOption>" and bank for receiver option "<bankForReceiverOption>"
        And User scrolls down to and clicks next button on fee estimator page
        And User enter receiver details with "<receiverCity>" "<addReceiverPhoneNo>" "<requiredInfoAccountNumberEightDigits>" "<requiredInfoReceiverMobileNo>" "<requiredInfoIFSCCode>" "<registrationPhonePrefix>" "<receiverPhoneNumberCount>"
        Then User enters payment information "<creditCardNumber>", "<expiryMonth>", "<expiryYear>" and "<cvv>" and saves it
        And User completes fraud warning page
        Then User sends amount and validates confirmation page
        And User Click on new Add Bubble button and enter receiver details with "<receiverCountry>"
        Then User validates newly added receiver Bubble and click for edit

        Examples:
            | TestCaseTitle_TestRails | TestCaseID_TestRails | userName              | password  | receiverCountry | receiverState | sendMoney | feeEstimatorPaymentMethodOption | feeEstimatorReceiveMethodOption | bankForReceiverOption | receiverCity | addReceiverPhoneNo | creditCardNumber | expiryMonth | expiryYear | cvv | requiredInfoAccountNumberEightDigits | requiredInfoReceiverMobileNo | requiredInfoIFSCCode | registrationPhonePrefix | receiverPhoneNumberCount |








