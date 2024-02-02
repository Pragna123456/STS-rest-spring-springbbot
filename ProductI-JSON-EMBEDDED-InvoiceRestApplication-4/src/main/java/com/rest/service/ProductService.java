package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {

	public Product saveRecord(Product product);
	public Product getOneRecord(int pid);
	public List<Product> getAllRecords();
	public Product updateRecord(Product product,int pid);
	public void deleteRecord(int pid);
}