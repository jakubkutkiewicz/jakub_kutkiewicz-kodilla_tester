package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] cm;
    public int size;


    public Bank() {
        this.cm = new CashMachine[0];

    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] tempTab = new CashMachine[this.size];
        System.arraycopy(cm, 0, tempTab, 0, cm.length);
        tempTab[this.size - 1] = cashMachine;
        this.cm = tempTab;
    }

    public void addCmTransaction(int size, int value) {
        if (value != 0) {
            this.cm[size].addTransaction(value);
        }
    }

    public double getInCashCm() {   //tak pozostałe

        double sumInCm = 0;
        for (CashMachine machinetemp : cm) {

            sumInCm = sumInCm + machinetemp.sumTransactionIN();
        }
        return sumInCm;
    }

    public int getOutCashCm() {
        int sumOutCm = 0;
        for (CashMachine machinetemp :cm) {

                sumOutCm = sumOutCm + machinetemp.sumTransactionOUT();
        }
        return sumOutCm;
    }

    public int getInCountCm() {
        int count = 0;
        for (int i = 0; i < 5; i++ ) {
            CashMachine temp =cm[i];
            if (temp != null) {
                count += temp.sumTransactionIN();
            }
        }
        return count;
    }

    public int getOutCountCm() {
        int count = 0;
        for (int i = 0; i <5; i++) {
            CashMachine temp = cm[i];
            if (temp != null) {
                count += temp.sumTransactionOUT();
            }
        }
        return count;
    }

    public double getInAvg() {
        double inCash = 0.0;
        double inCount = 0.0;
        Bank bank = new Bank();
        for (CashMachine cm : cm
        ) {
            inCount = inCount + bank.getInCountCm();
        }

        for (CashMachine cmCash : cm
        ) {
            inCash = inCash + bank.getInCashCm();
        }
        if (inCount != 0)
            return inCash / inCount;
        else
            return 0.0;
    }

    public double getOutAvg() {
        double outCash = 0.0;
        double outCount = 0.0;
        Bank bank = new Bank();
        for (CashMachine cm : cm
        ) {
            outCount = outCount + bank.getOutCountCm();
        }

        for (CashMachine cmCash : cm
        ) {
            outCash = outCash + bank.getOutCashCm();
        }
        if (outCount != 0)
            return outCash / outCount;
        else
            return 0.0;
    }

    public int getBalance() {
        int balance = 0;
        for (CashMachine cmSaldo : cm) {
            balance += cmSaldo.getBalance();
        }

        return balance;
    }


    public double getInAll() {
        Bank bank = new Bank();
        double inAll = 0.0;
        for (CashMachine cm : cm
        ) {
            inAll = inAll + bank.getInCountCm();
        }
        return inAll;
    }

    public double getOutAll() {
        Bank bank = new Bank();
        double outAll = 0.0;
        for (CashMachine cm : cm
        ) {
            outAll = outAll + bank.getOutCountCm();
        }
        return outAll;
    }
}