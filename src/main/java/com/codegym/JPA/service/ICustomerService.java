package com.codegym.JPA.service;

import com.codegym.JPA.model.Customer;
public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
