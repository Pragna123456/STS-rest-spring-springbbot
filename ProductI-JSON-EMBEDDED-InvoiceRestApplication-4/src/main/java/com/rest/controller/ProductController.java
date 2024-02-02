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

import com.rest.model.Product;
import com.rest.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public String saveData(@RequestBody Product product) {
		Product p1 = productService.saveRecord(product);
		String message = "";
		if(p1!=null) {
			message = "Data inserted successfully";
		}
		else {
			message ="Data insertion failed";
		}
		return message;
	}
	
     @GetMapping("/get/{pid}")
	public Product getOne(@PathVariable int pid) {
	Product get = productService.getOneRecord(pid);
	return get;
	}
	
	
	

	@GetMapping("/getAll")
	public List<Product> getAll(){
	List<Product> products = productService.getAllRecords();
	return products;
}
	
		@DeleteMapping("/delete/{pid}")
	public void delete(@PathVariable int pid) {
		productService.deleteRecord(pid);

	}

	@PutMapping("/update/{pid}")
	public Product update (@RequestBody Product product,@PathVariable int pid)
	
	{
		Product update=productService.updateRecord(product, pid);
	return update;
	}
	
}

