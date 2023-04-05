Feature: login validation
@Smoke
Scenario: as a user should be logged in using valid creadtial
Background: Given open chrome browser
And go to facebook
When user type user Id in email box
And user type password in password box
And user click  on login button
Then user should see his profile page
Feature: login validation
@Reg
Scenario Outline: as a user should not be logged in using valid creadtial
When user type "<user Id>" in email box
And user type "<password>" in password box
And user click  on login button
Then user should not see his profile page
Examples: 
 |user Id |password|
 |user1 |jfhfhfh|
 |user2 |jfdhf|
 |user3 |fjhtgt|