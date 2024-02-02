package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
