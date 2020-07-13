package com.ghulam.dao;

import com.ghulam.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    void saveOrUpdate(Customer customer);
    Customer getCustomer(int id);
    void delete(int id);
}
