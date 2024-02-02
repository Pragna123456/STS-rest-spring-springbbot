package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Customer;
import com.rest.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {
 
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer saveRecord(Customer customer) {

		
          int price=customer.getPrice();
        	int quantity=customer.getQuantity();
		double totalbill=0.0;
		double invoice=0.0;double discount=0.0;double gst=10;
		
		
		totalbill=price*quantity;

			 
		if(totalbill > 2500)
		{
			discount=0.1;
		}
		 
		else if(totalbill<=2500 && totalbill >5500)
			{
				discount=1.5;
			}

			else
			{
				discount=2.5;
			}
		discount = totalbill * (discount / 100.0);
			
		gst=gst*totalbill;
			invoice=totalbill-discount+gst;

		customer.setInvoice(invoice);
		Customer c=customerRepo.save(customer);
		
		return c;
	}

	@Override
	public Customer getOneRecord(int cid) {
   Customer customer=customerRepo.findById(cid).get();
   
		return customer;
	}

	@Override
	public List<Customer> getAllRecords() {
       List<Customer>customers=customerRepo.findAll();
		return customers;
	}

	@Override
	public Customer updateRecord(Customer customer, int cid) {
     Customer oldRecord=customerRepo.findById(cid).get();
     oldRecord.setCname(customer.getCname());
     oldRecord.setMobile(customer.getMobile());
     oldRecord.setPrice(customer.getPrice());
     oldRecord.setQuantity(customer.getQuantity());
		


     int price=customer.getPrice();
   	int quantity=customer.getQuantity();	double totalbill=0.0;
	double invoice=0.0;double discount=0.0;double gst=10;
	
	
	totalbill=price*quantity;

		 
	if(totalbill > 2500)
	{
		discount=0.1;
	}
	 
	else if(totalbill<=2500 && totalbill >5500)
		{
			discount=1.5;
		}

		else
		{
			discount=2.5;
		}
	discount = totalbill * (discount / 100.0);
		
		
	gst=gst*totalbill;

		invoice=totalbill-discount+gst;
		oldRecord.setPrice(price);
		oldRecord.setInvoice(invoice);
		Customer c=customerRepo.save(oldRecord);

		
		return c;
	}

	@Override
	public void deleteRecord(int cid) {
    customerRepo.deleteById(cid);
	}

}
