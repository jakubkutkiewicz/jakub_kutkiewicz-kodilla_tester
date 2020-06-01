package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transnactions;
    private int number;

    public CashMachine() {
        this.transnactions = new int[0];
        this.number = 0;
    }

    public void addTransaction(int value) {
        this.number++;
        int[] newTab = new int[this.number];
        System:
        System.arraycopy(transnactions, 0, newTab, 0, transnactions.length);
        newTab[this.number - 1] = value;
        this.transnactions = newTab;
    }

    public int[] getTransnactions() {
        return this.transnactions;
    }
    //saldo
    public double getBalance() {
        int sum = 0;
        for(int i = 0; i < this.transnactions.length; i++) {
            sum += this.transnactions[i];
        }
        return sum;

    }

    //sumuje wszystkie wpłaty
    public int getDeposits() {
        int sumDeposit = 0;
        for(int i = 0; i < this.transnactions.length; i++) {
            if(transnactions[i] > 0) {
                sumDeposit += this.transnactions[i];
            }
        }
        return sumDeposit;
    }

    //liczba transakcji wpłaty
    public int getNumberOfDeposits() {
        int transactionDeposit = 0;
        for(int i = 0; i < this.transnactions.length; i++) {
            if(this.transnactions[i] > 0) {
                transactionDeposit++;
            }
        }
        return transactionDeposit;
    }

    //Sumuje wypłate
    public int getWithdrawal() {
        int sumWithdrawal = 0;
        for(int i = 0; i < this.transnactions.length; i++) {
            if(this.transnactions[i] < 0) {
                sumWithdrawal+= this.transnactions[i];
            }
        }
        return sumWithdrawal;
    }

    //ilośc transakcji wypłaty
    public int getNumberOfWithdrawals() {
        int transactionWithdrawal = 0;
        for(int i = 0; i < this.transnactions.length; i++) {
            if(this.transnactions[i] < 0) {
                transactionWithdrawal++;
            }
        }
        return transactionWithdrawal;
    }

}