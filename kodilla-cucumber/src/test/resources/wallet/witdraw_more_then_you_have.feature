Feature: Withdraw more then you have
    Scenario: Unsuccessful withdraw more amount then you have
        Given I have deposited $50 in my wallet
        When I request $200
        Then no money should be dispensed