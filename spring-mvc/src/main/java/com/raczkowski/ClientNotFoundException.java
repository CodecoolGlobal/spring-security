package com.raczkowski;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String id) {
        super(String.format("Client doesn't exist for given id: %s", id));
    }
}
