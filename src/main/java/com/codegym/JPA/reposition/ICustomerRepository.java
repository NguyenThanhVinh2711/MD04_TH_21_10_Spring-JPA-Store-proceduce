package com.codegym.JPA.reposition;


import com.codegym.JPA.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
