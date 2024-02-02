package com.rest.service;

import java.util.List;

import com.rest.model.Employee;

public interface EmployeeService {

	public Employee saveRecord(Employee employee);
	public Employee getOneRecord(int eid);
	public List<Employee> getAllRecords();
	public Employee updateRecord(Employee employee,int eid);
	public void deleteRecord(int eid);
}