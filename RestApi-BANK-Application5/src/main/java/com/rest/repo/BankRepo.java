package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
