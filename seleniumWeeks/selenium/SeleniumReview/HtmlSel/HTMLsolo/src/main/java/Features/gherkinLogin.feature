@tag
  Feature: login user implementation
    Scenario User is able to login with valid user and password
      Given Entered username and password in given field
      When Clicked on login button
      Then User directed to the shopping page
