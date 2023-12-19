Feature: Usermenu Scenerios
Background:Launching the application for each testcase
Given User launch application

Scenario: Select usermenu from user dropdown
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "UsermenuPage"
Then User Click on Button "usermenudrpdwn"
Then Verify the dropdown "expectedusermenulist", "actualusermenulist"

Scenario: Select "My Profile" option from user menu drop down
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "UsermenuPage"
Then User Click on Button "usermenudrpdwn"
Then User Click on Button "myprofile"
Then User Click on Button "editbtn"
Then switch to frame using ID "contactInfoContentId"
Then User Click on Button "abouttab"
Then User Enter into the textbox "lastnamebox" "NatarajanAdhi"
Then User Click on Button "saveallbtn"
Then switch to webpage
Then User Click on Button "postlink"
Then switch to frame using Index
Then User Enter into the textbox "posttextbox" "Hi! im doing automation"
Then switch to webpage
Then User Click on Button "sharebtn"
Then User Click on Button "filelink"
Then User Click on Button "uploadfilelink"
Then User Enter into the textbox "choosefilelink" "/Users/lpg/Pictures/samplepic.JPG"
Then User Click on Button "filesharebtn"
Then User Upload the photo "uploadphotomousehover"
Then User Click on Button "addphotolink"
Then switch to frame using ID "uploadPhotoContentId"
Then User Enter into the textbox "choosephoto" "/Users/lpg/Pictures/samplepic.JPG"
Then User Click on Button "savebutton"
Then User Click on Button "saveaftercropbutton"
Then switch to webpage

Scenario: Select "My Settings" option from user menu drop down
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "UsermenuPage"
Then User Click on Button "usermenudrpdwn"
Then User Click on Button "mysettings"
Then User Click on Button "personallink"
Then User Click on Button "loghistorylink"
Then Verify user is in page "Login History ~ Salesforce - Developer Edition"
Then User Click on Button "loginhistorydownloadlink"
Then User Click on Button "displayoutlink"
Then User Click on Button "customtablink"
Then User selects from dropdown "customappdrpdown" "Salesforce Chatter"
Then User selects from dropdown "addreports" "Reports"
Then User Click on Button "addbutton"
Then User Click on Button "emaillink"
Then User Click on Button "emailsettinglink"
Then User Enter into the textbox after clear "emailnametextbox" "Shakthi Priyal"
Then User Enter into the textbox after clear "emailaddresstextbox" "nshakthipriyal@gmail.com"
Then User Click on Button "bccradiobutton"
Then User Click on Button "savenamebutton"
Then Verify user is in page "My Email Settings ~ Salesforce - Developer Edition"
Then User Click on Button "calandreminderlink"
Then User Click on Button "activityreminderlink"
Then User Click on Button "testbutton"
Then User Click on Button "savenamebutton"

Scenario: Select "Developer console" option from user menu drop down
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "UsermenuPage"
Then User Click on Button "usermenudrpdwn"
Then User Click on Button "devconsole"
Then switch to window

Scenario: Select "Logout" option from user menu drop down
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
Given User is on "UsermenuPage"
Then User Click on Button "usermenudrpdwn"
Then User Click on Button "logout"
Then Verify user is in page "Login | Salesforce"
