package com.swadeep.customer.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.swadeep.customer.dal.entities.Customer;

public interface CustomerRepository extends  CrudRepository<Customer, Long> {

}
