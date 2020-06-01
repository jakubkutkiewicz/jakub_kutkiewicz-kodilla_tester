package com.kodilla.bank.homework;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {

    @Test
    public void sumaDepo(){
CashMachine cashMachine = new CashMachine();

cashMachine.addTransaction(200);
cashMachine.addTransaction(200);


Assertions.assertEquals(400,cashMachine.getDeposits());
}
@Test
    public void numberOfWithdrawals() {
    CashMachine cashMachine = new CashMachine();
    cashMachine.addTransaction(100);
    cashMachine.addTransaction(-200);
    Assertions.assertEquals(1, cashMachine.getNumberOfWithdrawals(), 0.001);
}

    @Test
    public void addTransaction(){
    CashMachine cashMachine = new CashMachine();
    cashMachine.addTransaction(100);
    cashMachine.addTransaction(200);

    int[] deposit = cashMachine.getTransnactions();
        assertEquals(2, deposit.length);
        assertEquals(100, deposit[0]);
        assertEquals(200, deposit[1]);
}
@Test
    public void numberOfDepo() {
    CashMachine cashMachine = new CashMachine();
    cashMachine.addTransaction(-100);
    cashMachine.addTransaction(200);
    Assertions.assertEquals(1, cashMachine.getNumberOfDeposits(), 0.01);
}
@Test
    public void acountBalance(){
    CashMachine cashMachine = new CashMachine();
    cashMachine.addTransaction(-100);
    cashMachine.addTransaction(-200);
    cashMachine.addTransaction(400);
    cashMachine.addTransaction(200);
    Assertions.assertEquals(300,cashMachine.getBalance(),0.01);
}
    @Test
    public void averageDepo() {
        Bank bank = new Bank();
        bank.ADDATM1(-100);
        bank.ADDATM2(50);
        bank.ADDATM3(50);
        bank.ADDATM2(200);
        Assertions.assertEquals(100, bank.getAverageAllDeposits(), 0.01);
    }
    @Test
    public void averageDepo0(){
        Bank bank = new Bank();
        bank.ADDATM1(-100);
        bank.ADDATM2(-50);
        bank.ADDATM3( -50);
        bank.ADDATM2( -200);
        Assertions.assertEquals(0, bank.getAverageAllDeposits(), 0.01);
    }
    @Test
    public void averageWith(){
        Bank bank = new Bank();
        bank.ADDATM1(-200);
        bank.ADDATM2(-50);
        bank.ADDATM3( -50);
        bank.ADDATM2( 200);
        Assertions.assertEquals(-100, bank.getAverageAllWithdrawals(), 0.01);
    }
    @Test
    public void averageWith0() {
        Bank bank = new Bank();
        bank.ADDATM1(200);
        bank.ADDATM2(50);
        bank.ADDATM3(50);
        bank.ADDATM2(200);
        Assertions.assertEquals(0, bank.getAverageAllWithdrawals(), 0.01);
    }

}

///