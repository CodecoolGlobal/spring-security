package com.raczkowski;

public class Client {

    private String clientName;
    private final BankAccount bankAccount;

    public Client(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return String.format("%s has an account at: %s", clientName, bankAccount.getBankName());
    }
}
