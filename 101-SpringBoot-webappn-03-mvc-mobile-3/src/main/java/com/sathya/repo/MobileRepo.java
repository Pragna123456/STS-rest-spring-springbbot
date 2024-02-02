package com.sathya.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Mobile12;

@Repository
public interface MobileRepo extends CrudRepository<Mobile12, Integer> {

}
