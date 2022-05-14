package com.example.accessingdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccessingDataJpaApplicationTest<E> {
private CustomerRepository<E> customerRepository;
    @Test
    void demo() {
        AccessingDataJpaApplication<E> accessingDataJpaApplication = new AccessingDataJpaApplication<>();
        CommandLineRunner commandLineRunner = accessingDataJpaApplication.demo(customerRepository);
        assertTrue(commandLineRunner.toString().startsWith("com.example.accessingdatajpa.AccessingDataJpaApplication$$Lambda$"));
    }
}