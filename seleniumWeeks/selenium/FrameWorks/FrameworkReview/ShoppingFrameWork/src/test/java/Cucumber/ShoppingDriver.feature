@tag
  Feature: Purchase the order from Ecommerce Website
    I want to use this template for my feature file

#    Executes Before every scenario
    Background:
      Given I landed on Ecommerce Page

    @tag2
    Scenario Outline: Positive Test of ShoppingDriver order
      Given Logged in with username <username> and password <password>
      When I add the product <productName> to the cart
      When Checkout <productName> and verify
      When Enter in <Country> then click check submit
      Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

      Examples:
        | username               | password    | productName | Country    |
        | fayeemajidul@gmail.com | Password123 | Zara        | Bangladesh |