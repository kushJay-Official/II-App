package com.iispring.iiapp;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRespository extends CrudRepository<Customer, Integer> {
    Customer findCustomerById(Integer id);
}
