package com.codegym.cms.repository.CustomerRepository;

import com.codegym.cms.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void delete(Long id);
}
