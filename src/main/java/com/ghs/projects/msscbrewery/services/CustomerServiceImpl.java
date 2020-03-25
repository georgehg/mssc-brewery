package com.ghs.projects.msscbrewery.services;

import com.ghs.projects.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.of(customerId, "João da Silva");
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.of(UUID.randomUUID(), customerDto.getName());
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        CustomerDto.of(customerId, customerDto.getName());
    }

    @Override
    public void deleteCustomer(UUID customerId) {

    }

}
