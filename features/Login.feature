Feature: Login Scenerios
Background:Launching the application for each testcase
Given User launch application

Scenario: Verify the login with valid username and valid password
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
Then User Enter into the textbox "pwd" "Priyag123"
Then User Click on Button "loginbtn"
  
Scenario: Login with no password field and check error message
  Given User is on "LoginPage"
  Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
  Then User Enter into the textbox "pwd" ""
  Then User Click on Button "loginbtn" 
  Then Check the error mesage "errormsg" "Please enter your password."

Scenario: Login with clicking on Remember me checkbox
  Given User is on "LoginPage"
  Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
  Then User Enter into the textbox "pwd" "Priyag123"
  Then User Click on Button "rememberme"
  Then verify checkbox is selected "rememberme" "true"
  Then User Click on Button "loginbtn" 
    
Scenario: Login with clicking on Forgot password checkbox
  Given User is on "LoginPage"
  Then User Enter into the textbox "usrname" "nshakthipriyal@sand.com"
  Then User Click on Button "forgotpwd"
  Then User Enter into the textbox "forgotpwdusername" "nshakthipriyal@sand.com"
  Then User Click on Button "contbutton"
  Then User Click on Button "returnlogin"
  
Scenario: Verify the login with Invalid username and Invalid password
Given User is on "LoginPage" 
Then User Enter into the textbox "usrname" "123"
Then User Enter into the textbox "pwd" "22131"
Then User Click on Button "loginbtn"
Then Check the error mesage "errormsg" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."