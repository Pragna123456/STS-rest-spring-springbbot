package com.sathya.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Book12;

@Repository
public interface BookRepo extends CrudRepository<Book12, Integer> {

}
