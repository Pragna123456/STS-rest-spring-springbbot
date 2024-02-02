package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Electricity;

public interface ElectricityRepo extends JpaRepository<Electricity, Integer> {

}
