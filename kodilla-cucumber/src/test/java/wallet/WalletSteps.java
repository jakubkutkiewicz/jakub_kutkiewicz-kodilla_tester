package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });
        Given("I have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);

        });


        Given("I have deposited -$200 in my wallet", () -> {
            wallet.deposit(-200);
        });

        When("I check balance", () -> {
            wallet.getBalance();
        });

        Then("deposit should be 0", () -> {
            assertEquals(0, cashSlot.getContents());
        });


        Given("have deposited $50 in my wallet", () -> {
          wallet.deposit(50);
        });

        When("I request $200", () -> {
          wallet.debit(200);
        });

        Then("no money should be dispensed", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("I don't have enough money in my wallet", 0, cashSlot.getContents());
        });
        Then("$200 should be dispensed", () -> {

        });


    }
}