package com.raczkowski.service;

import com.raczkowski.dao.ClientDao;
import com.raczkowski.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankClientService {

    private ClientDao clientDao;

    public BankClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public List<Client> getAllClients(){
        return clientDao.getClients();
    }

    public Optional<Client> getClient(int id){
        return clientDao.getClients().stream()
                .filter(client -> client.getId() == id)
                .findFirst();
    }

}
