package com.raczkowski.dao;

import com.raczkowski.model.Bank;
import com.raczkowski.model.BankAccount;
import com.raczkowski.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class InMemoryClientDao implements ClientDao {
    private final List<Client> clients = Stream.of(
            new Client(1, "Przemek Raczkowski", new BankAccount(Bank.LLOYD)),
            new Client(2, "Tomasz Hajto", new BankAccount(Bank.CHASE)))
            .collect(Collectors.toList());

    @Override
    public List<Client> getClients() {
        return clients;
    }
}
