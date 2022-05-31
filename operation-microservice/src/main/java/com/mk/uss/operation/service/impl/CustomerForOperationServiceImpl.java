package com.mk.uss.operation.service.impl;

import com.mk.uss.operation.entities.CustomerForOperation;
import com.mk.uss.operation.repository.CustomerForOperationRepository;
import com.mk.uss.operation.service.CustomerForOperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerForOperationServiceImpl implements CustomerForOperationService {

    @Autowired
    private CustomerForOperationRepository customerForOperationRepository  ;

    @Override
    public CustomerForOperation save(CustomerForOperation customer) {
        return customerForOperationRepository.save(customer);
    }
}
