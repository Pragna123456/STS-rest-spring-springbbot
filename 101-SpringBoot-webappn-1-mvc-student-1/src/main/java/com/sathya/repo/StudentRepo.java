package com.sathya.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Student12;

@Repository
public interface StudentRepo extends CrudRepository<Student12, Integer> {

}
