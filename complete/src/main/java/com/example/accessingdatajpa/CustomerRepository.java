package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository<E> extends CrudRepository<Customer<E>, Long> {

	List<Customer<E>> findByLastName(String lastName);

	Customer<E> findById(long id);
}
