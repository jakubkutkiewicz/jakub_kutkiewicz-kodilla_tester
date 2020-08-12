Feature: Minus Deposit
    Scenario: Unsuccessful deposit
        Given I have deposited -$200 in my wallet
        When I check balance
        Then deposit should be 0
