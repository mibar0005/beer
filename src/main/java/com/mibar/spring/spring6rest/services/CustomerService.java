package com.mibar.spring.spring6rest.services;

import com.mibar.spring.spring6rest.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> listAllCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);

    void patchCustomerById(UUID customerId, Customer customer);
}
