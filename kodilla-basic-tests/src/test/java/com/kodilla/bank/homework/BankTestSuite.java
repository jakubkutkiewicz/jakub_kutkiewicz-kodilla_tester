package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {

    @Test
    public void shouldAdd3CashMachines() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());

        int cmNumber = bank.cm.length;

        assertEquals(3, cmNumber);
    }

    @Test
    public void shouldReturnZeroSaldo() {
        Bank bank1 = new Bank();
        bank1.addCashMachine(new CashMachine());
        bank1.addCashMachine(new CashMachine());
        bank1.addCmTransaction(0, 0);
        bank1.addCmTransaction(1, 0);

        double bank = bank1.getTotalSaldo();
        assertEquals(0, bank);
    }

    @Test
    public void shouldCalculateCorrectSaldo() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCmTransaction(0, 200);
        bank.addCmTransaction(0, 200);
        bank.addCmTransaction(0, -400);
        bank.addCmTransaction(0, 400);
        bank.addCmTransaction(1, 400);
        bank.addCmTransaction(1, -100);
        bank.addCmTransaction(1, 0);

        double saldo = bank.getTotalSaldo();
        assertEquals(700, saldo, 0.01);
    }

    @Test
    public void shouldReturnZeroCash() {
        Bank bank1 = new Bank();
        bank1.addCashMachine(new CashMachine());
        bank1.addCashMachine(new CashMachine());
        bank1.addCmTransaction(1, 0);
        bank1.addCmTransaction(0, 0);
        bank1.addCmTransaction(0, 0);
        assertEquals(0, bank1.getOutAll());
    }

    @Test
    public void shouldReturnCorrectInCashCount() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCmTransaction(0, 200);
        bank.addCmTransaction(1, 400);
        bank.addCmTransaction(1, -400);
        bank.addCmTransaction(0, 400);
        bank.addCmTransaction(1, 00);

        assertEquals(3, bank.getInAll());
    }

    @Test
    public void shouldReturnCorrectOutCashCount() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCmTransaction(0, -200);
        bank.addCmTransaction(1, 400);
        bank.addCmTransaction(1, -400);
        bank.addCmTransaction(0, -400);
        bank.addCmTransaction(1, 00);

        assertEquals(3, bank.getOutAll());
    }

    @Test
    public void shouldReturnZeroAvg() {
        Bank bank1 = new Bank();
        bank1.addCashMachine(new CashMachine());
        bank1.addCashMachine(new CashMachine());
        bank1.addCmTransaction(0, 0);
        bank1.addCmTransaction(0, 0);
        bank1.addCmTransaction(0, 0);
        assertEquals(0, bank1.getOutAvg());
        assertEquals(0, bank1.getInAvg());
    }

    @Test
    public void shouldReturnAvgInCash() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCmTransaction(1, 100);
        bank.addCmTransaction(2, 50);
        bank.addCmTransaction(3, 200);
        bank.addCmTransaction(0, 100);
        bank.addCmTransaction(3, -400);
        bank.addCmTransaction(2, -450);
        bank.addCmTransaction(0, 00);

        assertEquals(112.50, bank.getInAvg());
    }

    @Test
    public void shouldReturnAvgOutCash() {
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCmTransaction(0, 100);
        bank.addCmTransaction(0, -1000);
        bank.addCmTransaction(1, -500);
        bank.addCmTransaction(1, 100);
        bank.addCmTransaction(1, 00);

        assertEquals(-750, bank.getOutAvg());
    }

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransactions();

        assertEquals(0, transaction.length);
    }
    @Test
    public void shouldAddTreeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(200);

        int[] transaction = cashMachine.getTransactions();
        assertEquals(3, transaction.length);
        assertEquals(500, transaction[0]);
        assertEquals(-300, transaction[1]);
        assertEquals(200, transaction[2]);
    }

    @Test
    public void shouldAddZeroTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-0);

        int[] transaction = cashMachine.getTransactions();
        assertEquals(2, transaction.length);
        assertEquals(0, transaction[0]);
        assertEquals(-0, transaction[1]);
    }
    @Test
    public void shouldReturnCorrectSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);

        assertEquals(250, cashMachine.getSaldo());
    }
    @Test
    public void shouldReturnTotalNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(400);

        //assertEquals(4,cashMachine.getNumberOfTransactions());
        assertEquals(4,cashMachine.getNumberOfTransactions());

    }
}