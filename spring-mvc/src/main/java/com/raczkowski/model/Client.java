package com.raczkowski.model;

public class Client {

    private final int id;
    private final String name;
    private final BankAccount bankAccount;

    public Client(int id, String name, BankAccount bankAccount) {
        this.id = id;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("I have an account at: %s", bankAccount.getBank().name());
    }
}
