package com.raczkowski.exception;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String id) {
        super(String.format("Client doesn't exist for given id: %s", id));
    }
}
