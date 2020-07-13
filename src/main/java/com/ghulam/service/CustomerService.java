package com.ghulam.service;

import com.ghulam.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    void saveOrUpdate(Customer customer);
    Customer getCustomer(int id);
    void delete(int id);
}
