package com.sathya.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Employee01;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee01, Integer> {

}
