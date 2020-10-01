package com.raczkowski.controller;

import com.raczkowski.dto.CredentialsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class AuthController {

    private final AuthenticationManager authenticationManager;

    public AuthController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping(value = "/login", consumes = APPLICATION_JSON_VALUE)
    public String authenticate(@RequestBody CredentialsDto credentialsDto) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(credentialsDto.getUsername(),
                credentialsDto.getPassword()));

        return "redirect:success";
    }

    @GetMapping(value = "/success")
    @ResponseBody
    public String getSuccessfulAuthenticationMessage() {
        return "Successfully authenticated!";
    }

    @ExceptionHandler(BadCredentialsException.class)
    @ResponseBody
    public ResponseEntity<String> handleException(BadCredentialsException badCredentialsException) {
        return new ResponseEntity<>(badCredentialsException.getMessage(), UNAUTHORIZED);
    }

}
