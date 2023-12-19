Feature: Usermenu Scenerios
Background:Launching the application for each testcase
Given User launch application

Scenario: Create Account
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "CreateAccountPage"
Then User Click on Button "accounttab"
Then Check the error mesage "acctnameverify" "Shakthi Priyal"
Then User Click on Button "newtab"
Then User Enter into the textbox "accnametextbox" "Shakthi Priyall92"
Then User selects from dropdown "typedropdown" "Technology Partner"
Then User selects from dropdown "custprioritydropdown" "High"
Then User Click on Button "savebutton"

Scenario: Create New View
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "CreateAccountPage"
Then User Click on Button "accounttab"
Then User Click on Button "newviewtab"
Then User Enter into the textbox "viewnametextbox" "nspriyal"
Then User Enter into the textbox "uniqueviewnametextbox" "107"
Then User Click on Button "savebutton"
Then Verify the name in the dropdown "actualnameindropdown" "nspriyal"

Scenario: Edit View
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "CreateAccountPage"
Then User Click on Button "accounttab"
Then User selects from dropdown "actualnameindropdown" "nspriyal"
Then User Click on Button "editlink"
Then User Enter into the textbox "viewnametextbox" "nspriyalns"
Then User selects from dropdown "fielddropdown" "Account Name"
Then User selects from dropdown "operatordropdown" "contains"
Then User Enter into the textbox "valuetextbox" "a"
Then User Click on Button "savebutton"
@smoke
Scenario: Merge Accounts
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "CreateAccountPage"
Then User Click on Button "accounttab"
Then User Click on Button "mergeaccountlink"
Then User Enter into the textbox "accttextbox" "Shakthi"
Then User Click on Button "findacctbutton"
Then User Click on Button "nextbutton"
Then User Click on Button "mergebutton"
Then User should handle the alert