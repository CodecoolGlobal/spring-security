package com.raczkowski;

public class BankAccount {

    private final Bank bank;

    public BankAccount(Bank bank) {
        this.bank = bank;
    }

    public String getBankName() {
        return bank.name();
    }
}
