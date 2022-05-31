package com.mk.uss.customer.service;


import com.mk.uss.customer.entities.Customer;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id) throws ChangeSetPersister.NotFoundException;

    List<Customer> findAllCustomers()  ;


    Customer saveNew(Customer customer) ;

    Customer updateCustomer(Customer  customer) ;

    void deleteCustomer(Customer  customer) ;

}
