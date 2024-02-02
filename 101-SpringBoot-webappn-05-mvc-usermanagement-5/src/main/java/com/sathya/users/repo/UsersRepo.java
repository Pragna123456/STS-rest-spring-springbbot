package com.sathya.users.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.users.entity.Users01;

@Repository
public interface UsersRepo extends CrudRepository<Users01, Integer> {

}
