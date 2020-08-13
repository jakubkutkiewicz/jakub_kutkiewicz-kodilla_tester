package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

////// 1 schema


        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });


        /////// 2 schema

        Given("I have deposited -$200 in my wallet", () -> {
            wallet.deposit(-200);
        });

        When("I check balance", () -> {
            wallet.getBalance();
            Assert.assertEquals(0, wallet.getBalance());
        });

        Then("deposit should be 0", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        ///// 3 schema

        Given("have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
        });

        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);

        });
        Then("no money should be dispensed", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("I don't have enough money in my wallet", 0, cashSlot.getContents());
        });

///// schema

        Given("have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
        });

        When("request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
          Assert.assertEquals(200,cashSlot.getContents());
        });

    }
}