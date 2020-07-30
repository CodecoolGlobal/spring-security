package com.raczkowski.controller;

import com.raczkowski.exception.ClientNotFoundException;
import com.raczkowski.model.Client;
import com.raczkowski.service.BankClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClientController {

    private final BankClientService clientService;

    public ClientController(BankClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Hello there!";
    }

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> getClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/client")
    @ResponseBody
    public Client getClient(@RequestParam(name = "id") String id) {
        return clientService.getClient(Integer.parseInt(id))
                .orElseThrow(() -> new ClientNotFoundException(id));
    }

    @ExceptionHandler({ClientNotFoundException.class})
    public ResponseEntity<String> handleException(ClientNotFoundException exception){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
}
