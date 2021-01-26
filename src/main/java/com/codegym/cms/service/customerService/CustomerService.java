package com.codegym.cms.service.customerService;

import com.codegym.cms.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void delete(Long id);

    void save(Customer customer);
}
