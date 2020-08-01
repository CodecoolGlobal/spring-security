package com.raczkowski;

import org.springframework.stereotype.Component;


public class BankAccount {

    private final Bank bank;

    public BankAccount(Bank bank) {
        this.bank = bank;
    }

    public String getBankName() {
        return bank.name();
    }
}
