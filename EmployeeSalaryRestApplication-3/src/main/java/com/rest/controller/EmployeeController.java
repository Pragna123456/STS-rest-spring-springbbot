package com.rest.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Employee;
import com.rest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public String saveData(@RequestBody Employee employee) {
		Employee c1 = employeeService.saveRecord(employee);
		String message = "";
		if(c1!=null) {
			message = "Data inserted successfully";
		}
		else {
			message ="Data insertion failed";
		}
		return message;
	}
	
    @GetMapping("/get/{eid}")
	public Employee getOne(@PathVariable int eid) {
	Employee get = employeeService.getOneRecord(eid);
	return get;
	}
	
	
	

	@GetMapping("/getAll")
	public List<Employee> getAll(){
	List<Employee> employees = employeeService.getAllRecords();
	return employees;
}
	
		@DeleteMapping("/delete/{eid}")
	public void delete(@PathVariable int eid) {
		employeeService.deleteRecord(eid);

	}


	@PutMapping("/update/{eid}")
	public Employee update (@RequestBody Employee employee,@PathVariable int eid)
	
	{
		Employee update=employeeService.updateRecord(employee, eid);
	return update;
	} 
	
}

