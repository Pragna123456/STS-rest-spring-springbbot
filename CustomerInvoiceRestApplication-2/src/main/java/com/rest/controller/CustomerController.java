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

import com.rest.model.Customer;
import com.rest.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public String saveData(@RequestBody Customer customer) {
		Customer c1 = customerService.saveRecord(customer);
		String message = "";
		if(c1!=null) {
			message = "Data inserted successfully";
		}
		else {
			message ="Data insertion failed";
		}
		return message;
	}
	
     @GetMapping("/get/{cid}")
	public Customer getOne(@PathVariable int cid) {
	Customer get = customerService.getOneRecord(cid);
	return get;
	}
	
	
	

	@GetMapping("/getAll")
	public List<Customer> getAll(){
	List<Customer> customers = customerService.getAllRecords();
	return customers;
}
	
		@DeleteMapping("/delete/{cid}")
	public void delete(@PathVariable int cid) {
		customerService.deleteRecord(cid);

	}

	@PutMapping("/update/{cid}")
	public Customer update (@RequestBody Customer customer,@PathVariable int cid)
	
	{
		Customer update=customerService.updateRecord(customer, cid);
	return update;
	}
	
}

