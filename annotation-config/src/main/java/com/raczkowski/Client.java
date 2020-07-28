package com.raczkowski;

import org.springframework.stereotype.Component;

@Component
public class Client {

    private final BankAccount bankAccount;

    public Client(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return String.format("I have an account at: %s", bankAccount.getBankName());
    }
}
