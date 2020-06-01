package com.kodilla.bank.homework;

public class Bank {
    private CashMachine ATM1;
    private CashMachine ATM2;
    private CashMachine ATM3;

    public Bank() {
        this.ATM1 = new CashMachine();
        this.ATM2 = new CashMachine();
        this.ATM3 = new CashMachine();
    }

    public void ADDATM1(int cash) {
        this.ATM1.addTransaction(cash);
    }

    public void ADDATM2(int cash) {
        this.ATM2.addTransaction(cash);
    }

    public void ADDATM3(int cash) {
        this.ATM3.addTransaction(cash);
    }

    public double totalBalance() {
        return this.ATM1.getBalance() + this.ATM2.getBalance() + this.ATM3.getBalance();

    }

    //wartość transakcji związanych z wypłatą
    public double withdrawATM1() {
        return this.ATM1.getWithdrawal();
    }

    public double withdrawATM2() {
        return this.ATM2.getWithdrawal();
    }

    public double withdrawATM3() {
        return this.ATM3.getWithdrawal();
    }

    //iloścć wszystkich transakcji wypłaty
    public int totalWithdrawalsATM1() { return this.ATM1.getNumberOfWithdrawals(); }
    public int totalWithdrawalsATM2() { return this.ATM2.getNumberOfWithdrawals(); }
    public int totalWithdrawalsATM3() { return this.ATM3.getNumberOfWithdrawals(); }


    public int getNumWithdrawals() {
        int totalTransaction = totalWithdrawalsATM1() +
                totalWithdrawalsATM2() +
                totalWithdrawalsATM3();
        return totalTransaction;

        }
        //srednia wypłat
        public double getAverageAllWithdrawals () {
            double average = withdrawATM1() +
                    withdrawATM2() +
                    withdrawATM3();

            if (getNumWithdrawals() == 0) {
                return 0;
            } else {
                return average / getNumWithdrawals();
            }
        }
//wpłaty

    public double depositATM1() {
        return this.ATM1.getDeposits();
    }
    public double depositATM2() {
        return this.ATM2.getDeposits();
    }
    public double depositATM3() {
        return this.ATM3.getDeposits();
    }
    //ilość wpłat
    public double numDepositATM1() {return this.ATM1.getNumberOfDeposits();}
    public double numDepositATM2() { return this.ATM2.getNumberOfDeposits(); }
    public double numDepositATM3() { return this.ATM3.getNumberOfDeposits(); }

    public double totalNumDeposits() {
        double totalDeposits = numDepositATM1()+numDepositATM2()+numDepositATM3();
        return totalDeposits;

    }
    public double getAverageAllDeposits() {

        double average = depositATM1() + depositATM2() +
               depositATM3();

        if(totalNumDeposits() == 0) {
            return 0;
        } else {
            return average / totalNumDeposits();
        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.ADDATM1(100);
        bank.ADDATM2(-100);
        bank.ADDATM3(100);

        bank.ADDATM3(200);
        bank.ADDATM2(-50);
        bank.ADDATM1(100);

        System.out.println(bank.totalBalance()+" saldo łaczne");

        System.out.println(bank.totalNumDeposits()+" liczba depozytów");

        System.out.println(bank.getAverageAllDeposits()+" średnia depozytów");

        System.out.println(bank.getNumWithdrawals()+" liczba wypłat");

        System.out.println(bank.getAverageAllWithdrawals()+ " srednia wypłat");

    }}