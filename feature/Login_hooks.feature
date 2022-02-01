Feature: Login using different credentials

Scenario: TC001_CreateLogin_Positive

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login page
Then Homepage should be displayed

Scenario: TC002_CreateLogin_Negative

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa123'
When Click on the login page
Then Homepage should be displayed

Scenario: TC003_CreateLogin_Negative

And Enter the username as 'Demosales'
And Enter the password as 'crmsfa'
When Click on the login page
Then Homepage should be displayed
