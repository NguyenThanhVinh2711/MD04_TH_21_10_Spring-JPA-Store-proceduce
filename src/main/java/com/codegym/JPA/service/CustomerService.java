package com.codegym.JPA.service;


import com.codegym.JPA.model.Customer;
import com.codegym.JPA.reposition.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}

