package com.sathya.users.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.users.entity.Employees01;

@Repository
public interface EmployeesRepo extends CrudRepository<Employees01, Integer> {

}
