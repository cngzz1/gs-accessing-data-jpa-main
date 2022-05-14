//package com.example.accessingdatajpa;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//public class CustomerRepositoryStub<E> implements CustomerRepository<E> {
//    @Override
//    public List<Customer<E>> findByLastName(String lastName) {
//        Customer<E> customer = new Customer<>();
//        return List.of(customer);
//    }
//
//    @Override
//    public Customer<E> findById(long id) {
//        return new Customer<>();
//    }
//
//    @Override
//    public <S extends Customer<E>> S save(S entity) {
//        return entity;
//     }
//
//    @Override
//    public <S extends Customer<E>> Iterable<S> saveAll(Iterable<S> entities) {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public Optional<Customer<E>> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Customer<E>> findAll() {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public Iterable<Customer<E>> findAllById(Iterable<Long> longs) {
//       return Collections.emptyList();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Customer entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Customer<E>> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
