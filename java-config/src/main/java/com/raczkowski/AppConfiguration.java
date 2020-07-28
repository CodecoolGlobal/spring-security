package com.raczkowski;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Client client() {
        return new Client(bankAccount());
    }

    @Bean
    public BankAccount bankAccount() {
        return new BankAccount(bank());
    }

    @Bean
    public Bank bank() {
        return Bank.LLOYD;
    }
}
