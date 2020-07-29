package com.raczkowski.model;

public class BankAccount {

    private final Bank bank;

    public BankAccount(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }
}
