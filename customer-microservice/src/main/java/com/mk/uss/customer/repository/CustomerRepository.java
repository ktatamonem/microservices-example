package com.mk.uss.customer.repository;

import com.mk.uss.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer , Long> {
}
