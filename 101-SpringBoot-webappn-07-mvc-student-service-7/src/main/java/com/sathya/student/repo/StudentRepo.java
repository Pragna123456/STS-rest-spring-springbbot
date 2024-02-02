package com.sathya.student.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.model.Student;
import com.sathya.users.entity.Employees01;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
