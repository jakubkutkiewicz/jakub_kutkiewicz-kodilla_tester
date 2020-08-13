Feature: Cash deposit and withdraw
    Scenario: Successful deposit and withdraw the same amount
        Given have deposited $200 in my wallet
        When  request $200
        Then $200 should be dispensed