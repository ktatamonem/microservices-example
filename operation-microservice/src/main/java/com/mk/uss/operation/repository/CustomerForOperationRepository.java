package com.mk.uss.operation.repository;

import com.mk.uss.operation.entities.CustomerForOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerForOperationRepository  extends JpaRepository<CustomerForOperation , Long> {
}
