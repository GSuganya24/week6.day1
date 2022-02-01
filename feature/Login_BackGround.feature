Feature: Login using different credentials

Background:
Given Launch the browser
And Load the url

Scenario Outline: TC001_CreateLogin_Positive

And Enter the username as <username>
And Enter the password as <password>
When Click on the login page
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|







